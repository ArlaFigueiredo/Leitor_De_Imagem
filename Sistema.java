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
        for(Mapa mapa : this.atlas.getMapas())
            System.out.println(mapa);
        //TODO IMPLEMENTAR A BUSCA POR SIMILARIDADE DOS MAPAS RGB ACIMA
        
        System.out.println("Mapas Similares :");
        Mapa[] mapasSimilares = this.atlas.getMapasPorLuminosidade(15,15,255,30,69);
        for(Mapa mapaSimilar : mapasSimilares)
            System.out.println(mapaSimilar);
        
        //TODO IMPLEMENTAR A CONVERSÃO DOS MAPAS CMYK PARA RGB

        Conversor conversor = new Conversor();
        ConversorCMYKToRGB conversorCMYKToRGB = new ConversorCMYKToRGB();

        MapaRGB mapa5rgb = (MapaRGB) conversor.converter(this.atlas.getMapas()[3], conversorCMYKToRGB);

    }
    
    public static void main(String[] args){
        
        Sistema app = new  Sistema();
        app.init();
        app.run();   
        
    }         
}