package sistema.model.convert;

import sistema.model.Mapa;
import sistema.model.MapaRGB;
import sistema.model.entity.Cor;
import sistema.model.entity.CorCMYK;
import sistema.model.entity.CorRGB;

public class ConversorCMYKToRGB implements ConversorCor{
    
    public Mapa getNovoMapa(int altura, int largura){
        return new MapaRGB(null, null, altura, largura);
    };    
    
    public Cor converter(Cor cor){
        CorCMYK corCMYK = (CorCMYK) cor;
        CorRGB pixel = new CorRGB(null,null,null,
                                (int)(255 * (1 - ((double)corCMYK.getCyan()/100)) *  (1-((double)corCMYK.getKey()/100))), 
                                (int)(255 * (1 - ((double)corCMYK.getMagenta()/100)) *  (1-((double)corCMYK.getKey()/100))),
                                (int)(255 * (1 - ((double)corCMYK.getYellow()/100)) *  (1-((double)corCMYK.getKey()/100)))
                            );
        return pixel;
    };  
    
}