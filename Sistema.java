public class Sistema{
         
    
    public static void main(String[] args){
        
        Atlas atlas = new Atlas();
        
        CriadorDeMapas criador = new CriadorDeMapas();
        
        MapaRGB mapa1 = new MapaRGB("1","Mapa RGB de Estrada",criador.criarEstrada());
        MapaRGB mapa2 = new MapaRGB("2","Mapa RGB de Ponte",criador.criarPonte());
        MapaRGB mapa3 = new MapaRGB("3","Mapa RGB de Floresta",criador.criarFloresta());
      
        MapaCMYK mapa4 = new MapaCMYK("4","Mapa CMYK de Porto",criador.criarPorto());
        MapaCMYK mapa5 = new MapaCMYK("5","Mapa CMYK de Praia",criador.criarPraia());
        MapaCMYK mapa6 = new MapaCMYK("6","Mapa CMYK de Rodovia",criador.criarRodovia());
       
        
        atlas.adicionaMapa(mapa1);
        atlas.adicionaMapa(mapa2);
        atlas.adicionaMapa(mapa3);
        atlas.adicionaMapa(mapa4);
        atlas.adicionaMapa(mapa5);
        atlas.adicionaMapa(mapa6);
        
        atlas.listarMapas();
        
        
        //TODO IMPLEMENTAR A BUSCA POR SIMILARIDADE DOS MAPAS RGB ACIMA
        
        //TODO IMPLEMENTAR A CONVERSÃO DOS MAPAS CMYK PARA RGB
        
    };          
}
