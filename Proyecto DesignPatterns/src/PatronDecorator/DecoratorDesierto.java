package PatronDecorator;

public class DecoratorDesierto extends Decorator{

	public DecoratorDesierto(Enemigo componente) {
		super(componente);
		
	}

	

	public void sonidoDeAtaque() {
		
		super.enemigo.sonidoDeAtaque();
		System.out.println("Estamos en el desierto!!");
	}
	public void sonidoDeDefensa() {
		
		super.enemigo.sonidoDeAtaque();
		System.out.println("Estamos en el desierto!!");
	}
	public void sonidoDeDefendiendo() {
		
		super.enemigo.sonidoDeDefendiendo();
		System.out.println("Estamos en el desierto!!");
	}


	

}
