package PatronAbstractFactory;
import PatronStrategy.*;
public class MagoBosque extends Enemigo {

	public MagoBosque(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia,algoritmo);
	}


	public void sonidoDeAtaque() {
		System.out.println("Mago lanza su ataque magico Boscoso!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Mago lanza su defensa Boscosa!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Mago utiliza el Bosque como defensa");
	}
}