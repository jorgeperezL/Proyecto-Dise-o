package PatronAbstractFactory;
import PatronState.*;
import PatronStrategy.*;


public abstract class Enemigo {
		
		private Strategies algoritmo;
		private EstadoJugador estado;
		
		private static final int VIDA=100;
		private int fuerza;
		private int agilidad;
		private int resistencia;
		
		private boolean defender;
		
		private int vida;
		private int ataque;
		
		Enemigo(int fuerza, int agilidad, int resistencia, Strategies algoritmo){
			this.fuerza = fuerza;
			this.agilidad = agilidad;
			this.resistencia = resistencia;
			this.algoritmo=algoritmo;
			this.defender = false;
			this.estado=new Normal();
			
			generarVida();
			generarAtaque();
		}
		
		abstract void sonidoDeAtaque();
		abstract void sonidoDeDefensa();
		abstract void sonidoDeDefendiendo();
		
		public void recivirAtaque(int danio) {
			
			if (!this.defender) {
				this.vida -= danio;
				
				if(this.vida<80) {
					this.estado=new Enfadado();
				}
				else if(this.vida<50) {
					this.estado=new Herido();
				
				}
			}
			else {
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
			
			this.vida=VIDA;
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
		
		public int siguienteAccion() {
			
			this.estado.mostrarEstado();
			
			if(algoritmo.siguientAccion()==0) {
				 this.atacar();
			}else if(algoritmo.siguientAccion()==1) {
				 this.defender();
			}else if(algoritmo.siguientAccion()==2) {
				//pasivo
			}
			return 0;
		}
		
		
}

