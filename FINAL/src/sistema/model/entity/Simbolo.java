package sistema.model.entity;

public class Simbolo{
 
	private int id;
	private String nome;
	
    public Simbolo(int id, String nome){
    	this.setId(id);
        this.setNome(nome);
    } 
    
    private void setNome(String nome){ 
	   this.nome = nome; 
    }	
   
    public String getNome(){ 
	   return this.nome; 
    }
   
    private void setId(int id){ 
   		this.id = id; 
    }
  
    public int getId(){ 
	   return this.id; 
    }
    
    public String toString() {
		return this.getNome();
    }  
}
