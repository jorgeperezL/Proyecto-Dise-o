package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Interfaz;

public class Controlador implements ActionListener {
	private Interfaz vista;
	private Modelo modelo;
	
	public Controlador(Interfaz vista, Modelo modelo) {
		super();
		this.vista = vista;
		this.modelo = modelo;
		this.vista.btnSumar.addActionListener(this);
	}
	
	public void iniciar_vista() {
		vista.textArea.append("COMENZAMOS");
		vista.textArea.append("\n");
		vista.textArea.append("Elige la personaje: ");
		vista.textArea.append("\n");
		vista.textArea.append("Mago");
		vista.textArea.append("\n");
		vista.textArea.append("Arquero");
		vista.textArea.append("\n");
		vista.textArea.append("Espadachin");
		vista.textArea.append("\n");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String respuesta = modelo.juego(vista.textField.getText().toLowerCase().trim());
		vista.textField.setText("");
		vista.textArea.append(respuesta);
		vista.textArea.append("\n");
		vista.textArea.append("");
		if(respuesta.equals("FIN DEL JUEGO") || respuesta.equals("FELICIDADES, HAS COMPLETADO LA AVENTURA")) {
			
			System.exit(0);
		}
	}
	 
}
