package sistema.model.entity;

public abstract class Cor{
 
	private String id;
	private String simbolo;
	private String nome;
	
    public Cor(String id, String simbolo, String nome){
        this.setId(id);
        this.setSimbolo(simbolo);
        this.setNome(nome);
    } 
	
    public abstract int getLuminosidade();
    
    private void setId(String id){ 
    	this.id = id; 
    }
    
    private void setSimbolo(String simbolo){ 
    	this.simbolo = simbolo; 
    }
    
   private void setNome(String nome){ 
    	this.nome = nome; 
    }
   
   public String getId(){ 
	   return this.id; 
   }
   
   public String getSimbolo(){ 
	   return this.simbolo; 
   }
   
   public String getNome(){ 
	   return this.nome; 
   }
    
    public int getSimilaridade(Cor outro){
        return (int)(Math.abs(this.getLuminosidade() - outro.getLuminosidade()));
    };    
    
}
