package PatronDecorator;

public abstract class Decorator implements Enemigo{
	
	protected Enemigo enemigo;

	public Decorator(Enemigo enemigo) {
		this.enemigo = enemigo;
	}
	
	public int sigienteAccion() {
		return enemigo.siguienteAccion();
	}
	
}

