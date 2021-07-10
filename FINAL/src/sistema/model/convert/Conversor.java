package sistema.model.convert;

public class Conversor {

    public Mapa converter(Mapa mapa, ConversorCor conversor){

        Mapa novo = conversor.getNovoMapa(mapa.getAltura(), mapa.getLargura());
        
        for(int contAlt = 0; contAlt < mapa.getAltura(); contAlt++){
            for(int contLarg = 0; contLarg < mapa.getLargura(); contLarg++){
                Cor cor = mapa.getPixel(contAlt, contLarg);
                Cor novaCor = conversor.converter(cor);
                novo.setPixel(contAlt, contLarg, novaCor);
            }
        }
        
                
        novo.setDescricao(mapa.getDescricao());
        novo.setId("[C�pia] "+ mapa.getId());
        return novo;
    }
}