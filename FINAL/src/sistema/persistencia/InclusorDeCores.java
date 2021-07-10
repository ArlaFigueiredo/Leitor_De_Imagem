package sistema.persistencia;

import sistema.model.entity.CorCMYK;
import sistema.model.entity.CorRGB;
import sistema.persistencia.CorDAOSQL;

public class InclusorDeCores {
    
    public void populandoTabelaCores(){
    	CorDAOSQL corDAO = new CorDAOSQL();
    	
    	corDAO.inserir(new CorRGB("V01", "FLORESTA","VERDE DENSO", 36, 79, 20));
	corDAO.inserir(new CorRGB("V02", "FLORESTA","VERDE MEDIO", 43, 171, 63));
	corDAO.inserir(new CorCMYK("V03", "FLORESTA","VERDE ESPARSO", 64, 13, 93, 7));
	    
	corDAO.inserir(new CorRGB("V04", "AGUAS E CHARCOS","AZUL MAR", 49, 81, 131));
	corDAO.inserir(new CorRGB("V05", "AGUAS E CHARCOS","AZUL RIO", 22, 122, 175));
	corDAO.inserir(new CorRGB("V06", "AGUAS E CHARCOS","AZUL MANGUE", 49, 118, 131));
	corDAO.inserir(new CorCMYK("V07", "AGUAS E CHARCOS","AZUL PISCINA", 64, 13, 3, 7));
	corDAO.inserir(new CorCMYK("V08", "AGUAS E CHARCOS","AZUL LAGO", 86, 16, 0, 30));

	corDAO.inserir(new CorRGB("V09", "AREA PROIBIDA","VERMELHO ISOLAMENTO", 255, 0, 0));
	corDAO.inserir(new CorCMYK("V10", "AREA PROIBIDA","VERMELHO ISOLAMENTO", 0, 100, 100, 0));
	
	corDAO.inserir(new CorRGB("V11", "ZONA CONSTRUIDA","CINZA VIADUTO", 109, 20, 46));
	corDAO.inserir(new CorRGB("V12", "ZONA CONSTRUIDA","MARROM EDIFICIOS", 178, 79, 0));
	corDAO.inserir(new CorRGB("V13", "ZONA CONSTRUIDA","ROXO ESTRADA", 60, 45, 86));
	corDAO.inserir(new CorCMYK("V14", "ZONA CONSTRUIDA","CINZA PONTE", 0, 0, 16, 50));
	corDAO.inserir(new CorCMYK("V15", "ZONA CONSTRUIDA","MARROM CASA", 11, 36, 56, 17));
	    
	corDAO.inserir(new CorRGB("V16", "AREA PUBLICA","VERDE JARDIM", 12, 243, 119));
	corDAO.inserir(new CorRGB("V17", "AREA PUBLICA","ROXO MONUMENTO", 124, 86, 119));
	corDAO.inserir(new CorCMYK("V18", "AREA PUBLICA","CINZA ACESSO", 26, 16, 0, 71));
	corDAO.inserir(new CorCMYK("V19", "AREA PUBLICA","ROXO ESTACIONAMENTO", 30, 48, 0, 66));
	corDAO.inserir(new CorCMYK("V20", "AREA PUBLICA","VERDE PARQUE", 95, 0, 98, 5));
	
	    
    }

}
