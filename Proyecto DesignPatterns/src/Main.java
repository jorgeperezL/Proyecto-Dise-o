
import Controlador.Controlador;
import Modelo.Modelo;

import Vista.Interfaz;

public class Main {

	public static void main(String[] args) {

		Modelo modelo = new Modelo();
		Interfaz vista = new Interfaz();
		Controlador controlador = new Controlador(vista, modelo);
		controlador.iniciar_vista();
		vista.setVisible(true);
	}
}
