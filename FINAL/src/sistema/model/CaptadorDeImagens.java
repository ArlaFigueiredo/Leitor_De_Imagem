package sistema.model;

import sistema.model.entity.CorCMYK;
import sistema.model.entity.CorRGB;
import sistema.persistencia.CorDAOSQL;
public class CaptadorDeImagens   {
    
	
	public CorRGB[][] captaSalvador() throws Exception {
		
		CorDAOSQL cor = new CorDAOSQL();
        CorRGB [][] imagemSalvador = new CorRGB[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemSalvador[i][j]= (CorRGB) cor.findByName("VERDE DENSO");
            }
        }
        
        imagemSalvador[0][1] = (CorRGB) cor.findByName("VERDE MEDIO");
        imagemSalvador[1][1] = (CorRGB) cor.findByName("VERDE MEDIO");
        imagemSalvador[2][1] = (CorRGB) cor.findByName("VERDE MEDIO");
        imagemSalvador[3][1] = (CorRGB) cor.findByName("VERDE MEDIO");
        imagemSalvador[4][1] = (CorRGB) cor.findByName("VERDE MEDIO");
        
        imagemSalvador[0][3] = (CorRGB) cor.findByName("AZUL MAR");
        imagemSalvador[1][3] = (CorRGB) cor.findByName("AZUL MAR");
        imagemSalvador[2][3] = (CorRGB) cor.findByName("AZUL RIO");
        imagemSalvador[3][3] = (CorRGB) cor.findByName("AZUL RIO");
        imagemSalvador[4][3] = (CorRGB) cor.findByName("AZUL MANGUE");
        
