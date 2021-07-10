package sistema.persistencia;

import java.util.Collection;

import sistema.model.entity.Cor;

public interface CorDAOIF {

	public void inserir(Cor c) throws Exception;
	public Cor findByName(String nome) throws Exception;	
	public Collection<Cor> findBySimbolo(String simbolo) throws Exception;	
}