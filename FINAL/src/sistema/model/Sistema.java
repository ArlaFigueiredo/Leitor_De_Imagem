package sistema.model;

import sistema.model.convert.Conversor;
import sistema.model.convert.ConversorCMYKToRGB;
import sistema.persistencia.MapaDAOFILE;

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
    	
    	//TODO incluir metodo que retorna a collection de strings com percentual.
    
    }
    
    public Collection<String> getElementos() throws Exception{
    	Collection<Simbolo> elementos = SimboloDAOSQL.findAll();
    	List<String> nomeElementos = new ArrayList<String>();
    	for(Simbolo e : elementos)
    		nomeElementos.add(e.getNome());
    	
    	return nomeElementos;
    }       
}