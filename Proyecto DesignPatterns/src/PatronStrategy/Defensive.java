package PatronStrategy;

import TemplatePattern.*;

public class Defensive implements Strategies{

	private AccionadorDeEnemigos accionador = new Defensividad();
	
	public void executeType() {
		
		System.out.println("modo defensivo activado");
	}

	
	public int siguientAccion() {
		
		return accionador.siguienteAccion();
		
	}
	
}
