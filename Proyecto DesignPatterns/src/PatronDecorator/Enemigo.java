package PatronDecorator;

public interface Enemigo {
	int atacar();
	void defender();
	
	void recivirAtaque(int danio) ;
	
	int queHacer();
	int siguienteAccion();
	int getVida();
}
