public class MapaRGB extends Mapa
{
    private CorRGB[][] imagem;

    public MapaRGB(String id, String descricao, CorRGB[][] imagem){
        super(id, descricao);
        this.imagem = imagem;
    } 

    public MapaRGB(String id, String descricao, int altura, int largura){
        super(id, descricao);
        this.imagem = new CorRGB[altura][largura];
    }
    
    protected Cor[][] getImagem(){
        return this.imagem;
    }
    
    protected Cor getPixel(int posicao_altura, int posicao_largura){
        return (CorRGB)this.imagem[posicao_altura][posicao_largura];
    } 
    
    protected void setPixel(int posicao_altura, int posicao_largura, Cor pixel){
        this.imagem[posicao_altura][posicao_largura] = (CorRGB)pixel;
    }

    public String getCodTipo(){
        return "RGB";
    } 
    
}
