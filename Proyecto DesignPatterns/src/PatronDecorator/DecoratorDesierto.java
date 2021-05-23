package PatronDecorator;

public class DecoratorDesierto extends Decorator{

	public DecoratorDesierto(Enemigo componente) {
		super(componente);
		
	}

	private void sonido() {
		System.out.print("Estamos en el Desierto. ");
	}

	@Override
	public int atacar() {
		sonido();
		return super.enemigo.atacar();
	}

	@Override
	public void defender() {
		sonido();
		super.enemigo.defender();
	}

	@Override
	public void recivirAtaque(int danio) {
		sonido();
		super.enemigo.recivirAtaque(danio);
	}

	public int siguienteAccion() {
		if(super.enemigo.queHacer()==0) {
			 return this.atacar();
		}else if(super.enemigo.queHacer()==1) {
			 this.defender();
		}else if(super.enemigo.queHacer()==2) {
			//pasivo
		}
		return 0;
	}

	@Override
	public int queHacer() {
		return super.enemigo.queHacer();
	}

	@Override
	public int getVida() {
		return super.enemigo.getVida();
	}

	

}