package FactoryPattern;

public class FabricaDesierto extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia) {
		Enemigo mago = new MagoDesierto(fuerza, agilidad, resistencia);
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia) {
		Enemigo arquero = new ArqueroDesierto(fuerza, agilidad, resistencia);
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia) {
		Enemigo espadachin = new EspadachinDesierto(fuerza, agilidad, resistencia);
		return espadachin;
	}

}
