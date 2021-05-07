import java.util.Random;
import java.util.Scanner;

import PatronAbstractFactory.*;
import PatronAbstractFactory.Enemigo;
import PatronDecorator.*;
import PatronStrategy.*;

public class Main {

	 static Scanner sc = new Scanner(System.in);

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

    public static void main(String[] args) {
        Enemigo mago;
        Enemigo arquero;
        Enemigo espadachin;

        FabricaEnemigos fabricaBosque = new FabricaBosque();
        FabricaEnemigos fabricaDesierto = new FabricaDesierto();
        FabricaEnemigos fabricaSelva = new FabricaSelva();
        
        
        // Bosque
        mago = fabricaBosque.crearMago(10,10,10,new Aggressive()); 
        espadachin = fabricaBosque.crearEspadachin(10, 10, 10, new Defensive());
        arquero = fabricaBosque.crearArquero(10, 10, 10, new Aggressive());

        
        testEnemigo(mago);
        testEnemigo(espadachin);
        testEnemigo(arquero);
       
        
        //Decorator prueba
        
        
        Vista vista = new Vista();
        
        DecoratorBosque db = new DecoratorBosque(vista);
        DecoratorDesierto dd = new DecoratorDesierto(vista);
        DecoratorSelva ds = new DecoratorSelva(vista);
        
        System.out.println("desierto, bosque o selva: ");
        String s1 = sc.nextLine();
        
        switch(s1) {
        
        case "desierto":
        	
        	dd.sonidoDeAtaque();
        	dd.sonidoDeDefensa();
        	dd.sonidoDeDefendiendo();
        	break;
        	
        case "bosque":

        	db.sonidoDeAtaque();
        	db.sonidoDeDefensa();
        	db.sonidoDeDefendiendo();
        	break;
        	
        case "selva":
        	
        	ds.sonidoDeAtaque();
        	ds.sonidoDeDefensa();
        	ds.sonidoDeDefendiendo();
        	break;
        	
        default:
        	System.out.println("pon algo con sentido");
        }
        
        
        //Strategy prueba
        Contexto c = new Contexto();
        
        Random aleatorio = new Random();
    	int n1 = aleatorio.nextInt(3);
    	
    	System.out.println(n1);
    	switch(n1) {
    	case 0:
    		c.setType(new Aggressive());
    		c.execute();
    	case 1: 
    		c.setType(new Defensive());
    		c.execute();
    	case 2:
    		c.setType(new Passive());
    		c.execute();
    	default:
    		System.out.println("ERROR!!!");
    		
    	}
      
    }

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

 