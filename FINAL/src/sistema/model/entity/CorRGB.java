package sistema.model.entity;

import sistema.model.entity.Simbolo;

public class CorRGB extends Cor
{
    public static final CorRGB PRETA = new CorRGB(0,0,0);
    public static final CorRGB BRANCA = new CorRGB(255,255,255);
    public static final CorRGB RED = new CorRGB(255,0,0);
    public static final CorRGB GREEN = new CorRGB(0,255,0);
    public static final CorRGB BLUE = new CorRGB(0,0,255);
    public static final CorRGB BROWN = new CorRGB(121,85,72);
        
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
    
    public boolean equals(CorRGB no){
        return ((this.getRed() == no.getRed()) && (this.getGreen() == no.getGreen()) && (this.getBlue() == no.getBlue()));
    }
    
}
