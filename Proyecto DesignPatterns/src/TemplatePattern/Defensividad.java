package TemplatePattern;

public class Defensividad extends AccionadorDeEnemigos {

	@Override
	void cambiar_probabilidadAtaque() {
		// El defensio ataca muy poco
		this.set_probabilidadAtaque(10);
	}

	@Override
	void cambiar_probabilidadDefensa() {
		this.set_probabilidadDefensa(60);
	}

	@Override
	void cambiar_probabilidadPasar() {
		this.set_probabilidadAtaque(20);

	}

}
