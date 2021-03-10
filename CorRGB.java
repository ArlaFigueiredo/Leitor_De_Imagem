public class CorRGB
{
    private int red;
    private int green;
    private int blue;
    private double luminosidade;
    
    
    public double getLuminosidade(){
        this.luminosidade = Math.ceil(( this.red * 0.3 +
                                        this.green * 0.59 + 
                                        this.blue * 0.11   )/255);
         return luminosidade;
    }
}
