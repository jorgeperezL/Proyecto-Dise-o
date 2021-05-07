package PatronAbstractFactory;

import PatronStrategy.*;

public class ArqueroDesierto extends Enemigo {

	ArqueroDesierto(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia,algoritmo);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Arquero lanza su flecha Desiertosa!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Arquero hace su defensa Desiertosa!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Arquero utiliza la arena del Desierto como defensa");
	}
}