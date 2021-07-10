package sistema.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import sistema.model.entity.CorRGB;
import sistema.model.entity.Cor;
import sistema.model.entity.CorCMYK;
import sistema.model.TipoCor;
import sistema.model.exception.CorInexistenteException;

public class CorDAOSQL implements CorDAOIF{

	private static final String URI = "jdbc:hsqldb:hsql://localhost/";
	private static final String USER = "SA";
	private static final String PWD = "";
	
	private static final String CREATE_TABLE = "CREATE TABLE cor (\n" + 
			"   id VARCHAR(50) NOT NULL,\n" + 
			"   nome VARCHAR(20) NOT NULL,\n" + 
			"   simbolo VARCHAR(50) NOT NULL,\n" + 
			"   red INT,\n" + 
			"   green INT,\n" + 
			"   blue INT,\n" + 
			"   cyan INT,\n" + 
			"   magenta INT,\n" + 
			"   yellow INT,\n" + 
			"   key INT,\n" + 
			"   formato_cor INT,\n" + 
			"   PRIMARY KEY (id) \n" + 
			");";
			
	private static final String COR_INSERT = "INSERT INTO cor(id, nome, simbolo, red, green, blue, cyan, magenta, yellow, key, formato_cor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String COR_SELECT_BY_NAME = "SELECT id, nome, simbolo, red, green, blue, cyan, magenta, yellow, key, formato_cor FROM cor WHERE nome = ?";
	private static final String COR_SELECT_BY_SIMBOLO = "SELECT id, nome, simbolo, red, green, blue, cyan, magenta, yellow, key, formato_cor FROM cor WHERE simbolo = ?";
	private int tipo;
	
	public CorDAOSQL() throws SQLException {
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
	}
	
	
	private Connection getConn() throws SQLException {
		return  DriverManager.getConnection(CorDAOSQL.URI, CorDAOSQL.USER, CorDAOSQL.PWD); 
	}
	
	
	public void inserir(Cor c) throws Exception {
		PreparedStatement pStmt = this.getConn().prepareStatement(COR_INSERT);
		pStmt.setString(1, c.getId());
		pStmt.setString(2, c.getNome());
		pStmt.setString(3, c.getSimbolo());
		
		if(c instanceof CorRGB) {
			CorRGB cor = (CorRGB) c;
			pStmt.setInt(4, cor.getRed());
			pStmt.setInt(5, cor.getGreen());
			pStmt.setInt(6, cor.getBlue());
			pStmt.setInt(7, 0);
			pStmt.setInt(8, 0);
			pStmt.setInt(9, 0);
			pStmt.setInt(10, 0);
			pStmt.setInt(11, TipoCor.CorRGB.value());
		}
		else if (c instanceof CorCMYK) {
			CorCMYK cor = (CorCMYK) c;
			pStmt.setInt(4, 0);
			pStmt.setInt(5, 0);
			pStmt.setInt(6, 0);
			pStmt.setInt(7, cor.getCyan());
			pStmt.setInt(8, cor.getMagenta());
			pStmt.setInt(9, cor.getYellow());
			pStmt.setInt(10, cor.getKey());
			pStmt.setInt(11, TipoCor.CorCMYK.value());
		}
		pStmt.executeUpdate();
	}
	
	
	public Cor findByName(String nome) throws Exception {
		Cor c = null;
		PreparedStatement pStmt = this.getConn().prepareStatement(COR_SELECT_BY_NAME);
		pStmt.setString(1, nome);
		ResultSet rSet = pStmt.executeQuery();
		if(!rSet.next())
			throw new CorInexistenteException(nome);
		
		String id = rSet.getString("id");
		String sNome = rSet.getString("nome");
		String simbolo = rSet.getString("simbolo");
		
		int formato_cor = rSet.getInt("formato_cor");
		
		if(formato_cor == TipoCor.CorRGB.value()) {
			int red = rSet.getInt("red");
			int green = rSet.getInt("green");
			int blue = rSet.getInt("blue");
			
			c = new CorRGB(id, simbolo, sNome, red, green, blue);
		}
		else if(tipo == TipoCor.CorCMYK.value()){
			int cyan = rSet.getInt("cyan");
			int magenta = rSet.getInt("magenta");
			int yellow = rSet.getInt("yellow");
			int key = rSet.getInt("key");
			
			c = new CorCMYK(id, simbolo, sNome, cyan, magenta, yellow, key);
		}
		
		return c;
	}
	
	
	public Collection<Cor> findBySimbolo(String simbolo) throws Exception {
		Set<Cor> cores = new HashSet<Cor>();
		PreparedStatement pStmt = this.getConn().prepareStatement(COR_SELECT_BY_SIMBOLO);
		pStmt.setString(1, simbolo);
		ResultSet rSet = pStmt.executeQuery();
		while(rSet.next()) {
			Cor c = null;
			
			String id = rSet.getString("id");
			String sNome = rSet.getString("nome");
			simbolo = rSet.getString("simbolo");
			
			int formato_cor = rSet.getInt("formato_cor");
			
			if(formato_cor == TipoCor.CorRGB.value()) {
				int red = rSet.getInt("red");
				int green = rSet.getInt("green");
				int blue = rSet.getInt("blue");
				
				c = new CorRGB(id, simbolo, sNome, red, green, blue);
				cores.add(c);
			}
			else if(tipo == TipoCor.CorCMYK.value()){
				int cyan = rSet.getInt("cyan");
				int magenta = rSet.getInt("magenta");
				int yellow = rSet.getInt("yellow");
				int key = rSet.getInt("key");
				
				c = new CorCMYK(id, simbolo, sNome, cyan, magenta, yellow, key);
				cores.add(c);
			}
		}
		return cores;
	}

	public static void main(String[] args) throws Exception {
		//PreparedStatement pStmt = conn.prepareStatement(CREATE_TABLE);
		//pStmt.executeUpdate();
		Collection<Cor> minhasCores = new HashSet<Cor>();
		
		CorDAOSQL cor = new CorDAOSQL();
		minhasCores = cor.findBySimbolo("FLORESTA");
		System.out.println(minhasCores);
	}
	
}
