public class Atlas{
    private Mapa[] mapas = new Mapa[0];
    
    
    public void adicionaMapa(Mapa mapa){

        Mapa[] novo = new Mapa[this.mapas.length + 1];

        for(int i = 0; i < this.mapas.length; i++)
          novo[i] = this.mapas[i];
      
        novo[novo.length - 1] = mapa;
        this.mapas = novo;
    };

    public Mapa[] getMapasPorLuminosidade(int red, int green, int blue, double pctMinimo, double limiarLuminosidade){

        Mapa[] mapasSimilares = new Mapa[this.mapas.length];
        int cont = 0;

        for(int i = 0; i < this.mapas.length; i++){
            if(this.mapas[i].getSimilaridade(int red, int green, int blue, double limiarLuminosidade) >= pctMinimo){
                mapasSimilares[cont] = this.mapas[i]; 
            }
            
        }      
    }
    
}
