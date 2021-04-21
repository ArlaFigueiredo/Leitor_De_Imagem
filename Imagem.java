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
    
    public int getAltura(){
        return this.imagem.length;
    }

    public int getLargura(){
        return this.imagem[0].length;
    }
    
    public CorRGB getPixel(int posicao_largura, int posicao_altura){
        return this.imagem[posicao_altura][posicao_largura];
    }

    public void modificaPixel(int posicao_largura, int posicao_altura, CorRGB pixel){
        this.imagem[posicao_altura][posicao_largura] = pixel;
    }

    public void modificaPixel(int posicao_largura, int posicao_altura, int red, int green, int blue){
        this.imagem[posicao_altura][posicao_largura] = new CorRGB(red, green, blue);
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

        int cont = 0;

        while(cont < 4){
            if(estaContida(imagem, 0, 0))
                return true;

            // Vira a imagem
            imagem = viraImagem(imagem);
            cont++;
        }
        return false;
    }

    public Imagem novaImagemPB(){
        
        Imagem novaImagemPB = new Imagem(this.getLargura(), this.getAltura());        
        for (int i = 0; i < novaImagemPB.getAltura(); i++){
            for (int j = 0; j < novaImagemPB.getLargura(); j++){
                novaImagemPB.modificaPixel(j,i, this.getPixel(j, i).cinza());
            }
        }       
        return novaImagemPB;
    }
    
    public boolean isFragment(Imagem fragmento){ 

        int cont = 0;
        while(cont < 4){
            for (int iImag = 0; iImag < this.getAltura(); iImag++){
                for (int jImag = 0; jImag < this.getLargura(); jImag++){
                    if(estaContida(fragmento, jImag, iImag))
                        return true;
                }
            }
            // Vira o fragmento
            fragmento = viraImagem(fragmento);
            cont++;
        }
        return false;
    }            

    private boolean estaContida(Imagem imagem, int largura, int altura){ 

        if ((altura + imagem.getAltura() > this.getAltura()) || (largura + imagem.getLargura() > this.getLargura()))
            return false;

        for (int iFrag = 0, iImag = altura; iFrag < imagem.getAltura(); iFrag++, iImag++){
            for (int jFrag = 0, jImag = largura; jFrag < imagem.getLargura(); jFrag++, jImag++){
                if(!this.getPixel(jImag, iImag).equals(imagem.getPixel(jFrag, iFrag)))
                    return false;
            }
        }
        return true;
    }
}
