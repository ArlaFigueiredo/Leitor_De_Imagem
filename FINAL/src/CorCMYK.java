public class CorCMYK extends Cor
{
    public static final CorCMYK PRETA = new CorCMYK(0,0,0,1);
    public static final CorCMYK BRANCA = new CorCMYK(0,0,0,0);
    public static final CorCMYK CYAN = new CorCMYK(100,0,0,0);
    public static final CorCMYK MAGENTA = new CorCMYK(0,100,0,0);
    public static final CorCMYK YELLOW = new CorCMYK(0,0,100,0);
    public static final CorCMYK KEY = new CorCMYK(0,0,0,100);
    public static final CorCMYK YELLOWSAND = new CorCMYK(0,8,77,0);
    public static final CorCMYK GREENTREE = new CorCMYK(100,0,100,0);
    public static final CorCMYK BLUEWATER = new CorCMYK(100,100,0,0);
    public static final CorCMYK GRAY = new CorCMYK(0,0,0,38);
    public static final CorCMYK BROWN = new CorCMYK(0,30,40,53);
        
    private int cyan;
    private int magenta;
    private int yellow;
    private int key;

    
    public CorCMYK(){
        this(0,0,0,1);
    };
    
    public CorCMYK (int cyan, int magenta, int yellow, int key){
        this.setCyan(cyan);
        this.setMagenta(magenta);
        this.setYellow(yellow);
        this.setKey(key);
    };
    
    public int getCyan(){
        return this.cyan;
    };    

    public int getMagenta(){
        return this.magenta;
    };

    public int getYellow(){
        return this.yellow;
    };

    public int getKey(){
        return this.key;
    };

    private void setCyan(int cyan){
        this.cyan = verificaCMYK(cyan);
    };   

    private void setMagenta(int magenta){
        this.magenta = verificaCMYK(magenta);
    };

    private void setYellow(int yellow){
        this.yellow = verificaCMYK(yellow);
    };

    private void setKey(int key){
        this.key = verificaCMYK(key);
    };


    public int getLuminosidade(){
        return  (int)((this.getKey() * 255) / 100);
    };
    
    
    private int verificaCMYK (int num){
        if (num>100)
            num = 100;
        if (num<0)
            num = 0;
        return num;
    };
}