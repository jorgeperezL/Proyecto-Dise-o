package FactoryPattern;

public abstract class FabricaEnemigos {
	public abstract Enemigo crearMago(int fuerza, int agilidad, int resistencia);
	public abstract Enemigo crearArquero(int fuerza, int agilidad, int resistencia);
	public abstract Enemigo crearEspadachin(int fuerza, int agilidad, int resistencia);
}
