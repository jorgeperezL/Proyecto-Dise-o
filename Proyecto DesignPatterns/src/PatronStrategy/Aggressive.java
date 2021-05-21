package PatronStrategy;

import TemplatePattern.AccionadorDeEnemigos;
import TemplatePattern.Agresividad;

public class Aggressive implements Strategies{
	
	private AccionadorDeEnemigos accionador = new Agresividad();
	
	public void executeType() {
		
		System.out.println("modo agresivo activado");
	}
	
	public int siguientAccion() {
		
		return accionador.siguienteAccion();
		
	}

}
