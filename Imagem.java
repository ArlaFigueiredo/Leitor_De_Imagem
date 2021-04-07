
public class Imagem
{
    private CorRGB[][] imagem; 
    
    public Imagem(int largura, int altura){
        this.imagem = new CorRGB[largura][altura];
        
        for (int i = 0; i < largura; i++){
            for (int j = 0; j < altura; j++){
            this.imagem[i][j]= CorRGB.BRANCA;
            }
        }
    }
}
