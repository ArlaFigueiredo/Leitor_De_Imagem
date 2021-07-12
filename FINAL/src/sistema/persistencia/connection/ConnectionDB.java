package sistema.persistencia.connection;

import sistema.model.entity.Simbolo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
	
	private static final String URI = "jdbc:hsqldb:hsql://localhost/";
	private static final String USER = "SA";
	private static final String PWD = "";
	
	public ConnectionDB() throws SQLException {
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
	}
	
	public Connection getConn() throws SQLException {
		return  DriverManager.getConnection(ConnectionDB.URI, ConnectionDB.USER, ConnectionDB.PWD); 
	}
	
}