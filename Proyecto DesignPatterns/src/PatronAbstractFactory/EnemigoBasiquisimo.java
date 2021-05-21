package PatronAbstractFactory;
import PatronDecorator.Enemigo;
import PatronStrategy.*;


public class EnemigoBasiquisimo implements Enemigo{
		
		public final int ATACAR = 0;
		public final int DEFENDER = 1;
		public final int PASAR = 2;
	
		private Strategies algoritmo;
		
		private int fuerza;
		private int agilidad;
		private int resistencia;
		
		private boolean defender;
		
		private int vida;
		private int ataque;
		
		public EnemigoBasiquisimo(int fuerza, int agilidad, int resistencia, Strategies algoritmo){
			this.fuerza = fuerza;
			this.agilidad = agilidad;
			this.resistencia = resistencia;
			this.algoritmo=algoritmo;
			this.defender = false;
			
			generarVida();
			generarAtaque();
		}
		
		public void sonidoDeAtaque() {
			System.out.println("para atacar.");
		}
		public void sonidoDeDefensa() {
			System.out.println("para defender.");
		}
		public void sonidoDeDefendiendo() {
			System.out.println("Esta defendiendo...");
		}
		
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
		
		public int queHacer() {
			return algoritmo.siguientAccion(); 
		}
		
		public int siguienteAccion() {
			if(algoritmo.siguientAccion()==0) {
				 return this.atacar();
			}else if(algoritmo.siguientAccion()==1) {
				 this.defender();
			}else if(algoritmo.siguientAccion()==2) {
				//pasivo
			}
			return 0;
		}
}
