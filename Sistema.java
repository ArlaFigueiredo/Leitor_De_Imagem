public class Sistema{

    private Atlas atlas;


    public Sistema(){
        
        this.atlas = new Atlas();
    }    
    
    public void init(){
        
            CaptadorDeImagens captador = new CaptadorDeImagens();
            
            MapaRGB mapa1 = new MapaRGB("EST01","Estrada da Lama",captador.captaEstrada());
            MapaRGB mapa2 = new MapaRGB("PNT68","Ponte Rio São Francisco",captador.captaPonte());
            MapaRGB mapa3 = new MapaRGB("FLR90","Floresta Amazônia",captador.captaFloresta());
          
            MapaCMYK mapa4 = new MapaCMYK("PRT45","Porto Rio Douro",captador.captaPorto());
            MapaCMYK mapa5 = new MapaCMYK("PRA89","Praia do Forte",captador.captaPraia());
            MapaCMYK mapa6 = new MapaCMYK("RDV03","Rodovia 324",captador.captaRodovia());
           
            
            this.atlas.adicionaMapa(mapa1);
            this.atlas.adicionaMapa(mapa2);
            this.atlas.adicionaMapa(mapa3);
            this.atlas.adicionaMapa(mapa4);
            this.atlas.adicionaMapa(mapa5);
            this.atlas.adicionaMapa(mapa6);

    }

    public void run(){
        for(Mapa m : this.atlas)
           System.out.println(m);

        //TODO IMPLEMENTAR A BUSCA POR SIMILARIDADE DOS MAPAS RGB ACIMA
        
        //TODO IMPLEMENTAR A CONVERSÃO DOS MAPAS CMYK PARA RGB

    }
    
    public static void main(String[] args){
        
        Sistema app = new  Sistema();
        app.init();
        app.run();   
        
    }         
}
