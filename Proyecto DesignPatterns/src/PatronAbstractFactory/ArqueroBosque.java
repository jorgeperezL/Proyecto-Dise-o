package PatronAbstractFactory;

import PatronStrategy.*;

public class ArqueroBosque extends Enemigo {

	public ArqueroBosque(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia, algoritmo);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Arquero lanza su flecha Boscosa!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Arquero se esconde detra de un arbol!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Tu ataque falla y golpea a un arbol");
	}

}