        return imagemSalvador;
    }
    
    
    public CorRGB[][] captaCuritiba() throws Exception {
        CorRGB [][] imagemCuritiba = new CorRGB[5][5];
        CorDAOSQL cor = new CorDAOSQL();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemCuritiba[i][j]= (CorRGB) cor.findByName("CINZA VIADUTO");
            }
        }
        
        imagemCuritiba[2][0] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemCuritiba[2][1] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemCuritiba[2][2] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemCuritiba[2][3] = (CorRGB) cor.findByName("ROXO ESTRADA");
        imagemCuritiba[2][4] = (CorRGB) cor.findByName("ROXO ESTRADA");
        
        imagemCuritiba[0][0] = (CorRGB) cor.findByName("VERMELHO ISOLAMENTO");
        imagemCuritiba[1][0] = (CorRGB) cor.findByName("VERMELHO ISOLAMENTO");
        imagemCuritiba[3][0] = (CorRGB) cor.findByName("VERMELHO ISOLAMENTO");
        imagemCuritiba[4][0] = (CorRGB) cor.findByName("VERMELHO ISOLAMENTO");
        
        imagemCuritiba[0][4] = (CorRGB) cor.findByName("AZUL RIO");
        imagemCuritiba[1][4] = (CorRGB) cor.findByName("ROXO MONUMENTO");
        imagemCuritiba[3][4] = (CorRGB) cor.findByName("ROXO MONUMENTO");
        imagemCuritiba[4][4] = (CorRGB) cor.findByName("VERDE JARDIM");

        return imagemCuritiba;
    }
    
    public CorRGB[][] captaBrasilia() throws Exception {
        
        CorRGB [][] imagemBrasilia = new CorRGB[5][5];
        CorDAOSQL cor = new CorDAOSQL();
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemBrasilia[i][j]= (CorRGB) cor.findByName("VERDE JARDIM");
            }
        }
        
        imagemBrasilia[1][0] = (CorRGB) cor.findByName("ROXO MONUMENTO");
        imagemBrasilia[3][0] = (CorRGB) cor.findByName("ROXO MONUMENTO");

        imagemBrasilia[1][2] = (CorRGB) cor.findByName("VERMELHO ISOLAMENTO");
        imagemBrasilia[3][2] = (CorRGB) cor.findByName("VERMELHO ISOLAMENTO");
        
        imagemBrasilia[1][4] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[3][4] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[0][1] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[2][1] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[4][1] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[0][3] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[2][3] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[4][3] = (CorRGB) cor.findByName("MARROM EDIFICIOS");
        
        return imagemBrasilia;
    }
    
    
    
    public CorCMYK[][] captaManaus() throws Exception{
        CorCMYK[][] imagemManaus = new CorCMYK[5][5];
        CorDAOSQL cor = new CorDAOSQL();
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemManaus[i][j] = (CorCMYK) cor.findByName("VERDE ESPARSO");
            }
        }
        
        imagemManaus[0][0] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[1][0] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[2][0] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[0][2] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[1][2] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[2][2] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[0][4] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[1][4] = (CorCMYK) cor.findByName("AZUL PISCINA");
        imagemManaus[2][4] = (CorCMYK) cor.findByName("AZUL PISCINA");

        
        imagemManaus[0][1] = (CorCMYK) cor.findByName("AZUL LAGO");
        imagemManaus[3][1] = (CorCMYK) cor.findByName("AZUL LAGO");
        imagemManaus[4][1] = (CorCMYK) cor.findByName("AZUL LAGO");
        imagemManaus[0][3] = (CorCMYK) cor.findByName("VERMELHO ISOLAMENTO");
        imagemManaus[3][3] = (CorCMYK) cor.findByName("VERMELHO ISOLAMENTO");
        imagemManaus[4][3] = (CorCMYK) cor.findByName("CINZA PONTE");
        
        return imagemManaus;
    }
    
    
    public CorCMYK[][] captaBelem() throws Exception{
        CorCMYK[][] imagemBelem = new CorCMYK[5][5];
        CorDAOSQL cor = new CorDAOSQL();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemBelem[i][j] =(CorCMYK) cor.findByName("VERDE PARQUE");
            }
        }
        
        imagemBelem[0][0] =(CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[1][0] =(CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[2][0] =(CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[3][0] =(CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[0][1] =(CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[1][1] =(CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[2][1] =(CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        
        imagemBelem[0][2] =(CorCMYK) cor.findByName("CINZA ACESSO");
        imagemBelem[1][2] =(CorCMYK) cor.findByName("CINZA ACESSO");
        imagemBelem[0][3] =(CorCMYK) cor.findByName("CINZA ACESSO");
        imagemBelem[2][4] =(CorCMYK) cor.findByName("CINZA ACESSO");
        imagemBelem[3][4] =(CorCMYK) cor.findByName("CINZA ACESSO");
        imagemBelem[4][4] =(CorCMYK)cor.findByName("CINZA ACESSO");
        
        imagemBelem[3][3] =(CorCMYK) cor.findByName("CINZA PONTE");
        imagemBelem[4][3] =(CorCMYK) cor.findByName("CINZA PONTE");
        
        imagemBelem[4][2] =(CorCMYK) cor.findByName("MARROM CASA");
        
        return imagemBelem;
    }
    
    
    public CorCMYK[][] captaFortaleza() throws Exception{
    	CorDAOSQL cor = new CorDAOSQL();
        CorCMYK[][] imagemFortaleza = new CorCMYK[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemFortaleza[i][j] = (CorCMYK) cor.findByName("MARROM CASA");
            }
        }
        
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("CINZA PONTE");
        imagemFortaleza[1][0] = (CorCMYK) cor.findByName("CINZA PONTE");
        imagemFortaleza[2][0] = (CorCMYK) cor.findByName("CINZA PONTE");
        
        imagemFortaleza[0][2] = (CorCMYK) cor.findByName("CINZA ACESSO");
        imagemFortaleza[1][2] = (CorCMYK) cor.findByName("CINZA ACESSO");
        imagemFortaleza[2][2] = (CorCMYK) cor.findByName("CINZA ACESSO");
        imagemFortaleza[0][4] = (CorCMYK) cor.findByName("CINZA ACESSO");
        imagemFortaleza[1][4] = (CorCMYK) cor.findByName("CINZA ACESSO");
        imagemFortaleza[2][4] = (CorCMYK) cor.findByName("CINZA ACESSO");
        
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("ROXO ESTACIONAMENTO");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = (CorCMYK) cor.findByName("VERDE PARQUE");
        
        return imagemFortaleza;
    }
    
}
