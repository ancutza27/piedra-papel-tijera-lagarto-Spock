package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queTijeraPierdeConPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Tijera pierde contra piedra", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queLagartoPierdeConTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto Pierde Contra Tijera", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel Cubre Piedra", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePapelPierdeConLagarto() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel Pierde Contra Lagarto", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePiedraPierdeConPapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Piedra Pierde Con Papel", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Tijera Decapita Lagarto", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto Come Papel", Resultado.GANA,
				jugadorUno.jugarCon(jugadorDos));
	}

	@Test
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Piedra Aplasta Tijera", Resultado.PIERDE,
				jugadorUno.jugarCon(jugadorDos));
	}

}
