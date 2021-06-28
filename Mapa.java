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
    
    public int getAltura(){
        return this.getImagem().length;
    };  

    public int getLargura(){
        return this.getImagem()[0].length;
    };

    public int getArea(){
        return this.getAltura() * this.getLargura();
    };
    
    public String getDescricao() {
    	return this.descricao;
    }

    public double getPercentualPixelsSimilares(CorRGB cor, double limiarLuminosidade){

        int pixelsSimilares = 0;

        for(int x = 0; x <= this.getAltura(); x++)
          for(int y = 0; y <= this.getLargura(); y++){
            int moduloPercenturalLuminosidade = (this.getPixel(x, y).getSimilaridade(cor) / this.getPixel(x, y).getLuminosidade()) * 100;
            if(moduloPercenturalLuminosidade <= limiarLuminosidade)
                pixelsSimilares = pixelsSimilares + 1;
          } 
        
        return pixelsSimilares / this.getArea();    

    }   
}
