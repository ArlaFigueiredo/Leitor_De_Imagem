package sistema.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import sistema.model.Sistema;
import sistema.model.SistemaLogicaIF;

public class JSistemaUI extends JFrame implements ActionListener{
	
	private SistemaLogicaIF logica;
	private Collection<String> nomeElementos;
	
	private JButton btnAnalisar;
	private JButton btnBrowser;
	
	private JComboBox<String> cmbElementos;
	//private JComboBox elementoList;
	
	private JTextField txtCaminho;
	
	
	public JSistemaUI() throws Exception {
		this.logica = new Sistema();
		this.nomeElementos = this.logica.getElementos();
	}
	
	
	private void initComponents(){
		// Botoes
		this.btnBrowser = new JButton("Browser");
		this.btnAnalisar = new JButton("Analisar"); 
		
		// TextFilds
		this.txtCaminho = new JTextField(); 
		
		// DropDown
		//String[] elementosStrings = { "Floresta", "Aguas e Charcos", "Area Proibida", "Zona Constuida", "Area Publica" };
		//this.elementoList = new JComboBox(elementosStrings);
		this.cmbElementos = new JComboBox<String>();
		this.loadCombo(this.cmbElementos);	
		
    }
	
	protected void configLayout(){
		
		// Incluindo areas da tela
		JPanel jPanelCenter = new JPanel();
		JPanel jPanelSouth = new JPanel();
		
		
		jPanelCenter.setLayout(new GridLayout(6, 4));
		
		// Montando espaçamento em cima
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		
		// Inclusor do caminho da imagem
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JLabel("Informe o caminho do arquivo:"));
		jPanelCenter.add(this.txtCaminho);
		jPanelCenter.add(btnBrowser);
		
		// Montando espaçamento meio
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		
		
		// Incluindo dropdown elementos
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JLabel("Selecione o tipo de elemento:"));
		jPanelCenter.add(this.cmbElementos);
		jPanelCenter.add(new JPanel());
		
		// Montando espaçamento final
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		jPanelCenter.add(new JPanel());
		
		
		//Montando o panel na area sul onde vai ancorar o botão
		jPanelSouth.setLayout(new GridLayout(2, 3));
		jPanelSouth.add(new JPanel());
		jPanelSouth.add(new JPanel());
		jPanelSouth.add(new JPanel());
		jPanelSouth.add(new JPanel());
		
		jPanelSouth.add(btnAnalisar);
		jPanelSouth.add(new JPanel());
		
		// Setando layout
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(jPanelCenter, BorderLayout.CENTER);
		this.getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
		this.setTitle("Analisar Mapa");
		this.setSize(800, 600);	
	}
	
	
	private void loadCombo(JComboBox combo) {
		for(String nomeElemento : this.nomeElementos)
			combo.addItem(nomeElemento);
	}
	
	protected void configEvents() {
		this.btnAnalisar.addActionListener(this);
		this.btnBrowser.addActionListener(this);
	}

	public void run() {
		initComponents();
        configEvents();
        configLayout();
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
			
		if( e.getSource() == this.btnBrowser){
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			int result = fileChooser.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
			    File selectedFile = fileChooser.getSelectedFile();
			    this.txtCaminho.setText(selectedFile.getAbsolutePath());
			}
		}
		else if (e.getSource() == this.btnAnalisar){
			try {
				String elemento = (String) this.cmbElementos.getSelectedItem();
				String caminhoArquivo = this.txtCaminho.getText();
				Collection<String> resultado = this.logica.analisaArquivo(caminhoArquivo, elemento);
				JOptionPane.showMessageDialog(this,
						resultado);			
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this,
					    "Erro: " + e.getMessage(),
					    "Erro na análise da imagem",
					    JOptionPane.ERROR_MESSAGE);			
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		(new JSistemaUI()).run();  
	}

}