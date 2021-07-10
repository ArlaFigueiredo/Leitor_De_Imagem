public class ConversorCMYKToRGB implements ConversorCor{
    
    public Mapa getNovoMapa(int altura, int largura){
        return new MapaRGB(null, null, altura, largura);
    };    
    
    public Cor converter(Cor cor){
        CorCMYK corCMYK = (CorCMYK) cor;
        CorRGB pixel = new CorRGB(
                                (int)(255 * (1 - ((double)corCMYK.getCyan()/100)) *  (1-((double)corCMYK.getKey()/100))), 
                                (int)(255 * (1 - ((double)corCMYK.getMagenta()/100)) *  (1-((double)corCMYK.getKey()/100))),
                                (int)(255 * (1 - ((double)corCMYK.getYellow()/100)) *  (1-((double)corCMYK.getKey()/100)))
                            );
        return pixel;
    };  
    
}