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
        boolean vira = false;
        boolean retorno = false;

        while(cont < 4){
            for (int i = 0; i < this.getAltura(); i++){
                // Se a altura ou a largura for diferente já tenta virar
                if((this.getAltura() != imagem.getAltura()) || (this.getLargura() != imagem.getLargura())){
                    vira = true;
                }
                else{
                    for (int j = 0; j < this.getLargura(); j++){
                        // Se achar um pixel diferente, irá tentar virar a imagem
                        if((this.imagem[i][j].equals(imagem.getPixel(j, i))) == false){
                            vira = true;
                            break;
                        }
                        // Se conseguiu chegar ao final da imagem, é por que são iguais
                        if(i == (this.getAltura() - 1) && j == (this.getLargura() - 1)){
                            retorno = true;
                        }
                    }
                }
                // Vira a imagem e reeinicia a verificação 
                if(vira){
                    imagem = viraImagem(imagem);
                    cont++;
                    vira = false;
                    break;
                }
            }
        }
        return retorno;
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

    private int[] procuraPixel(int controlador[], Imagem fragmento){
        boolean stop = false;
        for (int i = controlador[1]; i < this.getAltura(); i++){
            for (int j = controlador[0]; j < this.getLargura(); j++){
                // Verifica se achou o primeiro pixel igual e se o fragmento ainda cabe na imagem
                if ((this.getPixel(j,i).equals(fragmento.getPixel(0,0))) && (i+fragmento.getAltura()<=this.getAltura()) && (j+fragmento.getLargura()<=this.getLargura())){
                    controlador[0] = j; //armazena a largura do pixel achado na imagem
                    controlador[1] = i; //armazena a altura do pixel achado na imagem
                    stop = true;
                    break;
                }
                if(i == (this.getAltura()-1) && j==(this.getLargura()-1)){
                    // Se não achou nada, coloca -1 nas posições como um indicador
                    controlador[0] = -1; 
                    controlador[1] = -1;
                }
            }
            if(stop)
                break;
        }
        return controlador;
    }

    public boolean verificaFragmento(Imagem fragmento){ 
        int cont = 0;
        boolean retorno = false; //retorno lógicboolean ecx = false; // trata exceções
        int[] controlador = new int[2];//variável de retorno de posições da imagem + retorno lógico da função procuraPixel()
        boolean vira = false;
        
        
        while(cont < 4){
            boolean continua_busca = true;
            controlador[0] = 0;
            controlador[1] = 0;            
            while(continua_busca == true){
                boolean stop = false;
                // procura a posição na imagem cujo pixel é igual igual ao Pixel (0,0) do fragmento 
                controlador = procuraPixel(controlador, fragmento);
                // A função procuraPixel() achou uma posição válida
                if(controlador[0] != -1){
                    for (int iFrag = 0, iImag = controlador[1]; iFrag < fragmento.getAltura(); iFrag++, iImag++){
                        for (int jFrag = 0, jImag = controlador[0]; jFrag < fragmento.getLargura(); jFrag++, jImag++){
                            if(!this.getPixel(jImag, iImag).equals(fragmento.getPixel(jFrag, iFrag))){
                                // Caso a posicao do controlador de largura é a ultima coluna da imagem, vai para proxima linha
                                if(controlador[0] == this.getLargura()-1){
                                    stop = true;
                                    controlador[1] =+ 1;
                                    controlador[0] = 0;
                                    break;
                                }
                                else{
                                    controlador[0] += 1;
                                    stop = true;
                                    break;
                                }                       
                            }
                            if ((iFrag == (fragmento.getAltura() - 1)) && (jFrag == (fragmento.getLargura() - 1))){
                                retorno = true;
                                continua_busca = false;
                                cont  = 4;
                            }
                        }
                        if(stop)
                            break; //Quebra segundo laço
                    }
                }else{ // O retorno da função procuraPixel() foi negativo, vira a imagem
                    vira = true;
                    continua_busca = false;
                }
                if(vira){
                    fragmento = viraImagem(fragmento);
                    vira = false;
                    cont++;
                }
            }
        }
        return retorno;
    }            
}
