package sistema.model.entity;

import sistema.model.entity.Simbolo;

public class CorCMYK extends Cor
{  
    private int cyan;
    private int magenta;
    private int yellow;
    private int key;
    
    
    public CorCMYK(){
    	this(null, null, null, 0, 0, 0, 1);
    }
    
    public CorCMYK (String id, Simbolo simbolo, String nome, int cyan, int magenta, int yellow, int key){
    	super (id, simbolo, nome);
    	this.setCyan(cyan);
        this.setMagenta(magenta);
        this.setYellow(yellow);
        this.setKey(key);
    }
    
    public CorCMYK (int cyan, int magenta, int yellow, int key){
    	super (null, null, null);
    	this.setCyan(cyan);
        this.setMagenta(magenta);
        this.setYellow(yellow);
        this.setKey(key);
    }
    
    public int getCyan(){
        return this.cyan;
    }    

    public int getMagenta(){
        return this.magenta;
    }

    public int getYellow(){
        return this.yellow;
    }

    public int getKey(){
        return this.key;
    }

    private void setCyan(int cyan){
        this.cyan = verificaCMYK(cyan);
    }  


    private void setMagenta(int magenta){
        this.magenta = verificaCMYK(magenta);
    }

    private void setYellow(int yellow){
        this.yellow = verificaCMYK(yellow);
    }

    private void setKey(int key){
        this.key = verificaCMYK(key);
    }


    public int getLuminosidade(){
        return  (int)((this.getKey() * 255) / 100);
    }
    
    private int verificaCMYK (int num){
        if (num>100)
            num = 100;
        if (num<0)
            num = 0;
        return num;
    }
    
    public boolean equals(Cor cor){
    	
    	if(cor instanceof CorRGB) {
    		CorRGB corRgb = this.geraRGB();
    		return corRgb.equals(cor);
    	}
    	else 
    		return ((this.getCyan() ==((CorCMYK) cor).getCyan()) && (this.getMagenta() == ((CorCMYK) cor).getMagenta()) && (this.getYellow() == ((CorCMYK) cor).getYellow()) && (this.getKey() == ((CorCMYK) cor).getKey()));
	}
    
    public CorRGB geraRGB(){
     
        CorRGB pixel = new CorRGB(this.getId(),this.getSimbolo(), this.getNome(),
                                (int)(255 * (1 - ((double)this.getCyan()/100)) *  (1-((double)this.getKey()/100))), 
                                (int)(255 * (1 - ((double)this.getMagenta()/100)) *  (1-((double)this.getKey()/100))),
                                (int)(255 * (1 - ((double)this.getYellow()/100)) *  (1-((double)this.getKey()/100)))
                            );
        return pixel;
    }  
    
}
