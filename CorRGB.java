 public class CorRGB
{
    private int red;
    private int green;
    private int blue;
    private double luminosidade;
    
    public int getRed(){
        return this.red;
    }    
    
    public int getGreen(){
        return this.green;
    }
    
    public int getBlue(){
        return this.blue;
    }

    public void setRed(int red){
        this.red = red;
    }    
    
    public void setGreen(int green){
        this.green = green;
    }
    
    public void setBlue(int blue){
        this.blue = blue;
    }
    
    public double getLuminosidade(){
        this.luminosidade = Math.ceil(( this.red * 0.3 +
                                        this.green * 0.59 + 
                                        this.blue * 0.11   )/255);
         return luminosidade;
    }
}
