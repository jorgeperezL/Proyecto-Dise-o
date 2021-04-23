package FactoryPattern;

public class FabricaSelva extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia) {
		Enemigo mago = new MagoSelva(fuerza, agilidad, resistencia);
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia) {
		Enemigo arquero = new ArqueroSelva(fuerza, agilidad, resistencia);
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia) {
		Enemigo espadachin = new EspadachinSelva(fuerza, agilidad, resistencia);
		return espadachin;
	}

}
