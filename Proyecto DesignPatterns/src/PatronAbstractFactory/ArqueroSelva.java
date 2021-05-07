package PatronAbstractFactory;
import PatronStrategy.*;
public class ArqueroSelva extends Enemigo {

	public ArqueroSelva(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		super(fuerza, agilidad, resistencia,algoritmo);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Arquero lanza su flecha Selvica!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Arquero usa su defensa Selvica!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Arquero coloca un tigre entre tu ataque y el.");
		System.out.println("Golpeas de lleno al tigre.");
		System.out.println("Eres un puto pringao!");
	}
}