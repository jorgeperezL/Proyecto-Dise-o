package PatronAbstractFactory;
import PatronStrategy.*;
public class MagoDesierto extends Enemigo {

	MagoDesierto(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia,algoritmo);
	}


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