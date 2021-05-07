package PatronDecorator;

public abstract class Decorator implements Enemigo{
	
	protected Enemigo enemigo;

	public Decorator(Enemigo enemigo) {
		this.enemigo = enemigo;
	}
	public void sonidoDeAtaque() {
		enemigo.sonidoDeAtaque();
	}
	public void sonidoDeDefensa() {
		enemigo.sonidoDeDefensa();
	}
	public void sonidoDeDefendiendo() {
		enemigo.sonidoDeDefendiendo();
	}
	
}

