package PatronAbstractFactory;

import PatronStrategy.*;

public class FabricaBosque extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		Enemigo mago = new MagoBosque(fuerza, agilidad, resistencia, algoritmo);
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		Enemigo arquero = new ArqueroBosque(fuerza, agilidad, resistencia,algoritmo);
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo espadachin = new EspadachinBosque(fuerza, agilidad, resistencia,algoritmo);
		return espadachin;
	}

}