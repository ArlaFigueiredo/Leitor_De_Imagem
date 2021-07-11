package sistema.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import sistema.model.entity.Cor;
import sistema.model.entity.Simbolo;
import sistema.persistencia.CorDAOSQL;
import sistema.persistencia.MapaDAOFILE;
import sistema.persistencia.SimboloDAOSQL;

public class Sistema implements SistemaLogicaIF{   
    
    
    public Collection<String> AnalisaArquivo(String caminhoArquivo, String elemento) throws Exception{
    	// Convertendo arquivo para objeto Mapa
    	MapaDAOFILE mapaDAO = new MapaDAOFILE();
    	Mapa mapa = mapaDAO.ler(caminhoArquivo);
    	
    	//Buscando cores de acordo com elemento no banco
    	SimboloDAOSQL simboloDAO = new SimboloDAOSQL();
    	CorDAOSQL corDAO = new CorDAOSQL();
    	Simbolo simbolo = simboloDAO.findByName(elemento);
    	Collection<Cor> cores = corDAO.findBySimbolo(simbolo);
		
    	
    	return null;
    	
    	//TODO incluir metodo que retorna a collection de strings com percentual.
    
    }
    
    public Collection<String> getElementos() throws Exception{
    	SimboloDAOSQL SDSQL = new SimboloDAOSQL();
    	Collection<Simbolo> elementos = SDSQL.findAll();
    	List<String> nomeElementos = new ArrayList<String>();
    	for(Simbolo e : elementos)
    		nomeElementos.add(e.getNome());
    	
    	return nomeElementos;
    }       
}