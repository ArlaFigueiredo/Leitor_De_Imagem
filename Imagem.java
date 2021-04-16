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
    
    private CorRGB getPixel(int posicao_largura, int posicao_altura){
        return this.imagem[posicao_altura][posicao_largura];
    }
    
    private int getAltura(){
        return this.imagem.length;
    }
    
    private int getLargura(){
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
                System.out.println("testando");
                break;
                }            
            }
        if (vetor[2]==1)
            System.out.println("TesteProcuraPixel_ACHOU");
            break;
        }
        return vetor;
    }
    
    
    public boolean verificaFragmento(Imagem fragmento){
        boolean continua_busca = true; //variável de controle do while 
        boolean retorno = false; //retorno lógico da função verificaFragmento()
        boolean ecx = false; // trata exceções
        int[] controlador = new int[3];//variável de retorno de posições da imagem + retorno lógico da função procuraPixel()
        controlador[0] = 0; // largura
        controlador[1] = 0; //altura
        controlador[2] = 0; //retorno lógico do pixel achado
        
        while(continua_busca == true){
            
            controlador = procuraPixel(controlador, fragmento.getPixel(0,0));
            
            if(controlador[2] == 1){ //o retorno da função procuraPixel() foi positivo
                for (int iFrag = 0, iImag = controlador[1]; iFrag < fragmento.getAltura(); iFrag++, iImag++){
                    for (int jFrag = 0, jImag = controlador[0]; jFrag < fragmento.getLargura(); jFrag++, jImag++){
                        if(this.getPixel(jImag, iImag) != fragmento.getPixel(jFrag, iFrag)){  //não achou uma igualdade, precisa voltar a procurar
                            
                            // EXCEÇÃO CASO 1 A posicao do controlador de largura é a ultima coluna da imagem
                            if(controlador[0] == this.getLargura()-1){ // verifica se a posicao do controlador de largura já foi a última coluna da imagem
                                 if(controlador[1] == this.getAltura()-1){ // verifica se a posicao do controlador de alura já foi a última coluna da imagem
                                    System.out.println("TesteEXC1if");
                                    continua_busca = false; // guarda para encerrar while
                                    retorno = false;
                                    ecx = true;
                                    break;
                                }else{
                                    // se não, vai para a proxima linha
                                    System.out.println("TesteEXC1else");
                                    controlador[1] = controlador[1] + 1; // incrementa altura
                                    break; //retorna ao primeiro laço
                                }
                            }
                        
                            
                            // EXCEÇÃO CASO 2 A posição do controlador de altura é a ultima da imagem   
                            else if(controlador[1] == this.getAltura()-1){  
                                if(fragmento.getAltura() > 1){ // se a posição de altura do fragmento não é a ultima da imagem   
                                    System.out.println("TesteEXC2");
                                    continua_busca = false; // guarda para encerrar while
                                    retorno = false;
                                    ecx = true;
                                    break;
                                }
                            }
                            
                            // EXCEÇÃO CASO 3 Não igualou pixels, mas ainda tem posições a comparar
                            else{
                                System.out.println("TesteEXC3");
                                controlador[0] = jImag;
                                controlador[1] = iImag;
                                iFrag = 0;
                                jFrag = 0;
                                ecx = true;
                                break;
                            }                       
                        }
                        else{
                            if ((iFrag == (fragmento.getAltura() - 1)) && (jFrag == (fragmento.getLargura() - 1))){// verifica ińtegra do fragmento na imagem
                                System.out.println("TesteACHAPIXEL");
                                retorno = true; // retorna true
                                continua_busca = false; // guarda para encerrar while
                                break; //quebra primeiro laço for
                            }
                        }
                    }
                if ((retorno = true) || (ecx = true));
                    break; //quebra segundo laço
                }
            }else{ //o retorno da função procuraPixel() foi negativo e sai do while
                retorno = false;
                continua_busca = false;
            }
        }
        return retorno;
    }            
}