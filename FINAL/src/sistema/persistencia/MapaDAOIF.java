package sistema.persistencia;

import java.io.IOException;

import sistema.model.Mapa;

public interface MapaDAOIF {
	
	public void salvar(Mapa mapa)throws IOException;
	public Mapa ler(String caminhoArquivoMapa)throws IOException, ClassNotFoundException;
}
