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
                // Se a altura for diferente já tenta virar
                if(this.getAltura() != imagem.getAltura()){
                    vira = true;
                }
                else{
                    for (int j = 0; j < this.getLargura(); j++){
                        // Se a largura for diferente, já tenta virar
                        if(this.getLargura() != imagem.getLargura()){
                            vira = true;
                            break;
                        }
                        // Se achar um pixel diferente, ira tentar virar a imagem
                        if((this.imagem[i][j].equals(imagem.getPixel(j, i))) == false){
                            vira = true;
                            break;
                        }
                        if(i == (this.getAltura() - 1) && j == (this.getLargura() - 1)){
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
    
    private Imagem novaImagemPB(Imagem imagem){
        Imagem novaImagemPB = new Imagem(imagem.getAltura(), imagem.getLargura());        
        for (int i = 0; i < novaImagemPB.getAltura(); i++){
            for (int j = 0; j < novaImagemPB.getLargura(); j++){
                novaImagemPB.modificaPixel(j,i, imagem.getPixel(j, i).cinza());
            }
        }       
        return novaImagemPB;
    }
    
    
    private int[] procuraPixel(int vetor[], CorRGB pixel){
        vetor[2] = -1; //recebe um vetor de três posições e seta -1. esta última posição do vetor será um controlador
        
        for (int i = 0; i < this.getAltura(); i++){
            for (int j = 0; j < this.getLargura(); j++){
                if (this.getPixel(j,i) == pixel){
                vetor[0] = i; //armazena a altura do pixel achado na imagem
                vetor[1] = j; //armazena a largura do pixel achado na imagem
                vetor[2] = 1;//muda para 1, caso ache o pixel. 
                break;
                }            
            }
        if (vetor[2]==1)
            break;
        }
        return vetor;
    }
    
    
} 