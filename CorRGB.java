public class CorRGB
{
    public static final CorRGB PRETA = new CorRGB(0,0,0);
    public static final CorRGB BRANCA = new CorRGB(255,255,255);
    public static final CorRGB RED = new CorRGB(255,0,0);
    public static final CorRGB GREEN = new CorRGB(0,255,0);
    public static final CorRGB BLUE = new CorRGB(0,0,255);
        
    private int red;
    private int green;
    private int blue;

    public CorRGB (CorRGB no){
        this(no.getRed(), no.getGreen(), no.getBlue());    
    }
    
    public CorRGB(){
        this(0,0,0);
    }
    
    public CorRGB (int red, int green, int blue){
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

    public double getLuminosidade(){
        return  Math.ceil(this.getRed() * 0.3 +
                this.getGreen() * 0.59 + 
                this.getBlue() * 0.11);
    }
    
    public CorRGB cinza(){
        int cinza = (int) this.getLuminosidade();
        CorRGB novaCor = new CorRGB(cinza,cinza,cinza);
        return novaCor;
    }

    public String getCorHexadecimal(){
        return ("#" + Integer.toHexString(this.getRed()) + Integer.toHexString(this.getGreen()) + Integer.toHexString(this.getBlue())).toUpperCase();
    }
    
    public CorRGB geraCopia(){
        return new CorRGB(this.getRed(), this.getGreen(), this.getBlue());
    }
    
    private int verificaRGB (int num){
        if (num>255)
            num = 255;
        if (num<0)
            num = 0;
        return num;
    }
    
    public void clarear(double percentual){
        
        percentual = (percentual / 100) + 1;
            
        this.setRed((int)(Math.round(this.getRed()*percentual)));
        
        this.setGreen((int)(Math.round(this.getGreen()*percentual)));
        
        this.setBlue((int)(Math.round(this.getBlue()*percentual)));
    }
    
    public void escurecer(double percentual){
        
        percentual = 1 - (percentual / 100);
        
        this.setRed((int)(Math.round(this.getRed()*percentual)));
        
        this.setGreen((int)(Math.round(this.getGreen()*percentual)));
    
        this.setBlue((int)(Math.round(this.getBlue()*percentual)));
    }
    
    
    
    public boolean equals(CorRGB no){
        return ((this.getRed() == no.getRed()) && (this.getGreen() == no.getGreen()) && (this.getBlue() == no.getBlue()));
    }
    
}
