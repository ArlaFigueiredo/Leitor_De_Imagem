
public class CriadorDeMapas {
	
	
	public CorRGB[][] criarEstrada() {
		
		CorRGB [][] mapaEstrada = new CorRGB[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                mapaEstrada[i][j]= CorRGB.GREEN;
            }
        }
		
		mapaEstrada[0][1] = new CorRGB(121, 85, 72);
		mapaEstrada[1][1] = CorRGB.BLUE;
		mapaEstrada[2][1] = CorRGB.BLUE;
		mapaEstrada[3][1] = CorRGB.BLUE;
		mapaEstrada[4][1] = CorRGB.BLUE;
		
		mapaEstrada[0][3] = CorRGB.BLUE;
		mapaEstrada[1][3] = CorRGB.BLUE;
		mapaEstrada[2][3] = CorRGB.BLUE;
		mapaEstrada[3][3] = CorRGB.BLUE;
		mapaEstrada[4][3] = new CorRGB(121, 85, 72);
		
		
		return mapaEstrada;
		
		
	}
	
	
	public CorRGB[][] criarPonte() {
		CorRGB [][] mapaPonte = new CorRGB[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	mapaPonte[i][j]= CorRGB.BLUE;
            }
        }
		
		mapaPonte[2][0] = new CorRGB(121, 85, 72);
		mapaPonte[2][1] = new CorRGB(121, 85, 72);
		mapaPonte[2][2] = new CorRGB(121, 85, 72);
		mapaPonte[2][3] = new CorRGB(121, 85, 72);
		mapaPonte[2][4] = new CorRGB(121, 85, 72);
		
		mapaPonte[0][0] = CorRGB.GREEN;
		mapaPonte[1][0] = CorRGB.GREEN;
		mapaPonte[3][0] = CorRGB.GREEN;
		mapaPonte[4][0] = CorRGB.GREEN;
		
		mapaPonte[0][4] = CorRGB.GREEN;
		mapaPonte[1][4] = CorRGB.GREEN;
		mapaPonte[3][4] = CorRGB.GREEN;
		mapaPonte[4][4] = CorRGB.GREEN;


		return mapaPonte;
	}
	
	public CorRGB[][] criarFloresta() {
		
		CorRGB [][] mapaFloresta = new CorRGB[5][5];

		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	mapaFloresta[i][j]= CorRGB.GREEN;
            }
        }
		
		mapaFloresta[1][0] = new CorRGB(121, 85, 72);
		mapaFloresta[3][0] = new CorRGB(121, 85, 72);

		mapaFloresta[1][2] = new CorRGB(121, 85, 72);
		mapaFloresta[3][2] = new CorRGB(121, 85, 72);
		
		mapaFloresta[1][4] = new CorRGB(121, 85, 72);
		mapaFloresta[3][4] = new CorRGB(121, 85, 72);
		
		mapaFloresta[0][1] = new CorRGB(121, 85, 72);
		mapaFloresta[2][1] = new CorRGB(121, 85, 72);
		mapaFloresta[4][1] = new CorRGB(121, 85, 72);
		
		mapaFloresta[0][3] = new CorRGB(121, 85, 72);
		mapaFloresta[2][3] = new CorRGB(121, 85, 72);
		mapaFloresta[4][3] = new CorRGB(121, 85, 72);
		

		return mapaFloresta;
	}
	
	
	
	public CorCMYK[][] criarPorto(){
		CorCMYK[][] mapaPorto = new CorCMYK[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	mapaPorto[i][j] = new CorCMYK(0,30,40,53);
            }
        }
		
		mapaPorto[0][0] = new CorCMYK(100,0,100,0);
		mapaPorto[1][0] = new CorCMYK(100,0,100,0);
		mapaPorto[2][0] = new CorCMYK(0,8,77,0);
		
		mapaPorto[0][2] = new CorCMYK(100,0,100,0);
		mapaPorto[1][2] = new CorCMYK(100,0,100,0);
		mapaPorto[2][2] = new CorCMYK(0,8,77,0);
		
		mapaPorto[0][4] = new CorCMYK(100,0,100,0);
		mapaPorto[1][4] = new CorCMYK(100,0,100,0);
		mapaPorto[2][4] = new CorCMYK(0,8,77,0);

		
		mapaPorto[0][1] = new CorCMYK(100,0,100,0);
		mapaPorto[3][1] = new CorCMYK(100,100,0,0);
		mapaPorto[4][1] = new CorCMYK(100,100,0,0);
		
		mapaPorto[0][3] = new CorCMYK(100,0,100,0);
		mapaPorto[3][3] = new CorCMYK(100,100,0,0);
		mapaPorto[4][3] = new CorCMYK(100,100,0,0);
		
		return mapaPorto;
	}
	
	
	public CorCMYK[][] criarPraia(){
		CorCMYK[][] mapaPraia = new CorCMYK[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	mapaPraia[i][j] = new CorCMYK(0,8,77,0);
            }
        }
		
		mapaPraia[0][0] = new CorCMYK(100,0,100,0);
		mapaPraia[1][0] = new CorCMYK(0,0,0,38);
		mapaPraia[2][0] = new CorCMYK(0,0,0,38);
		mapaPraia[3][0] = new CorCMYK(100,0,100,0);
		
		mapaPraia[0][1] = new CorCMYK(0,0,0,38);
		mapaPraia[1][1] = new CorCMYK(0,0,0,38);
		mapaPraia[2][1] = new CorCMYK(100,0,100,0);
		
		mapaPraia[0][2] = new CorCMYK(0,0,0,38);
		mapaPraia[1][2] = new CorCMYK(100,0,100,0);
		
		mapaPraia[0][3] = new CorCMYK(100,0,100,0);
		
		mapaPraia[2][4] = new CorCMYK(100,100,0,0);
		mapaPraia[3][4] = new CorCMYK(100,100,0,0);
		mapaPraia[4][4] = new CorCMYK(100,100,0,0);
		
		mapaPraia[3][3] = new CorCMYK(100,100,0,0);
		mapaPraia[4][3] = new CorCMYK(100,100,0,0);
		
		mapaPraia[4][2] = new CorCMYK(100,100,0,0);
		
		
		return mapaPraia;
	}
	
	
	public CorCMYK[][] criarRodovia(){
		
		CorCMYK[][] mapaRodovia = new CorCMYK[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	mapaRodovia[i][j] = new CorCMYK(0,0,0,38);
            }
        }
		
		mapaRodovia[0][0] = new CorCMYK(100,0,100,0);
		mapaRodovia[1][0] = new CorCMYK(0,30,40,53);
		mapaRodovia[2][0] = new CorCMYK(100,0,100,0);
		
		mapaRodovia[0][2] = new CorCMYK(100,0,100,0);
		mapaRodovia[1][2] = new CorCMYK(0,30,40,53);
		mapaRodovia[2][2] = new CorCMYK(100,0,100,0);
		
		mapaRodovia[0][4] = new CorCMYK(100,0,100,0);
		mapaRodovia[1][4] = new CorCMYK(0,30,40,53);
		mapaRodovia[2][4] = new CorCMYK(100,0,100,0);
		
		mapaRodovia[0][0] = new CorCMYK(100,0,100,0);
		mapaRodovia[0][0] = new CorCMYK(0,30,40,53);
		mapaRodovia[0][0] = new CorCMYK(100,0,100,0);

		mapaRodovia[0][0] = new CorCMYK(0,30,40,53);
		mapaRodovia[0][0] = new CorCMYK(100,0,100,0);
		mapaRodovia[0][0] = new CorCMYK(0,30,40,53);
		
		mapaRodovia[0][0] = new CorCMYK(0,30,40,53);
		mapaRodovia[0][0] = new CorCMYK(100,0,100,0);
		mapaRodovia[0][0] = new CorCMYK(0,30,40,53);
		
		return mapaRodovia;
	}
}
