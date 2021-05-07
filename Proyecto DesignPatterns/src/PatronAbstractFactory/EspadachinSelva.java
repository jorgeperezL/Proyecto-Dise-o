package PatronAbstractFactory;

import PatronStrategy.*;

public class EspadachinSelva extends Enemigo {

	public EspadachinSelva(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia, algoritmo);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Espadachin lanza su ataque de espada Selvico!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Espadachin usa su defensa Selvica!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Espadachin utiliza su espada de la Selva como defensa");
	}
}
