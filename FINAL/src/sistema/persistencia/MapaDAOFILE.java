package sistema.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import sistema.model.Mapa;

public class MapaDAOFILE implements MapaDAOIF{

	 public void salvar(Mapa mapa) throws IOException {
	    	String nomeArquivoMapa = mapa.getDescricao().toUpperCase();
			FileOutputStream fout = new FileOutputStream("D:\\"+nomeArquivoMapa+".bin");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(mapa);
			oos.close();
	    }
	    
	    public Mapa ler(String caminhoArquivoMapa) throws IOException, ClassNotFoundException  {
	    	
	    	FileInputStream fin = new FileInputStream(caminhoArquivoMapa+".bin");
	    	ObjectInputStream ois = new ObjectInputStream(fin);
			Mapa mapa = (Mapa) ois.readObject();
			ois.close();
			return mapa;
	    }
}
