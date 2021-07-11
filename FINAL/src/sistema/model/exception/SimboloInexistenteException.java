package sistema.model.exception;

public class CorInexistenteException extends Exception {
	
	private int idSimbolo;
	
	public CorInexistenteException(int idSimbolo) {
		super();
		this.idSimbolo = idSimbolo;
	}
	
	public int idSimbolo() {
		return this.idSimbolo;
	}
}	