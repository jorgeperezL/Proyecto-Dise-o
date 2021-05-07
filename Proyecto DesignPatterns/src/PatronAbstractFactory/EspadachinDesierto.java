package PatronAbstractFactory;

import PatronStrategy.*;

public class EspadachinDesierto extends Enemigo {

	EspadachinDesierto(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia,algoritmo);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Espadachin lanza su ataque de espada Desiertoso!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Espadachin hace su defensa Desiertosa!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Espadachin utiliza su espada del Desierto como defensa");
	}
}