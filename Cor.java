public abstract class Cor{
    
    public abstract int getLuminosidade();
      

    public int getSimilaridade(Cor outro){
        return (int)(Math.abs(this.getLuminosidade() - outro.getLuminosidade()));
    };    
    
}
