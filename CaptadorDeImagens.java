
public class CaptadorDeImagens {
	
	
	public CorRGB[][] captaEstrada() {
		
		CorRGB [][] imagemEstrada = new CorRGB[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemEstrada[i][j]= CorRGB.GREEN;
            }
        }
		
		imagemEstrada[0][1] = CorRGB.BROWN;
		imagemEstrada[1][1] = CorRGB.BLUE;
		imagemEstrada[2][1] = CorRGB.BLUE;
		imagemEstrada[3][1] = CorRGB.BLUE;
		imagemEstrada[4][1] = CorRGB.BLUE;
		
		imagemEstrada[0][3] = CorRGB.BLUE;
		imagemEstrada[1][3] = CorRGB.BLUE;
		imagemEstrada[2][3] = CorRGB.BLUE;
		imagemEstrada[3][3] = CorRGB.BLUE;
		imagemEstrada[4][3] = CorRGB.BROWN;
		
		
		return imagemEstrada;
		
		
	}
	
	
	public CorRGB[][] captaPonte() {
		CorRGB [][] imagemPonte = new CorRGB[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	imagemPonte[i][j]= CorRGB.BLUE;
            }
        }
		
		imagemPonte[2][0] = CorRGB.BROWN;
		imagemPonte[2][1] = CorRGB.BROWN;
		imagemPonte[2][2] = CorRGB.BROWN;
		imagemPonte[2][3] = CorRGB.BROWN;
		imagemPonte[2][4] = CorRGB.BROWN;
		
		imagemPonte[0][0] = CorRGB.GREEN;
		imagemPonte[1][0] = CorRGB.GREEN;
		imagemPonte[3][0] = CorRGB.GREEN;
		imagemPonte[4][0] = CorRGB.GREEN;
		
		imagemPonte[0][4] = CorRGB.GREEN;
		imagemPonte[1][4] = CorRGB.GREEN;
		imagemPonte[3][4] = CorRGB.GREEN;
		imagemPonte[4][4] = CorRGB.GREEN;


		return imagemPonte;
	}
	
	public CorRGB[][] captaFloresta() {
		
		CorRGB [][] imagemFloresta = new CorRGB[5][5];

		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	imagemFloresta[i][j]= CorRGB.GREEN;
            }
        }
		
		imagemFloresta[1][0] = CorRGB.BROWN;
		imagemFloresta[3][0] = CorRGB.BROWN;

		imagemFloresta[1][2] = CorRGB.BROWN;
		imagemFloresta[3][2] = CorRGB.BROWN;
		
		imagemFloresta[1][4] = CorRGB.BROWN;
		imagemFloresta[3][4] = CorRGB.BROWN;
		
		imagemFloresta[0][1] = CorRGB.BROWN;
		imagemFloresta[2][1] = CorRGB.BROWN;
		imagemFloresta[4][1] = CorRGB.BROWN;
		
		imagemFloresta[0][3] = CorRGB.BROWN;
		imagemFloresta[2][3] = CorRGB.BROWN;
		imagemFloresta[4][3] = CorRGB.BROWN;
		

		return imagemFloresta;
	}
	
	
	
	public CorCMYK[][] captaPorto(){
		CorCMYK[][] imagemPorto = new CorCMYK[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	imagemPorto[i][j] = new CorCMYK(0,30,40,53);
            }
        }
		
		imagemPorto[0][0] = new CorCMYK(100,0,100,0);
		imagemPorto[1][0] = new CorCMYK(100,0,100,0);
		imagemPorto[2][0] = new CorCMYK(0,8,77,0);
		
		imagemPorto[0][2] = new CorCMYK(100,0,100,0);
		imagemPorto[1][2] = new CorCMYK(100,0,100,0);
		imagemPorto[2][2] = new CorCMYK(0,8,77,0);
		
		imagemPorto[0][4] = new CorCMYK(100,0,100,0);
		imagemPorto[1][4] = new CorCMYK(100,0,100,0);
		imagemPorto[2][4] = new CorCMYK(0,8,77,0);

		
		imagemPorto[0][1] = new CorCMYK(100,0,100,0);
		imagemPorto[3][1] = new CorCMYK(100,100,0,0);
		imagemPorto[4][1] = new CorCMYK(100,100,0,0);
		
		imagemPorto[0][3] = new CorCMYK(100,0,100,0);
		imagemPorto[3][3] = new CorCMYK(100,100,0,0);
		imagemPorto[4][3] = new CorCMYK(100,100,0,0);
		
		return imagemPorto;
	}
	
	
	public CorCMYK[][] captaPraia(){
		CorCMYK[][] imagemPraia = new CorCMYK[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	imagemPraia[i][j] = new CorCMYK(0,8,77,0);
            }
        }
		
		imagemPraia[0][0] = new CorCMYK(100,0,100,0);
		imagemPraia[1][0] = new CorCMYK(0,0,0,38);
		imagemPraia[2][0] = new CorCMYK(0,0,0,38);
		imagemPraia[3][0] = new CorCMYK(100,0,100,0);
		
		imagemPraia[0][1] = new CorCMYK(0,0,0,38);
		imagemPraia[1][1] = new CorCMYK(0,0,0,38);
		imagemPraia[2][1] = new CorCMYK(100,0,100,0);
		
		imagemPraia[0][2] = new CorCMYK(0,0,0,38);
		imagemPraia[1][2] = new CorCMYK(100,0,100,0);
		
		imagemPraia[0][3] = new CorCMYK(100,0,100,0);
		
		imagemPraia[2][4] = new CorCMYK(100,100,0,0);
		imagemPraia[3][4] = new CorCMYK(100,100,0,0);
		imagemPraia[4][4] = new CorCMYK(100,100,0,0);
		
		imagemPraia[3][3] = new CorCMYK(100,100,0,0);
		imagemPraia[4][3] = new CorCMYK(100,100,0,0);
		
		imagemPraia[4][2] = new CorCMYK(100,100,0,0);
		
		
		return imagemPraia;
	}
	
	
	public CorCMYK[][] captaRodovia(){
		
		CorCMYK[][] imagemRodovia = new CorCMYK[5][5];
		
		for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
            	imagemRodovia[i][j] = new CorCMYK(0,0,0,38);
            }
        }
		
		imagemRodovia[0][0] = new CorCMYK(100,0,100,0);
		imagemRodovia[1][0] = new CorCMYK(0,30,40,53);
		imagemRodovia[2][0] = new CorCMYK(100,0,100,0);
		
		imagemRodovia[0][2] = new CorCMYK(100,0,100,0);
		imagemRodovia[1][2] = new CorCMYK(0,30,40,53);
		imagemRodovia[2][2] = new CorCMYK(100,0,100,0);
		
		imagemRodovia[0][4] = new CorCMYK(100,0,100,0);
		imagemRodovia[1][4] = new CorCMYK(0,30,40,53);
		imagemRodovia[2][4] = new CorCMYK(100,0,100,0);
		
		imagemRodovia[0][0] = new CorCMYK(100,0,100,0);
		imagemRodovia[0][0] = new CorCMYK(0,30,40,53);
		imagemRodovia[0][0] = new CorCMYK(100,0,100,0);

		imagemRodovia[0][0] = new CorCMYK(0,30,40,53);
		imagemRodovia[0][0] = new CorCMYK(100,0,100,0);
		imagemRodovia[0][0] = new CorCMYK(0,30,40,53);
		
		imagemRodovia[0][0] = new CorCMYK(0,30,40,53);
		imagemRodovia[0][0] = new CorCMYK(100,0,100,0);
		imagemRodovia[0][0] = new CorCMYK(0,30,40,53);
		
		return imagemRodovia;
	}
}
