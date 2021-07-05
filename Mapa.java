public abstract class Mapa{
    
    private String id;
    private String descricao;
    
    public Mapa(String id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }; 
    
    protected abstract Cor getPixel(int posicao_altura, int posicao_largura); 
    protected abstract void setPixel(int posicao_altura, int posicao_largura, Cor pixel);
    protected abstract Cor[][] getImagem();
    public abstract String getCodTipo();

    public String getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }
    
    public int getAltura(){
        return this.getImagem().length;
    }  

    public int getLargura(){
        return this.getImagem()[0].length;
    }

    public int getArea(){
        return this.getAltura() * this.getLargura();
    }
    
    public double getPercentualPixelsSimilares(Cor cor, double limiarLuminosidade){

        int pixelsSimilares = 0;
        int luminosidadeMaxima =(int) (cor.getLuminosidade() + (cor.getLuminosidade()*limiarLuminosidade/100));
        int luminosidadeMinima =(int) (cor.getLuminosidade() - (cor.getLuminosidade()*limiarLuminosidade/100));
        
        
        for(int x = 0; x < this.getAltura(); x++) {
          for(int y = 0; y < this.getLargura(); y++){
            int luminosidade = this.getPixel(x, y).getLuminosidade();
            if(luminosidade <= luminosidadeMaxima && luminosidade >= luminosidadeMinima)
                pixelsSimilares = pixelsSimilares + 1;
          } 
        }
        
        return (double) pixelsSimilares/this.getArea() * 100;
    }

    public String toString(){
        return "Mapa [" + this.getId() + "] " + this.getDescricao() + " - Formato *" + this.getCodTipo();
    }   
}
