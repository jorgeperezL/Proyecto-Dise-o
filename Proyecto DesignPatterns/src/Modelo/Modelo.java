package Modelo;

import java.util.Scanner;

import PatronAbstractFactory.FabricaBosque;
import PatronAbstractFactory.FabricaDesierto;
import PatronAbstractFactory.FabricaEnemigos;
import PatronAbstractFactory.FabricaSelva;
import PatronDecorator.Enemigo;
import PatronStrategy.Aggressive;
import PatronStrategy.Contexto;
import PatronStrategy.Defensive;
import PatronStrategy.Passive;
import Singleton.Singleton;

public class Modelo {
	String elegirPrincipal;
	FabricaEnemigos fabricaPersonajePrincipal = new FabricaBosque();
	Enemigo PersonajePrincipal;
	FabricaEnemigos fabricaEnemigo;
	Enemigo enemigo;
	int cont_enemigo = 0;
	Singleton calculadora = Singleton.instance();

	public String juego(String comando) {
		String respuesta = "";
		if (comando.equals("mago") || comando.equals("arquero") || comando.equals("espadachin")) {
			if (comando.equals("mago")) {
				elegirPrincipal = "mago";
				respuesta = "Elige estrategia:" + "\n" + "Agressive" + "\n" + "Defensive" + "\n" + "Passive" + "\n";
			} else if (comando.equals("arquero")) {
				elegirPrincipal = "arquero";
				respuesta = "Elige estrategia:" + "\n" + "Agressive" + "\n" + "Defensive" + "\n" + "Passive" + "\n";
			} else if (comando.equals("espadachin")) {
				elegirPrincipal = "espadachin";
				respuesta = "Elige estrategia:" + "\n" + "Agressive" + "\n" + "Defensive" + "\n" + "Passive" + "\n";
			}
		} else if (comando.equals("agressive") || comando.equals("defensive") || comando.equals("passive")) {
			if (elegirPrincipal.equals("mago")) {
				if (comando.equals("agressive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearMago(30, 12, 10, new Aggressive());
					System.out.println("INFO "+PersonajePrincipal.getVida());
					System.out.println("INFO "+PersonajePrincipal.atacar());
					respuesta = primerEnemigo();		
				} else if (comando.equals("defensive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearMago(10, 12, 40, new Defensive());
					respuesta = primerEnemigo();
				} else if (comando.equals("passive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearMago(15, 15, 20, new Passive());
					respuesta = primerEnemigo();
				}
			} else if (elegirPrincipal.equals("arquero") && PersonajePrincipal == null) {
				if (comando.equals("agressive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearArquero(30, 12, 10, new Aggressive());
					respuesta = primerEnemigo();
				} else if (comando.equals("defensive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearArquero(10, 12, 40, new Defensive());
					respuesta = primerEnemigo();
				} else if (comando.equals("passive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearArquero(15, 15, 20, new Passive());
					fabricaEnemigo = new FabricaBosque();
					respuesta = primerEnemigo();
				}
			} else if (elegirPrincipal.equals("espadachin") && PersonajePrincipal == null) {
				if (comando.equals("agressive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearEspadachin(30, 12, 10, new Aggressive());
					respuesta = primerEnemigo();
				} else if (comando.equals("defensive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearEspadachin(10, 12, 40, new Defensive());
					respuesta = primerEnemigo();
				} else if (comando.equals("passive")) {
					PersonajePrincipal = fabricaPersonajePrincipal.crearEspadachin(15, 15, 20, new Passive());
					respuesta = primerEnemigo();
				}
			}
		} else if (comando.equals("atacar") || comando.equals("defender") || comando.equals("pasar")) {
			int min = 1;
			int max = 3;
			int ronda = (int) (Math.random() * (max - min)) + min;
			if (comando.equals("atacar")) {
				respuesta = turnos(ronda, PersonajePrincipal.atacar());
			} else if (comando.equals("defender")) {
				respuesta = "Te has defendido, no recibes danio" + "\n"+ "¿Qué haces?" + "\n" + "Atacar"
						+ "\n" + "Defender" + "\n" + "Pasar" + "\n";
			} else if (comando.equals("pasar")) {
				int ataque = enemigo.siguienteAccion();
				PersonajePrincipal.recivirAtaque(ataque);
				respuesta = "Has recibido: " + String.valueOf(ataque) + "\n"+ "¿Qué haces?" + "\n" + "Atacar"
						+ "\n" + "Defender" + "\n" + "Pasar" + "\n";
			}
		}else if(comando.equals("no")) {
			System.exit(0);
		}else if(comando.equals("si")){
			respuesta = "Elige la personaje: " + "\n" +"Mago" + "\n" +"Arquero" +"\n" + "Espadachin" +"\n";
			cont_enemigo = 0;
		}else {
			respuesta = "comando incorrecto" + "\n";
		}
		return respuesta;
	}
	
	public String primerEnemigo() {
		fabricaEnemigo = new FabricaBosque();
		enemigo = fabricaEnemigo.crearMago(10, 10, 10, new Aggressive());
		return "Estas en un bosque y te aparece un Mago." + "\n" + "¿Qué haces?" + "\n" + "Atacar"
				+ "\n" + "Defender" + "\n" + "Pasar" + "\n";
	}
	
	public String turnos(int ronda , int opcion) {
		if (ronda == 1) {
			System.out.println("INFO "+PersonajePrincipal.getVida());
			int danio = calculadora.ataque(PersonajePrincipal.atacar(), enemigo.getVida());
			enemigo.recivirAtaque(PersonajePrincipal.atacar());
			if (enemigo.getVida() <= 0) {
				return niveles();
			} else {
				int ataque = enemigo.siguienteAccion();
				PersonajePrincipal.recivirAtaque(ataque);
				if (PersonajePrincipal.getVida() <= 0) {
					return "FIN DEL JUEGO" + "\n" + "¿Desea continuar?(SI/NO)";
				} else {
					return "El enemigo ha recibido " + String.valueOf(PersonajePrincipal.atacar()) + "\n"
							+ "has recibido: " + String.valueOf(ataque) + "\n"+ "¿Qué haces?" + "\n" + "Atacar"
									+ "\n" + "Defender" + "\n" + "Pasar" + "\n";
				}
			}
		} else {
			int danio = calculadora.ataque(PersonajePrincipal.atacar(), enemigo.getVida());
			int ataque = enemigo.siguienteAccion();
			PersonajePrincipal.recivirAtaque(ataque);
			if ( PersonajePrincipal.getVida() <= 0) {
				return "FIN DEL JUEGO" + "\n" + "¿Desea continuar?(SI/NO)"; 
			} else {
				enemigo.recivirAtaque(PersonajePrincipal.atacar());
				if (enemigo.getVida() <= 0) {
					return niveles();
				} else {
					return "El enemigo ha recibido " + String.valueOf(PersonajePrincipal.atacar()) + "\n"
							+ "has recibido: " + String.valueOf(ataque) + "\n"+ "¿Qué haces?" + "\n" + "Atacar"
									+ "\n" + "Defender" + "\n" + "Pasar" + "\n";
				}
			}
		}
	}

	public String niveles() {
		cont_enemigo++;
		if (cont_enemigo == 1) {
			enemigo = fabricaEnemigo.crearArquero(12, 10, 10, new Aggressive());
			return "Has vencido a Mago de Bosque, aparece Arquero" + "\n" + "¿Qué haces?" + "\n" + "Atacar" + "\n"
					+ "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 2) {
			enemigo = fabricaEnemigo.crearEspadachin(13, 10, 10, new Aggressive());
			return "Has vencido a Arquero de Bosque, aparece Espadachin de Bosque" + "\n" + "¿Qué haces?" + "\n"
					+ "Atacar" + "\n" + "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 3) {
			fabricaEnemigo = new FabricaDesierto();
			enemigo = fabricaEnemigo.crearArquero(13, 10, 13, new Aggressive());
			return "Has vencido a Espadachin de Bosque, cambias de area," + "\n" + "aparece Arquero de Desierto" + "\n"
					+ "¿Qué haces?" + "\n" + "Atacar" + "\n" + "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 4) {
			enemigo = fabricaEnemigo.crearMago(13, 10, 14, new Aggressive());
			return "Has vencido a Arquero de Desierto, aparece Mago de Desierto" + "\n" + "¿Qué haces?" + "\n"
					+ "Atacar" + "\n" + "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 5) {
			enemigo = fabricaEnemigo.crearEspadachin(13, 10, 15, new Aggressive());
			return "Has vencido a Mago de Desierto, aparece Espadachin de Desierto" + "\n" + "¿Qué haces?" + "\n"
					+ "Atacar" + "\n" + "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 6) {
			fabricaEnemigo = new FabricaSelva();
			enemigo = fabricaEnemigo.crearEspadachin(13, 12, 15, new Aggressive());
			return "Has vencido a Espadachin de Desierto, cambias de area," + "\n" + "aparece Espadachin de Selva"
					+ "\n" + "¿Qué haces?" + "\n" + "Atacar" + "\n" + "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 7) {
			enemigo = fabricaEnemigo.crearMago(13, 14, 15, new Aggressive());
			return "Has vencido a Espadachin de Selva, aparece Mago de Selva" + "\n" + "¿Qué haces?" + "\n" + "Atacar"
					+ "\n" + "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 8) {
			enemigo = fabricaEnemigo.crearArquero(13, 15, 15, new Aggressive());
			return "Has vencido a Mago de Selva, aparece Arquero de Selva" + "\n" + "¿Qué haces?" + "\n" + "Atacar"
					+ "\n" + "Defender" + "\n" + "Pasar" + "\n";
		} else if (cont_enemigo == 9) {
			cont_enemigo = 0;
			return "FELICIDADES, HAS COMPLETADO LA AVENTURA"  + "\n" + "¿Desea continuar?(SI/NO)";
		}
		return "";
	}

	public void crearPersonaje() {
		Enemigo mago;
		Enemigo arquero;
		Enemigo espadachin;

		FabricaEnemigos fabricaBosque = new FabricaBosque();
		FabricaEnemigos fabricaDesierto = new FabricaDesierto();
		FabricaEnemigos fabricaSelva = new FabricaSelva();

		// Bosque
		mago = fabricaBosque.crearMago(10, 10, 10, new Aggressive());
		espadachin = fabricaBosque.crearEspadachin(10, 10, 10, new Defensive());
		arquero = fabricaBosque.crearArquero(10, 10, 10, new Aggressive());

		testEnemigo(mago);
		testEnemigo(espadachin);
		testEnemigo(arquero);
	}

	public static void testEnemigo(Enemigo enemigo) {

		// test de ataques
		int fuerzaDelGolpe = enemigo.siguienteAccion();
		System.out.println("fuerza del golpe: " + fuerzaDelGolpe);

		// test de ser golpeado
		System.out.println("Vida: " + enemigo.getVida());
		enemigo.recivirAtaque(13);
		System.out.println("Vida: " + enemigo.getVida());
		enemigo.recivirAtaque(6);
		System.out.println("Vida: " + enemigo.getVida());
	}
}
