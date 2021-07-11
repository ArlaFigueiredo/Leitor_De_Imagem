package sistema.model;

import java.util.Collection;

public interface SistemaLogicaIF {
	
    public Collection<String> getElementos() throws Exception;
    public Collection<String> AnalisaArquivo(String caminhoArquivo, String elemento) throws Exception;

}