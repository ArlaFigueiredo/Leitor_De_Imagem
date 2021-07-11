package sistema.persistencia;

import java.sql.SQLException;

import sistema.model.entity.Simbolo;
import sistema.persistencia.SimboloDAOSQL;

public class InclusorDeSimbolos {
    
    public void populandoTabelaSimbolos() throws Exception{
    	SimboloDAOSQL simboloDAO = new SimboloDAOSQL();
    	
    	SimboloDAOSQL.inserir(new Simbolo(1, "FLORESTA",);
    	SimboloDAOSQL.inserir(new Simbolo(2, "AGUAS E CHARCOS");
    	SimboloDAOSQL.inserir(new Simbolo(3, "AREA PROIBIDA");
    	SimboloDAOSQL.inserir(new Simbolo(4, "ZONA CONSTRUIDA");
    	SimboloDAOSQL.inserir(new Simbolo(5, "AREA PUBLICA");  
    }

}
