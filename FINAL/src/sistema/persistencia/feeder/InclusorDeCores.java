package sistema.persistencia.feeder;

import java.sql.SQLException;

import sistema.model.entity.CorCMYK;
import sistema.model.entity.CorRGB;
import sistema.persistencia.CorDAOSQL;
import sistema.model.entity.Simbolo;


public class InclusorDeCores {
    
    public void populandoTabelaCores() throws Exception{
		// Criando objetos simbolos
		Simbolo floresta = new Simbolo(1, "FLORESTA");
		Simbolo aguaECharcos = new Simbolo(2, "AGUAS E CHARCOS");
		Simbolo areaProibida = new Simbolo(3, "AREA PROIBIDA");
		Simbolo zonaConstruida = new Simbolo(4, "ZONA CONSTRUIDA");
		Simbolo areaPublica = new Simbolo(5, "AREA PUBLICA"); 
	    	
	    	
		CorDAOSQL corDAO = new CorDAOSQL();
		
		corDAO.inserir(new CorRGB("V01", floresta,"VERDE DENSO", 36, 79, 20));
		corDAO.inserir(new CorRGB("V02", floresta,"VERDE MEDIO", 43, 171, 63));
		corDAO.inserir(new CorCMYK("V03", floresta,"VERDE ESPARSO", 64, 13, 93, 7));
	    	
		corDAO.inserir(new CorRGB("V04", aguaECharcos,"AZUL MAR", 49, 81, 131));
		corDAO.inserir(new CorRGB("V05", aguaECharcos,"AZUL RIO", 22, 122, 175));
		corDAO.inserir(new CorRGB("V06", aguaECharcos,"AZUL MANGUE", 49, 118, 131));
		corDAO.inserir(new CorCMYK("V07", aguaECharcos,"AZUL PISCINA", 64, 13, 3, 7));
		corDAO.inserir(new CorCMYK("V08", aguaECharcos,"AZUL LAGO", 86, 16, 0, 30));
	
		corDAO.inserir(new CorRGB("V09", areaProibida,"VERMELHO ISOLAMENTO", 255, 0, 0));
		corDAO.inserir(new CorCMYK("V10", areaProibida,"VERMELHO ISOLAMENTO", 0, 100, 100, 0));
		corDAO.inserir(new CorRGB("V11", zonaConstruida,"CINZA VIADUTO", 109, 20, 46));
		corDAO.inserir(new CorRGB("V12", zonaConstruida,"MARROM EDIFICIOS", 178, 79, 0));
		corDAO.inserir(new CorRGB("V13", zonaConstruida,"ROXO ESTRADA", 60, 45, 86));
		corDAO.inserir(new CorCMYK("V14", zonaConstruida,"CINZA PONTE", 0, 0, 16, 50));
		corDAO.inserir(new CorCMYK("V15", zonaConstruida,"MARROM CASA", 11, 36, 56, 17));
		    
		corDAO.inserir(new CorRGB("V16", areaPublica,"VERDE JARDIM", 12, 243, 119));
		corDAO.inserir(new CorRGB("V17", areaPublica,"ROXO MONUMENTO", 124, 86, 119));
		corDAO.inserir(new CorCMYK("V18", areaPublica,"CINZA ACESSO", 26, 16, 0, 71));
		corDAO.inserir(new CorCMYK("V19", areaPublica,"ROXO ESTACIONAMENTO", 30, 48, 0, 66));
		corDAO.inserir(new CorCMYK("V20", areaPublica,"VERDE PARQUE", 95, 0, 98, 5));
		    
    }
    
    public static void main(String[] args) {
    	InclusorDeCores IDC = new InclusorDeCores();
    	try {
			IDC.populandoTabelaCores();
		} catch (Exception e) {
			System.out.println("Erro ao inserir na tabela simbolos");
			e.printStackTrace();
		}
	}

}
