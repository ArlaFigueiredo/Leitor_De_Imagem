package sistema.model.exception;

public class SimboloInexistenteException extends Exception {
	
	private int idSimbolo;
	private String nomeSimbolo;
	
	public SimboloInexistenteException(int idSimbolo) {
		super();
		this.idSimbolo = idSimbolo;
	}
	
	public SimboloInexistenteException(String nomeSimbolo) {
		super();
		this.nomeSimbolo = nomeSimbolo;
	}
	
	public int idSimbolo() {
		return this.idSimbolo;
	}
	
	public String nomeSimbolo() {
		return this.nomeSimbolo;
	}
}	