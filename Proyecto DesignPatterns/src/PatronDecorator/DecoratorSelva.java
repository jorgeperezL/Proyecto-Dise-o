package PatronDecorator;

public class DecoratorSelva extends Decorator{

	public DecoratorSelva(Enemigo componente) {
		super(componente);
		
	}
	
	
	public void sonidoDeAtaque() {
		
		super.enemigo.sonidoDeAtaque();
		System.out.println("Estamos en la selva!");
	}
	public void sonidoDeDefensa() {
		
		super.enemigo.sonidoDeAtaque();
		System.out.println("Estamos en la selva!");
	}
	public void sonidoDeDefendiendo() {
		
		super.enemigo.sonidoDeDefendiendo();
		System.out.println("Estamos en la selva!");
	}


}
