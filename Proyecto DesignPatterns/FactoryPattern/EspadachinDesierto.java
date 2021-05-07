package FactoryPattern;

public class EspadachinDesierto extends Enemigo {

	EspadachinDesierto(int fuerza, int agilidad, int resistencia) {
		super(fuerza, agilidad, resistencia);
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
