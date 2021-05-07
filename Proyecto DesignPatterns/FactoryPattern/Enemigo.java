package FactoryPattern;

public abstract class Enemigo {
	private int fuerza;
	private int agilidad;
	private int resistencia;
	
	private boolean defender;
	
	private int vida;
	private int ataque;
	
	Enemigo(int fuerza, int agilidad, int resistencia){
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.resistencia = resistencia;
		
		this.defender = false;
		
		generarVida();
		generarAtaque();
	}
	
	abstract void sonidoDeAtaque();
	abstract void sonidoDeDefensa();
	abstract void sonidoDeDefendiendo();
	
	public void recivirAtaque(int danio) {
		if (!this.defender) {
			this.vida -= danio;
		}else {
			sonidoDeDefendiendo();
			this.defender = false;
		}
	}
	
	public int atacar() {
		sonidoDeAtaque();
		return ataque;
	}
	
	public void defender() {
		sonidoDeDefensa();
		this.defender = true;
	}
	
	private void generarVida() {
		this.vida = agilidad + resistencia;
	}
	
	private void generarAtaque() {
		this.ataque = agilidad + fuerza;
	}
	
	public int getVida() {
		return vida;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
}
