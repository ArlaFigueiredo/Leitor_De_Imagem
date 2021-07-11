package sistema.model;

import sistema.model.entity.CorRGB;

public class Atlas{

    private Mapa[] mapas = new Mapa[0];
    
    
    public void adicionaMapa(Mapa mapa){

        Mapa[] novo = new Mapa[this.mapas.length + 1];

        for(int i = 0; i < this.mapas.length; i++)
          novo[i] = this.mapas[i];
      
        novo[novo.length - 1] = mapa;
        this.mapas = novo;
    }

    public Mapa[] getMapas(){

        return this.mapas;
    }

    public String toString(){
        String rep = "";
        for(Mapa mapa : this.mapas)
          rep = rep + mapa + "\n";
        return rep;  
    }
    
}