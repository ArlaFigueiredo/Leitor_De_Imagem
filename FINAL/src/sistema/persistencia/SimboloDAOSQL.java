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

import sistema.model.entity.Simbolo;
import sistema.model.exception.SimboloInexistenteException;

public class SimboloDAOSQL implements SimboloDAOIF{

	private static final String URI = "jdbc:hsqldb:hsql://localhost/";
	private static final String USER = "SA";
	private static final String PWD = "";
	
	private static final String CREATE_TABLE = "CREATE TABLE simbolo (\n" + 
			"   id INT NOT NULL,\n" + 
			"   nome VARCHAR(20) NOT NULL,\n" + 
			"   PRIMARY KEY (id) \n" + 
			");";
	private static final String SIMBOLO_INSERT = "INSERT INTO simbolo(id, nome) VALUES (?, ?)";
	private static final String SIMBOLO_SELECT_BY_ID = "SELECT id, nome FROM simbolo WHERE id = ?";
	private static final String SIMBOLO_SELECT_ALL = "SELECT id, nome FROM simbolo";
	
	public SimboloDAOSQL() throws SQLException {
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
	}
	
	private Connection getConn() throws SQLException {
		return  DriverManager.getConnection(SimboloDAOSQL.URI, SimboloDAOSQL.USER, SimboloDAOSQL.PWD); 
	}
	
	public void inserir(Simbolo s) throws Exception {
		PreparedStatement pStmt = this.getConn().prepareStatement(SIMBOLO_INSERT);
		pStmt.setInt(1, s.getId());
		pStmt.setString(2, s.getNome());
		pStmt.executeUpdate();
	}
	
	
	public Simbolo findById(int id) throws Exception {
		
		PreparedStatement pStmt = this.getConn().prepareStatement(SIMBOLO_SELECT_BY_ID);
		pStmt.setInt(1, id);
		ResultSet rSet = pStmt.executeQuery();
		if(!rSet.next())
			throw new SimboloInexistenteException(id);
		
		String sId = rSet.getString("id");
		String nome = rSet.getString("nome");

		Simbolo s = new Simbolo(sId, nome);
		
		return s;
	}
	
	
	public Collection<Simbolo> findAll() throws Exception {
		
		Set<Simbolo> simbolos = new HashSet<Simbolo>();
		PreparedStatement pStmt = this.getConn().prepareStatement(SIMBOLO_SELECT_ALL);
		ResultSet rSet = pStmt.executeQuery();
		while(rSet.next()) {
			int id = rSet.getInt("id");
			String nome = rSet.getString("nome");
			Simbolo s = new Simbolo(id, nome);
			simbolos.add(s);
			
		}
		return simbolos;
	}
	
	public void createTable() throws Exception {
		PreparedStatement pStmt = this.getConn().prepareStatement(CREATE_TABLE);
		pStmt.executeUpdate();
	}

	//public static void main(String[] args) throws Exception {
		
		//Collection<Simbolo> simbolos = new HashSet<Simbolo>();
		//SimboloDAOSQL s = new SimboloDAOSQL();
		//simbolos = s.findAll();
		//System.out.println(simbolos);
	//}
}
