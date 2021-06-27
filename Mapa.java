public abstract class Mapa{
    
    private int id;
    private String descricao;
    
    public Mapa(int id, String descricao){
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

    public int area(){
        return this.getAltura() * this.getLargura();
    };

    public double getSimilaridade(int red, int green, int blue, double limiarLuminosidade){

        double pixelsSimilares = 0;

        for(int x = 0; x <= this.getAltura(); x++)
          for(int y = 0; y <= this.getLargura(); y++){
              
          }     

    }   
}
