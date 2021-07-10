package sistema.model.convert;

import sistema.model.Mapa;
import sistema.model.entity.Cor;

public interface ConversorCor{
    
    public Mapa getNovoMapa(int altura, int largura);    
    public Cor converter(Cor cor);    
}