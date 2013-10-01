package edu.tallerweb.pptls;

/**
 * Las diferentes Formas que existen en el juego
 */
public enum Forma {

	PIEDRA(0), PAPEL(1), TIJERA(2), LAGARTO(3), SPOCK(4);

	private final Integer valor;

	private Forma(final Integer valor) {
		this.valor = valor;
	}

	public Integer getValor() {
		return this.valor;
	}

}
