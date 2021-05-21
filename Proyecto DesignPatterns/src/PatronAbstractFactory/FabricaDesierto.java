package PatronAbstractFactory;
import PatronDecorator.DecoratorArquero;
import PatronDecorator.DecoratorDesierto;
import PatronDecorator.DecoratorEspadachin;
import PatronDecorator.DecoratorMago;
import PatronDecorator.Enemigo;
import PatronStrategy.*;
public class FabricaDesierto extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo mago = new DecoratorMago(new DecoratorDesierto(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo arquero = new DecoratorArquero(new DecoratorDesierto(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo espadachin = new DecoratorEspadachin(new DecoratorDesierto(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return espadachin;
	}

}