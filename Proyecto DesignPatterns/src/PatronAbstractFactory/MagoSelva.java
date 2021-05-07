package PatronAbstractFactory;
import PatronStrategy.*;
public class MagoSelva extends Enemigo {

	public MagoSelva(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		super(fuerza, agilidad, resistencia,algoritmo);
	}

	
	public void sonidoDeAtaque() {
		System.out.println("Mago lanza su ataque magico Selvico!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Mago lanza su defensa Selvica!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Mago utiliza el Selva como defensa");
	}
}