package sistema.model;

import sistema.model.entity.Cor;
import sistema.model.entity.CorCMYK;

public class MapaCMYK extends Mapa
{
    private CorCMYK[][] imagem;

    public MapaCMYK(String id, String descricao, CorCMYK[][] imagem){
        super(id, descricao);
        this.imagem = imagem;
    } 
    
    public Cor[][] getImagem(){
        return this.imagem;
    }
    
    public Cor getPixel(int posicao_altura, int posicao_largura){
         return (CorCMYK) this.imagem[posicao_altura][posicao_largura];
    } 
    
    public void setPixel(int posicao_altura, int posicao_largura, Cor pixel){
        this.imagem[posicao_altura][posicao_largura] = (CorCMYK)pixel;
    }

    public String getCodTipo(){
        return "CMYK";
    }   
    
}