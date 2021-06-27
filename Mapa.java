public abstract class Mapa{
    
    private int id;
    private String descricao;
    
    public Mapa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }; 
    
    protected abstract Cor getPixel(int x, int y); 
    protected abstract void setPixel(int x, int y, Cor pixel);
    protected abstract Cor[][] getImagem();
    
    public int getAltura(){
        return this.getImagem().length;
    };  

    public int getLargura(){
        return this.getImagem()[0].length;
    };

    // TODO: Método para verificar similaridade dos pixels da imagem do mapa   
}