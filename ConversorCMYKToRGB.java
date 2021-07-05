public class ConversorCMYKToRGB implements ConversorCor{
    
    public Mapa getNovoMapa(int altura, int largura){
        return new MapaRGB(null, null, altura, largura);
    };    
    
    public Cor converter(Cor cor){
        CorCMYK corCMYK = (CorCMYK) cor;
        CorRGB pixel = new CorRGB(
                                (int) 255 * (1 - corCMYK.getCyan()) *  (1 - corCMYK.getKey()),
                                (int) 255 * (1 - corCMYK.getMagenta()) *  (1 - corCMYK.getKey()),
                                (int) 255 * (1 - corCMYK.getYellow()) *  (1 - corCMYK.getKey())
                            );
        return pixel;
    };  
    
}
