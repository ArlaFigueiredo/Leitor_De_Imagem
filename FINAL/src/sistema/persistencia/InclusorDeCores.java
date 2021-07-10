package sistema.persistencia;

import sistema.model.entity.CorCMYK;
import sistema.model.entity.CorRGB;
import sistema.persistencia.CorDAOSQL;

public class InclusorDeCores {
    
    public void populandoTableaCores(){
    	CorDAOSQL corDAO = new CorDAOSQL();
    	
		//TODO: CRIAR CORES DE DIVERSOS TIPOS RGB E CMYK
    	//corDAO.inserir(new CorRGB("V01", "FLORESTA","VERDE ESCURO", 0, 255, 0));
    	//corDAO.inserir(new CorCMYK("V02", "FLORESTA","VERDE CLARO", 0, 100, 0, 0));
    }

}