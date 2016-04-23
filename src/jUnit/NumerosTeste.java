package jUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumerosTeste {
	
	private Numeros numero;
	
	@Before
	public void setUp(){
		numero = new Numeros();
	}
	@Test
	public void testNumeroPar() {
		assertTrue(numero.numeroPar(8));
	}

	@Test
	public void testAreaQuadrado() {
		int area = 100;
		assertEquals(area, numero.areaQuadrado(10));
	}

	@Test
	public void shouldBeAbleToDivedeGiven4And2() {
		assertTrue(numero.numeroDivisivel(4, 2));
	}

}
