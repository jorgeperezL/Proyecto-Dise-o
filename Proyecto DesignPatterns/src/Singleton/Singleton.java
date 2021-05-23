package Singleton;

public class Singleton {
	private static  Singleton instancia = null;
	
	private Singleton() {
		
	}
	
	public static Singleton instance() {
		if(instancia == null) {
			instancia  = new Singleton();
		}
		return instancia;
	}
	
	public int ataque(int num_1 , int num_2) {
		int num = num_1 - num_2;	
		return num;
	}
	public int recuperar(int num_1 , int num_2) {
		int num = num_1 + num_2;	
		return num;
	}
}
