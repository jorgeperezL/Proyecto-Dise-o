import FactoryPattern.*;


public class Main {
	
	public static void testEnemigo(Enemigo enemigo) {
		// test de ataques
		int fuerzaDelGolpe = enemigo.atacar();
		System.out.println("fuerza del golpe: " + fuerzaDelGolpe);
		enemigo.defender();
		
		// test de ser golpeado
		System.out.println("Vida: " + enemigo.getVida());
		enemigo.recivirAtaque(13);
		System.out.println("Vida: " + enemigo.getVida());
		enemigo.recivirAtaque(6);
		System.out.println("Vida: " + enemigo.getVida());
	}
	
	public static void main(String[] args) {
		Enemigo mago;
		Enemigo arquero;
		Enemigo espadachin;
		
		FabricaEnemigos fabricaBosque = new FabricaBosque();
		FabricaEnemigos fabricaDesierto = new FabricaDesierto();
		FabricaEnemigos fabricaSelva = new FabricaSelva();
		
		// Bosque
		mago = fabricaBosque.crearMago(10,10,10); 
		espadachin = fabricaBosque.crearEspadachin(10, 10, 10);
		arquero = fabricaBosque.crearArquero(10, 10, 10);
		
		testEnemigo(mago);
		testEnemigo(espadachin);
		testEnemigo(arquero);
		
		// Desiertoesierto
		mago = fabricaDesierto.crearMago(10,10,10); 
		espadachin = fabricaDesierto.crearEspadachin(10, 10, 10);
		arquero = fabricaDesierto.crearArquero(10, 10, 10);
		
		testEnemigo(mago);
		testEnemigo(espadachin);
		testEnemigo(arquero);
		
		// Selva
		mago = fabricaSelva.crearMago(10,10,10); 
		espadachin = fabricaSelva.crearEspadachin(10, 10, 10);
		arquero = fabricaSelva.crearArquero(10, 10, 10);
		
		testEnemigo(mago);
		testEnemigo(espadachin);
		testEnemigo(arquero);
	}

}
