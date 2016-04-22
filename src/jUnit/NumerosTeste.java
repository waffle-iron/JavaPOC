package jUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumerosTeste {
	
	private Numeros n;
	
	@Before
	public void setUp(){
		n = new Numeros();
	}
	@Test
	public void testNumeroPar() {
		assertEquals(true, n.numeroPar(8));
	}

	@Test
	public void testAreaQuadrado() {
		assertEquals(100, n.areaQuadrado(10));
	}

	@Test
	public void testNumeroDivisivel() {
		assertTrue(n.numeroDivisivel(4, 2));
	}

}
