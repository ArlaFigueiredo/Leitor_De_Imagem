package sistema.persistencia;

import java.util.Collection;

import sistema.model.entity.Simbolo;

public interface SimboloDAOIF {

	public void inserir(Simbolo s) throws Exception;
	public Simbolo findById(int id) throws Exception;
	public Simbolo findByName(String nome) throws Exception;
	public Collection<Simbolo> findAll() throws Exception;	
}