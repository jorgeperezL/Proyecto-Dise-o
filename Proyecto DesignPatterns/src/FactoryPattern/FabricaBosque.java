package FactoryPattern;

public class FabricaBosque extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia) {
		Enemigo mago = new MagoBosque(fuerza, agilidad, resistencia);
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia) {
		Enemigo arquero = new ArqueroBosque(fuerza, agilidad, resistencia);
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia) {
		Enemigo espadachin = new EspadachinBosque(fuerza, agilidad, resistencia);
		return espadachin;
	}

}
