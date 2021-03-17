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

    private void setRed(int red){
        this.red = red;
    }    

    private void setGreen(int green){
        this.green = green;
    }

    private void setBlue(int blue){
        this.blue = blue;
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
}
