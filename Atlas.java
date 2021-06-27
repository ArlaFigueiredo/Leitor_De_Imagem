public class Atlas{
    private Mapa[] mapas = new Mapa[0];
    
    
    public void adicionaMapa(Mapa mapa){

        Mapa[] novo = new Mapa[this.mapas.length + 1];

        for(int i = 0; i < this.mapas.length; i++)
          novo[i] = this.mapas[i];
      
        novo[novo.length - 1] = mapa;
        this.mapas = novo;
    };

    public Atlas getMapasPorLuminosidade(int red, int green, int blue, double pctMinimo, double limiarLuminosidade){

        Atlas mapasSimilares = new Atlas();

        for(int i = 0; i < this.mapas.length; i++){
            if(this.mapas[i].getPercentualPixelsSimilares(new CorRGB(red, green, blue), double limiarLuminosidade) >= pctMinimo){
                mapasSimilares.adicionaMapa(this.mapas[i]); 
            }
            
        } 
        return mapasSimilares;     
    };
    
}
