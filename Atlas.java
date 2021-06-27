public class Atlas{
    private Mapa[] mapas = new Mapa[0];
    
    
    public void adicionaMapa(Mapa mapa){

        Mapa[] novo = new Mapa[this.mapas.length + 1];

        for(int i = 0; i < this.mapas.length; i++)
          novo[i] = this.mapas[i];
      
        novo[novo.length - 1] = mapa;
        this.mapas = novo;
    };

    // TODO: Método para trazer mapas de acordo com a similaridade     
    
}
