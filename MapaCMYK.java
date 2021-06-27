public class MapaCMYK extends Mapa
{
    private CorCMYK[][] imagem;

    public MapaCMYK(int id, String descricao, CorRGB[][] imagem){
        super(id, descricao);
        this.imagem = imagem;
    }; 
    
    protected Cor[][] getImagem(){
        return this.imagem;
    };
    
    protected Cor getPixel(int posicao_altura, int posicao_largura){
         return this.imagem[posicao_altura][posicao_largura];
    }; 
    
    protected void setPixel(int posicao_altura, int posicao_largura, Cor pixel){
        this.imagem[posicao_altura][posicao_largura] = (CorCMYK)pixel;
    };  
    
}
