package PatronAbstractFactory;

import PatronStrategy.*;
import PatronDecorator.*;

public class FabricaBosque extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		Enemigo mago = new DecoratorMago(new DecoratorBosque(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		Enemigo arquero = new DecoratorArquero(new DecoratorBosque(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo espadachin = new DecoratorEspadachin(new DecoratorBosque(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return espadachin;
	}

}