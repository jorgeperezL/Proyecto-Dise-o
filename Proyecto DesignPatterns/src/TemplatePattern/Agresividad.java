package TemplatePattern;

public class Agresividad extends AccionadorDeEnemigos {

	@Override
	void cambiar_probabilidadAtaque() {
		// TODO Auto-generated method stub
		this.set_probabilidadAtaque(60);
	}

	@Override
	void cambiar_probabilidadDefensa() {
		// No va a defender

	}

	@Override
	void cambiar_probabilidadPasar() {
		this.set_probabilidadPasar(30);

	}

}
