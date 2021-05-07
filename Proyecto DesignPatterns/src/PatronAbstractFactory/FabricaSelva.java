package PatronAbstractFactory;
import PatronStrategy.*;
public class FabricaSelva extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo mago = new MagoSelva(fuerza, agilidad, resistencia,algoritmo);
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		Enemigo arquero = new ArqueroSelva(fuerza, agilidad, resistencia, algoritmo);
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		Enemigo espadachin = new EspadachinSelva(fuerza, agilidad, resistencia, algoritmo);
		return espadachin;
	}

}