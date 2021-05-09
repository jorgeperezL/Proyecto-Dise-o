package FactoryPattern;

public class MagoDesierto extends Enemigo {

	MagoDesierto(int fuerza, int agilidad, int resistencia) {
		super(fuerza, agilidad, resistencia);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Mago lanza su ataque magico Desiertoso!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Mago lanza su defensa Desiertosa!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Mago utiliza el Desierto como defensa");
	}
}
