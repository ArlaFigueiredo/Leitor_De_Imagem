package sistema.model;

import sistema.model.entity.CorCMYK;
import sistema.model.entity.CorRGB;
public class CaptadorDeImagens{
    
	private CorDAOSQL cor = new CorDAOSQL();
	
	public CorRGB[][] captaSalvador() {

        CorRGB [][] imagemSalvador = new CorRGB[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemSalvador[i][j]= cor.findByName("VERDE DENSO");
            }
        }
        
        imagemSalvador[0][1] = cor.findByName("VERDE MEDIO");
        imagemSalvador[1][1] = cor.findByName("VERDE MEDIO");
        imagemSalvador[2][1] = cor.findByName("VERDE MEDIO");
        imagemSalvador[3][1] = cor.findByName("VERDE MEDIO");
        imagemSalvador[4][1] = cor.findByName("VERDE MEDIO");
        
        imagemSalvador[0][3] = cor.findByName("AZUL MAR");
        imagemSalvador[1][3] = cor.findByName("AZUL MAR");
        imagemSalvador[2][3] = cor.findByName("AZUL RIO");
        imagemSalvador[3][3] = cor.findByName("AZUL RIO");
        imagemSalvador[4][3] = cor.findByName("AZUL MANGUE");
        
        return imagemSalvador;
    }
    
    
    public CorRGB[][] captaCuritiba() {
        CorRGB [][] imagemCuritiba = new CorRGB[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemCuritiba[i][j]= cor.findByName("CINZA VIADUTO");
            }
        }
        
        imagemCuritiba[2][0] = cor.findByName("MARROM EDIFICIOS");
        imagemCuritiba[2][1] = cor.findByName("MARROM EDIFICIOS");
        imagemCuritiba[2][2] = cor.findByName("MARROM EDIFICIOS");
        imagemCuritiba[2][3] = cor.findByName("ROXO ESTRADA");
        imagemCuritiba[2][4] = cor.findByName("ROXO ESTRADA");
        
        imagemCuritiba[0][0] = cor.findByName("VERMELHO ISOLAMENTO");
        imagemCuritiba[1][0] = cor.findByName("VERMELHO ISOLAMENTO");
        imagemCuritiba[3][0] = cor.findByName("VERMELHO ISOLAMENTO");
        imagemCuritiba[4][0] = cor.findByName("VERMELHO ISOLAMENTO");
        
        imagemCuritiba[0][4] = cor.findByName("AZUL RIO");
        imagemCuritiba[1][4] = cor.findByName("ROXO MONUMENTO");
        imagemCuritiba[3][4] = cor.findByName("ROXO MONUMENTO");
        imagemCuritiba[4][4] = cor.findByName("VERDE JARDIM");

        return imagemCuritiba;
    }
    
    public CorRGB[][] captaBrasilia() {
        
        CorRGB [][] imagemBrasilia = new CorRGB[5][5];

        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemBrasilia[i][j]= cor.findByName("VERDE JARDIM");
            }
        }
        
        imagemBrasilia[1][0] = cor.findByName("ROXO MONUMENTO");
        imagemBrasilia[3][0] = cor.findByName("ROXO MONUMENTO");

        imagemBrasilia[1][2] = cor.findByName("VERMELHO ISOLAMENTO");
        imagemBrasilia[3][2] = cor.findByName("VERMELHO ISOLAMENTO");
        
        imagemBrasilia[1][4] = cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[3][4] = cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[0][1] = cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[2][1] = cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[4][1] = cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[0][3] = cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[2][3] = cor.findByName("MARROM EDIFICIOS");
        imagemBrasilia[4][3] = cor.findByName("MARROM EDIFICIOS");
        
        return imagemBrasilia;
    }
    
    
    
    public CorCMYK[][] captaManaus(){
        CorCMYK[][] imagemManaus = new CorCMYK[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemManaus[i][j] = cor.findByName("VERDE ESPARSO");
            }
        }
        
        imagemManaus[0][0] = cor.findByName("AZUL PISCINA");
        imagemManaus[1][0] = cor.findByName("AZUL PISCINA");
        imagemManaus[2][0] = cor.findByName("AZUL PISCINA");
        imagemManaus[0][2] = cor.findByName("AZUL PISCINA");
        imagemManaus[1][2] = cor.findByName("AZUL PISCINA");
        imagemManaus[2][2] = cor.findByName("AZUL PISCINA");
        imagemManaus[0][4] = cor.findByName("AZUL PISCINA");
        imagemManaus[1][4] = cor.findByName("AZUL PISCINA");
        imagemManaus[2][4] = cor.findByName("AZUL PISCINA");

        
        imagemManaus[0][1] = cor.findByName("AZUL LAGO");
        imagemManaus[3][1] = cor.findByName("AZUL LAGO");
        imagemManaus[4][1] = cor.findByName("AZUL LAGO");
        imagemManaus[0][3] = cor.findByName("VERMELHO ISOLAMENTO");
        imagemManaus[3][3] = cor.findByName("VERMELHO ISOLAMENTO");
        imagemManaus[4][3] = cor.findByName("CINZA PONTE");
        
        return imagemManaus;
    }
    
    
    public CorCMYK[][] captaBelem(){
        CorCMYK[][] imagemBelem = new CorCMYK[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemBelem[i][j] = cor.findByName("VERDE PARQUE");
            }
        }
        
        imagemBelem[0][0] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[1][0] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[2][0] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[3][0] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[0][1] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[1][1] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemBelem[2][1] = cor.findByName("ROXO ESTACIONAMENTO");
        
        imagemBelem[0][2] = cor.findByName("CINZA ACESSO");
        imagemBelem[1][2] = cor.findByName("CINZA ACESSO");
        imagemBelem[0][3] = cor.findByName("CINZA ACESSO");
        imagemBelem[2][4] = cor.findByName("CINZA ACESSO");
        imagemBelem[3][4] = cor.findByName("CINZA ACESSO");
        imagemBelem[4][4] = cor.findByName("CINZA ACESSO");
        
        imagemBelem[3][3] = cor.findByName("CINZA PONTE");
        imagemBelem[4][3] = cor.findByName("CINZA PONTE");
        
        imagemBelem[4][2] = cor.findByName("MARROM CASA");
        
        return imagemBelem;
    }
    
    
    public CorCMYK[][] captaFortaleza(){
        
        CorCMYK[][] imagemFortaleza = new CorCMYK[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemFortaleza[i][j] = cor.findByName("MARROM CASA");
            }
        }
        
        imagemFortaleza[0][0] = cor.findByName("CINZA PONTE");
        imagemFortaleza[1][0] = cor.findByName("CINZA PONTE");
        imagemFortaleza[2][0] = cor.findByName("CINZA PONTE");
        
        imagemFortaleza[0][2] = cor.findByName("CINZA ACESSO");
        imagemFortaleza[1][2] = cor.findByName("CINZA ACESSO");
        imagemFortaleza[2][2] = cor.findByName("CINZA ACESSO");
        imagemFortaleza[0][4] = cor.findByName("CINZA ACESSO");
        imagemFortaleza[1][4] = cor.findByName("CINZA ACESSO");
        imagemFortaleza[2][4] = cor.findByName("CINZA ACESSO");
        
        imagemFortaleza[0][0] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemFortaleza[0][0] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemFortaleza[0][0] = cor.findByName("ROXO ESTACIONAMENTO");
        imagemFortaleza[0][0] = cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = cor.findByName("VERDE PARQUE");
        imagemFortaleza[0][0] = cor.findByName("VERDE PARQUE");
        
        return imagemFortaleza;
    }
    
}
