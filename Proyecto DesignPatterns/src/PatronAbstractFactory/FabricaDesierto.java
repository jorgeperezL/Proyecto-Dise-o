package PatronAbstractFactory;
import PatronStrategy.*;
public class FabricaDesierto extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo mago = new MagoDesierto(fuerza, agilidad, resistencia,algoritmo);
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo arquero = new ArqueroDesierto(fuerza, agilidad, resistencia,algoritmo);
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo espadachin = new EspadachinDesierto(fuerza, agilidad, resistencia,algoritmo);
		return espadachin;
	}

}