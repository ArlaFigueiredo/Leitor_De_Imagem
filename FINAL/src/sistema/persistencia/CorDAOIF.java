package sistema.persistencia;

import java.util.Collection;

import sistema.model.entity.Cor;
import sistema.model.entity.Simbolo;

public interface CorDAOIF {

	public void inserir(Cor c) throws Exception;
	public Cor findByName(String nome) throws Exception;	
	public Collection<Cor> findBySimbolo(Simbolo simbolo) throws Exception;	
}