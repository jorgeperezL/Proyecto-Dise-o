package PatronAbstractFactory;
import PatronStrategy.*;
public abstract class FabricaEnemigos {
	public abstract Enemigo crearMago(int fuerza, int agilidad, int resistencia, Strategies algoritmo);
	public abstract Enemigo crearArquero(int fuerza, int agilidad, int resistencia,Strategies algoritmo);
	public abstract Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia,Strategies algoritmo);
}