package PatronAbstractFactory;
import PatronDecorator.DecoratorArquero;
import PatronDecorator.DecoratorSelva;
import PatronDecorator.DecoratorEspadachin;
import PatronDecorator.DecoratorMago;
import PatronDecorator.Enemigo;
import PatronStrategy.*;
public class FabricaSelva extends FabricaEnemigos {

	@Override
	public Enemigo crearMago(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo mago = new DecoratorMago(new DecoratorSelva(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return mago;
	}

	@Override
	public Enemigo crearArquero(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo arquero = new DecoratorArquero(new DecoratorSelva(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return arquero;
	}

	@Override
	public Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia,Strategies algoritmo) {
		Enemigo espadachin = new DecoratorEspadachin(new DecoratorSelva(new EnemigoBasiquisimo(fuerza, agilidad, resistencia,algoritmo)));
		return espadachin;
	}

}