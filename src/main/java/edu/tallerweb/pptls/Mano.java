package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	int valorForma;

	/**
	 * Toda Mano debe crearse con una forma dada, que será la que determine su
	 * condición en el juego.
	 * 
	 * @param forma
	 *            , la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		valorForma = forma.getValor();
	}

	/**
	 * Evaluará el resultado de la partida según las reglas del juego.
	 * 
	 * @param otra
	 *            , la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		if (valorForma == 0 && otra.valorForma == 3 || valorForma == 0
				&& otra.valorForma == 2 || valorForma == 1
				&& otra.valorForma == 0 || valorForma == 1
				&& otra.valorForma == 4 || valorForma == 2
				&& otra.valorForma == 1 || valorForma == 2
				&& otra.valorForma == 3 || valorForma == 3
				&& otra.valorForma == 4 || valorForma == 3
				&& otra.valorForma == 1 || valorForma == 4
				&& otra.valorForma == 2 || valorForma == 4
				&& otra.valorForma == 0) {
			return Resultado.GANA;
		}
		if (valorForma == 0 && otra.valorForma == 4 || valorForma == 0
				&& otra.valorForma == 1 || valorForma == 1
				&& otra.valorForma == 2 || valorForma == 1
				&& otra.valorForma == 3 || valorForma == 2
				&& otra.valorForma == 4 || valorForma == 2
				&& otra.valorForma == 0 || valorForma == 3
				&& otra.valorForma == 0 || valorForma == 3
				&& otra.valorForma == 2 || valorForma == 4
				&& otra.valorForma == 3 || valorForma == 4
				&& otra.valorForma == 1) {
			return Resultado.PIERDE;
		} else {
			return Resultado.EMPATA;
		}

	}
}
