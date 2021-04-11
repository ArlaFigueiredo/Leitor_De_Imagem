public class Imagem
{
    private CorRGB[][] imagem; 
    
    public Imagem(int largura, int altura){
        this.imagem = new CorRGB[altura][largura];
        
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < largura; j++){
                this.imagem[i][j]= CorRGB.BRANCA;
            }
        }
    }
    
    public void modificaPixel(int posicao_largura, int posicao_altura, CorRGB pixel){
        this.imagem[posicao_altura][posicao_largura] = pixel;
    }
    
    public void modificaPixel(int posicao_largura, int posicao_altura, int red, int green, int blue){
        this.imagem[posicao_altura][posicao_largura] = new CorRGB(red, green, blue);
    }
    
    protected CorRGB getPixel(int posicao_largura, int posicao_altura){
        return this.imagem[posicao_altura][posicao_largura];
    }
    
    protected int getAltura(){
        return this.imagem.length;
    }
    
    protected int getLargura(){
        return this.imagem[0].length;
    }
    
    private Imagem viraImagem(Imagem imagem){
        // Cria a nova imagem com as dimensões (largura X altura) invertidas
        Imagem newImagem = new Imagem(imagem.getAltura(), imagem.getLargura());
        
        // Seta a nova imagem com a rotação da imagem original
        for (int i = 0; i < newImagem.getAltura(); i++){
            for (int j = 0; j < newImagem.getLargura(); j++){
                newImagem.modificaPixel(j, i, imagem.getPixel(i, imagem.getAltura()-j-1));
            }
        }
        return newImagem;
    }
    
    public boolean equals(Imagem imagem){
        int cont = 1;
        boolean vira = false;
        
        while(cont < 5){
            for (int i = 0; i < this.getAltura(); i++){
                for (int j = 0; j < this.getLargura(); j++){
                    // Se achar um pixel diferente, ira tentar virar a imagem
                    if((this.imagem[i][j].equals(imagem.getPixel(j, i))) == false){
                        vira = true;
                        break;
                    }
                    if(i == (this.getAltura() - 1) && j == (this.getLargura() - 1)){
                        if(i == (imagem.getAltura() - 1) && j == (imagem.getLargura() - 1)){
                            return true;
                        }
                    }
                }
                // Vira a imagem e reeinicia a verificação 
                if(vira == true){
                    imagem = viraImagem(imagem);
                    cont++;
                    vira = false;
                    break;
                }
            }
        }
        return false;
    }
}
