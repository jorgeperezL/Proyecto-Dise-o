package TemplatePattern;

public abstract class AccionadorDeEnemigos {
	public final int ATACAR = 0;
	public final int DEFENDER = 1;
	public final int PASAR = 2;

	private int probabilidadAtaque;
	private int probabilidadDefensa;
	private int probabilidadPasar;
	
	private int probabilidadGenerada;
	
	public void set_probabilidadAtaque(int prob) {
		this.probabilidadAtaque = prob;
	}
	public void set_probabilidadDefensa(int prob) {
		this.probabilidadDefensa = prob;
	}
	public void set_probabilidadPasar(int prob) {
		this.probabilidadPasar = prob;
	}
	
	public AccionadorDeEnemigos(){
		probabilidadAtaque = 0;
		probabilidadDefensa = 0;
		probabilidadPasar = 0;
	}
	
	int generateRandomNumber(int max, int min) {
	    return (int) (Math.random() * (max - min + 1) + min);
	}
	void generarProbabilidad() {
		this.probabilidadGenerada = generateRandomNumber(probabilidadAtaque + probabilidadDefensa + probabilidadPasar, 0);
	}
	
	int accion() {
		System.out.println("Prob: " + probabilidadGenerada + " Numeros: " + probabilidadAtaque +" "+  probabilidadDefensa + " " + probabilidadPasar);
		if (probabilidadGenerada <= probabilidadAtaque) {
			return ATACAR;
		}else if (probabilidadGenerada <= probabilidadDefensa + probabilidadAtaque) {
			return DEFENDER;
		}else {
			return PASAR;
		}
	}
	
	abstract void cambiar_probabilidadAtaque();
	abstract void cambiar_probabilidadDefensa();
	abstract void cambiar_probabilidadPasar();
	
	public int siguienteAccion() {
		cambiar_probabilidadAtaque();
		cambiar_probabilidadDefensa();
		cambiar_probabilidadPasar();
		
		generarProbabilidad();
		
		return accion();
		
	}
	
}
