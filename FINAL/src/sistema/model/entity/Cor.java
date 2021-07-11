package sistema.model.entity;

import java.io.Serializable;
import sistema.model.entity.Simbolo;

public abstract class Cor implements Serializable{
 
	private static final long serialVersionUID = 1L;
	private String id;
	private Simbolo simbolo;
	private String nome;
	
    public Cor(String id, Simbolo simbolo, String nome){
        this.setId(id);
        this.setSimbolo(simbolo);
        this.setNome(nome);
    } 
	
    public abstract int getLuminosidade();
    
    private void setId(String id){ 
    	this.id = id; 
    }
    
    private void setSimbolo(Simbolo simbolo){ 
    	this.simbolo = simbolo; 
    }
    
   private void setNome(String nome){ 
    	this.nome = nome; 
    }
   
   public String getId(){ 
	   return this.id; 
   }
   
   public Simbolo getSimbolo(){ 
	   return this.simbolo; 
   }
   
   public String getNome(){ 
	   return this.nome; 
   }
    
    public int getSimilaridade(Cor outro){
        return (int)(Math.abs(this.getLuminosidade() - outro.getLuminosidade()));
    };
    
    public String toString() {
  		return this.getNome();
    }
    
}
