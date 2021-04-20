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

        while(cont < 4){
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
                        // Se achar um pixel diferente, irá tentar virar a imagem
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
                if(vira){
                    imagem = viraImagem(imagem);
                    cont++;
                    vira = false;
                    break;
                }
            }
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

    private int[] procuraPixel(int controlador[], Imagem fragmento){
        boolean stop = false;
        for (int i = controlador[1]; i < this.getAltura(); i++){
            for (int j = controlador[0]; j < this.getLargura(); j++){
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

                controlador = procuraPixel(controlador, fragmento);
    
                if(controlador[0] != -1){ //o retorno da função procuraPixel() foi positivo
                    for (int iFrag = 0, iImag = controlador[1]; iFrag < fragmento.getAltura(); iFrag++, iImag++){
                        for (int jFrag = 0, jImag = controlador[0]; jFrag < fragmento.getLargura(); jFrag++, jImag++){
    
                            if(!this.getPixel(jImag, iImag).equals(fragmento.getPixel(jFrag, iFrag))){  //não achou uma igualdade, precisa voltar a procurar
    
                                // EXCEÇÃO CASO 1 A posicao do controlador de largura é a ultima coluna da imagem
                                if(controlador[0] == this.getLargura()-1){ // verifica se a posicao do controlador de largura já foi a última coluna da imagem
                                    if(controlador[1] == this.getAltura()-1){
                                        continua_busca =false;
                                        vira = true;
                                        stop = true;
                                        break;
                                    }else{
                                        // se não, vai para a proxima linha
                                        stop = true;
                                        controlador[1] =+ 1; // incrementa altura
                                        controlador[0] = 0;
                                        break; //retorna ao primeiro laço
                                    }
                                }
    
                                // EXCEÇÃO CASO 2 A posição do controlador de altura é a ultima da imagem   
                                else if(controlador[1] == this.getAltura()-1){  
                                    if(fragmento.getAltura() > 1){ // se a posição de altura do fragmento não é a ultima da imagem   
                                        continua_busca = false; // guarda para encerrar while
                                        vira = true;
                                        stop = true;
                                        break;
                                    }
                                    else{
                                        controlador[0] += 1;
                                        stop = true;
                                        break;
                                    }
                                }
                                // EXCEÇÃO CASO 3 Não igualou pixels, mas ainda tem posições a comparar
                                else{
                                    controlador[0] += 1;
                                    stop = true;
                                    break;
                                }                       
                            }
                            else{
                                if ((iFrag == (fragmento.getAltura() - 1)) && (jFrag == (fragmento.getLargura() - 1))){// verifica ińtegra do fragmento na imagem
                                    retorno = true; // retorna true
                                    continua_busca = false; // guarda para encerrar while
                                    cont  = 4;
                                }
                            }
                        }
                        if(stop)
                            break; //quebra segundo laço
                    }
                }else{ //o retorno da função procuraPixel() foi negativo e sai do while
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
