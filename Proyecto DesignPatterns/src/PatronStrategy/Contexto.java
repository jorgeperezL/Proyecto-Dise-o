package PatronStrategy;

public class Contexto {
	private Strategies algoritmo;
	
	public Contexto() {
		
	}
	
	public void execute() {
		algoritmo.executeType();
	}
	
	public void setType(Strategies algoritmo) {
		this.algoritmo=algoritmo;
	}
	
}
