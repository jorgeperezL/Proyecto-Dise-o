package PatronAbstractFactory;

import PatronDecorator.Enemigo;
import PatronState.Enfadado;
import PatronState.EstadoJugador;
import PatronState.Herido;
import PatronState.Normal;
import PatronStrategy.*;

public class EnemigoBasiquisimo implements Enemigo {

	public final int ATACAR = 0;
	public final int DEFENDER = 1;
	public final int PASAR = 2;

	private Strategies algoritmo;

	private int fuerza;
	private int agilidad;
	private int resistencia;
	private EstadoJugador estado;
	
	private static final int VIDA=100;

	private boolean defender;

	private int vida;
	private int ataque;

	public EnemigoBasiquisimo(int fuerza, int agilidad, int resistencia, Strategies algoritmo) {
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.resistencia = resistencia;
		this.algoritmo = algoritmo;
		this.defender = false;
		this.estado=new Normal();

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

			if (this.vida < 80) {
				this.estado = new Enfadado();
			} else if (this.vida < 50) {
				this.estado = new Herido();

			}
		} else {
			sonidoDeDefendiendo();
			this.defender = false;
		}

	}
	

	public int atacar() {
		sonidoDeAtaque();
		int ataque_2 = ataque;
		return ataque_2;
	}

	public void defender() {
		sonidoDeDefensa();
		this.defender = true;
	}

	private void generarVida() {

		this.vida = VIDA;
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

		this.estado.mostrarEstado();

		if (algoritmo.siguientAccion() == 0) {
			this.atacar();
		} else if (algoritmo.siguientAccion() == 1) {
			this.defender();
		} else if (algoritmo.siguientAccion() == 2) {
			// pasivo
		}
		return 0;
	}

}
