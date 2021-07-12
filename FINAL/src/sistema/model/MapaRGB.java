package sistema.model;

import sistema.model.entity.Cor;
import sistema.model.entity.CorRGB;

public class MapaRGB extends Mapa
{
    private CorRGB[][] imagem;

    public MapaRGB(String id, String descricao, CorRGB[][] imagem){
        super(id, descricao);
        this.imagem = imagem;
    } 
    
    public Cor[][] getImagem(){
        return this.imagem;
    }
    
    public Cor getPixel(int posicao_altura, int posicao_largura){
        return (CorRGB)this.imagem[posicao_altura][posicao_largura];
    } 
    
    public void setPixel(int posicao_altura, int posicao_largura, Cor pixel){
        this.imagem[posicao_altura][posicao_largura] = (CorRGB)pixel;
    }

    public String getCodTipo(){
        return "RGB";
    } 
    
}