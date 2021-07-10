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
                imagemPorto[i][j] = CorCMYK.BROWN;
            }
        }
        
        imagemPorto[0][0] = CorCMYK.GREENTREE;
        imagemPorto[1][0] = CorCMYK.GREENTREE;
        imagemPorto[2][0] = CorCMYK.YELLOWSAND;
        
        imagemPorto[0][2] = CorCMYK.GREENTREE;
        imagemPorto[1][2] = CorCMYK.GREENTREE;
        imagemPorto[2][2] = CorCMYK.YELLOWSAND;
        
        imagemPorto[0][4] = CorCMYK.GREENTREE;
        imagemPorto[1][4] = CorCMYK.GREENTREE;
        imagemPorto[2][4] = CorCMYK.YELLOWSAND;

        
        imagemPorto[0][1] = CorCMYK.GREENTREE;
        imagemPorto[3][1] = CorCMYK.BLUEWATER;
        imagemPorto[4][1] = CorCMYK.BLUEWATER;
        
        imagemPorto[0][3] = CorCMYK.GREENTREE;
        imagemPorto[3][3] = CorCMYK.BLUEWATER;
        imagemPorto[4][3] = CorCMYK.BLUEWATER;
        
        return imagemPorto;
    }
    
    
    public CorCMYK[][] captaPraia(){
        CorCMYK[][] imagemPraia = new CorCMYK[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemPraia[i][j] = CorCMYK.YELLOWSAND;
            }
        }
        
        imagemPraia[0][0] = CorCMYK.GREENTREE;
        imagemPraia[1][0] = CorCMYK.GRAY;
        imagemPraia[2][0] = CorCMYK.GRAY;
        imagemPraia[3][0] = CorCMYK.GREENTREE;
        
        imagemPraia[0][1] = CorCMYK.GRAY;
        imagemPraia[1][1] = CorCMYK.GRAY;
        imagemPraia[2][1] = CorCMYK.GREENTREE;
        
        imagemPraia[0][2] = CorCMYK.GRAY;
        imagemPraia[1][2] = CorCMYK.GREENTREE;
        
        imagemPraia[0][3] = CorCMYK.GREENTREE;
        
        imagemPraia[2][4] = CorCMYK.BLUEWATER;
        imagemPraia[3][4] = CorCMYK.BLUEWATER;
        imagemPraia[4][4] = CorCMYK.BLUEWATER;
        
        imagemPraia[3][3] = CorCMYK.BLUEWATER;
        imagemPraia[4][3] = CorCMYK.BLUEWATER;
        
        imagemPraia[4][2] = CorCMYK.BLUEWATER;
        
        return imagemPraia;
    }
    
    
    public CorCMYK[][] captaRodovia(){
        
        CorCMYK[][] imagemRodovia = new CorCMYK[5][5];
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                imagemRodovia[i][j] = CorCMYK.GRAY;
            }
        }
        
        imagemRodovia[0][0] = CorCMYK.GREENTREE;
        imagemRodovia[1][0] = CorCMYK.BROWN;
        imagemRodovia[2][0] = CorCMYK.GREENTREE;
        
        imagemRodovia[0][2] = CorCMYK.GREENTREE;
        imagemRodovia[1][2] = CorCMYK.BROWN;
        imagemRodovia[2][2] = CorCMYK.GREENTREE;
        
        imagemRodovia[0][4] = CorCMYK.GREENTREE;
        imagemRodovia[1][4] = CorCMYK.BROWN;
        imagemRodovia[2][4] = CorCMYK.GREENTREE;
        
        imagemRodovia[0][0] = CorCMYK.GREENTREE;
        imagemRodovia[0][0] = CorCMYK.BROWN;
        imagemRodovia[0][0] = CorCMYK.GREENTREE;

        imagemRodovia[0][0] = CorCMYK.BROWN;
        imagemRodovia[0][0] = CorCMYK.GREENTREE;
        imagemRodovia[0][0] = CorCMYK.BROWN;
        
        imagemRodovia[0][0] = CorCMYK.BROWN;
        imagemRodovia[0][0] = CorCMYK.GREENTREE;
        imagemRodovia[0][0] = CorCMYK.BROWN;
        
        return imagemRodovia;
    }
}