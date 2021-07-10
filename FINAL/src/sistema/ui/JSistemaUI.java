package sistema.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sistema.model.Sistema;
import sistema.model.SistemaLogicaIF;

public class JSistemaUI extends JFrame implements ActionListener{
	
	private SistemaLogicaIF logica;
	private Collection<String> elementos;
	
	private JButton btnAnalisar;
	//private JComboBox<String> cmbElementos;	
	private String[] elementosStrings = { "Floresta", "Aguas e Charcos", "Area Proibida", "Zona Constuida", "Area Publica" };
	private JComboBox elementoList = new JComboBox(this.elementosStrings);
	
	public JContabilUI() throws Exception {
		this.logica = new Sistema();
		//this.nomeElementos = this.logica.getNomeElementos();
	}
	
	protected void montar() {
		JPanel jPanelCenter = new JPanel();
		JPanel jPanelSouth = new JPanel();
		this.btnAnalisar = new JButton("Analisar"); 
		this.btnAnalisar.addActionListener(this);
		
		//Montando o panel na area sul onde vai ancorar o botão
		jPanelSouth.setLayout(new GridLayout(2, 3));
		jPanelSouth.add(new JPanel());
		jPanelSouth.add(new JPanel());
		jPanelSouth.add(new JPanel());
		jPanelSouth.add(new JPanel());
		jPanelSouth.add(btnAnalisar);
		jPanelSouth.add(new JPanel());

		//Montando a area central com os campos (Labels e Texts)
		jPanelCenter.setLayout(new GridLayout(1, 2));
		jPanelCenter.add(new JLabel("Selecione o tipo de elemento:"));
		//this.cmbElementos = new JComboBox<String>();
		//this.loadCombo(this.cmbElementos);
		jPanelCenter.add(this.elementoList);		
		
		
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(jPanelCenter, BorderLayout.CENTER);
		this.getContentPane().add(jPanelSouth, BorderLayout.SOUTH);
//		this.getContentPane().add(btnRegistrar, BorderLayout.SOUTH);
		
		this.setTitle("Analisar Mapa");
		this.setSize(800, 600);
	}
	
	public void run() {
		this.montar();
		this.setVisible(true);
	}	
	
	public static void main(String[] args) throws Exception {
		(new JSistemaUI()).run();  
	}	
	
}