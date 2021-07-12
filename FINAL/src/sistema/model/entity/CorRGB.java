package sistema.model.entity;

import sistema.model.entity.Simbolo;

public class CorRGB extends Cor
{  
    private int red;
    private int green;
    private int blue;


    public CorRGB(){
        this(null, null, null, 0, 0, 0);
    }
    
    public CorRGB (String id, Simbolo simbolo, String nome, int red, int green, int blue){
    	super (id, simbolo, nome);
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }
    
    public CorRGB(int red, int green, int blue) {
    	super(null,null,null);
    	this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }
 
    
    public int getRed(){
        return this.red;
    }   

    public int getGreen(){
        return this.green;
    }

    public int getBlue(){
        return this.blue;
    }

    private void setRed(int red){
        this.red = verificaRGB(red);
    }   

    private void setGreen(int green){
        this.green = verificaRGB(green);
    }

    private void setBlue(int blue){
        this.blue = verificaRGB(blue);
    }

    public int getLuminosidade(){
        return  (int)(this.getRed() * 0.3 +
                this.getGreen() * 0.59 + 
                this.getBlue() * 0.11);
    }
    
    private int verificaRGB (int num){
        if (num>255)
            num = 255;
        if (num<0)
            num = 0;
        return num;
    }
    
    public CorRGB geraRGB() {
    	CorRGB pixel = new CorRGB(this.getId(),this.getSimbolo(), this.getNome(), this.getRed(), this.getGreen(), this.getBlue());
		return pixel;
    }
    
    public boolean equals(Cor no){
    	if(no instanceof CorRGB) 
    		return ((this.getRed() == ((CorRGB) no).getRed()) && (this.getGreen() == ((CorRGB) no).getGreen()) && (this.getBlue() == ((CorRGB) no).getBlue()));
    	else {
    		CorRGB corTransformada = no.geraRGB();
    		return ((this.getRed() == ((CorRGB) corTransformada).getRed()) && 
    				(this.getGreen() == ((CorRGB) corTransformada).getGreen()) && 
    				(this.getBlue() == ((CorRGB) corTransformada).getBlue()));
    	}	
    }
    
}
