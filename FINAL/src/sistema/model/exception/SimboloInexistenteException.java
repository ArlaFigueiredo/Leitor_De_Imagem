package sistema.model.exception;

public class SimboloInexistenteException extends Exception {
	
	private int idSimbolo;
	
	public SimboloInexistenteException(int idSimbolo) {
		super();
		this.idSimbolo = idSimbolo;
	}
	
	public int idSimbolo() {
		return this.idSimbolo;
	}
}	