package sistema.model;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import sistema.model.entity.Cor;

public abstract class Mapa implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
    private String descricao;
    
    public Mapa(String id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }; 
    
    public abstract Cor getPixel(int posicao_altura, int posicao_largura); 
    public abstract void setPixel(int posicao_altura, int posicao_largura, Cor pixel);
    public abstract Cor[][] getImagem();
    public abstract String getCodTipo();

    public String getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setId(String id){
        this.id = id;
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
    
    public double getPercentualPixelsEquivaletes(Cor cor){

        int pixelsEquivalentes = 0;
        
        for(int x = 0; x < this.getAltura(); x++) {
          for(int y = 0; y < this.getLargura(); y++){
            if( this.getPixel(x, y).equals(cor))
            	pixelsEquivalentes++;
          } 
        }
        
        return (double) pixelsEquivalentes/this.getArea() * 100;
    }

    public String toString(){
        return "Mapa [" + this.getId() + "] " + this.getDescricao() + " - Formato *" + this.getCodTipo();
    }
    
    
}