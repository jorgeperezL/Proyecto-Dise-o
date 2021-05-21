package FactoryPattern;

public class ArqueroBosque extends Enemigo {

	public ArqueroBosque(int fuerza, int agilidad, int resistencia) {
		super(fuerza, agilidad, resistencia);
	}

	@Override
	public void sonidoDeAtaque() {
		System.out.println("Arquero lanza su flecha Boscosa!");
	}
	
	public void sonidoDeDefensa() {
		System.out.println("Arquero se esconde detra de un arbol!");
	}
	public void sonidoDeDefendiendo() {
		System.out.println("Tu ataque falla y golpea a un arbol");
	}

}
