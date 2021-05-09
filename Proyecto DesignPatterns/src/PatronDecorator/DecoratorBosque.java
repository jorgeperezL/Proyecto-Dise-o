package PatronDecorator;

public class DecoratorBosque extends Decorator{

	public DecoratorBosque(Enemigo enemigo) {
		super(enemigo);
		
	}

	
	public void sonidoDeAtaque() {
		super.enemigo.sonidoDeAtaque();
		System.out.println("Estamos en el bosque!!");
		
	}
	public void sonidoDeDefensa() {
		super.enemigo.sonidoDeAtaque();
		System.out.println("Estamos en el bosque!!");
	}
	public void sonidoDeDefendiendo() {
		
		super.enemigo.sonidoDeDefendiendo();
		System.out.println("Estamos en el bosque!!");
	}



}
