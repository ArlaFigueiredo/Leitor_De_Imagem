package sistema.persistencia.feeder;

import java.sql.SQLException;

import sistema.model.entity.Simbolo;
import sistema.persistencia.SimboloDAOSQL;

public class InclusorDeSimbolos {
    
    public void populandoTabelaSimbolos() throws Exception{
    	SimboloDAOSQL simboloDAO = new SimboloDAOSQL();
    	
    	simboloDAO.inserir(new Simbolo(1, "FLORESTA"));
    	simboloDAO.inserir(new Simbolo(2, "AGUAS E CHARCOS"));
    	simboloDAO.inserir(new Simbolo(3, "AREA PROIBIDA"));
    	simboloDAO.inserir(new Simbolo(4, "ZONA CONSTRUIDA"));
    	simboloDAO.inserir(new Simbolo(5, "AREA PUBLICA"));  
    }
    
    public static void main(String[] args) {
    	InclusorDeSimbolos IDS = new InclusorDeSimbolos();
    	try {
			IDS.populandoTabelaSimbolos();
		} catch (Exception e) {
			System.out.println("Erro ao inserir na tabela simbolos");
			e.printStackTrace();
		}
	}

}
