package PatronAbstractFactory;

import PatronStrategy.*;

public class EspadachinBosque extends Enemigo {

	public EspadachinBosque(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia,algoritmo);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Espadachin lanza su ataque de espada Boscoso!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Espadachin lanza su defensa de espada Boscosa!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Espadachin utiliza su espada del Bosque como defensa");
	}

}