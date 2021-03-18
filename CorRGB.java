public class CorRGB
{
    private int red;
    private int green;
    private int blue;
    private double luminosidade;

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
        this.luminosidade = Math.ceil(( this.getRed() * 0.3 +
                this.getGreen() * 0.59 + 
                this.getBlue() * 0.11   )/255);
        return luminosidade;
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
    
    public boolean equals(CorRGB no){
        return ((this.getRed() == no.getRed()) && (this.getGreen() == no.getGreen()) && (this.getBlue() == no.getBlue()));
    }
    
}
