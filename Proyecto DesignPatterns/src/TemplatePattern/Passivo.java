package TemplatePattern;

public class Passivo extends AccionadorDeEnemigos {

	@Override
	void cambiar_probabilidadAtaque() {

	}

	@Override
	void cambiar_probabilidadDefensa() {

	}

	@Override
	void cambiar_probabilidadPasar() {
		this.set_probabilidadAtaque(1);

	}

}
