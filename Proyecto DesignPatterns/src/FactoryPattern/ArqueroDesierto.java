package FactoryPattern;

public class ArqueroDesierto extends Enemigo {

	ArqueroDesierto(int fuerza, int agilidad, int resistencia) {
		super(fuerza, agilidad, resistencia);
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
