package ana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	final void testSuma() {
		int resultado=Calculadora.suma(10, 4);
		int esperado=14;
		assertEquals(resultado, esperado);
	}

	@Test
	final void testResta() {
		int resultado=Calculadora.resta(10, 4);
		int esperado=6;
		assertEquals(resultado, esperado);
	}
	@Test
	final void testProducto() {
		int resultado=Calculadora.producto(10, 4);
		int esperado=40;
		assertEquals(resultado, esperado);
	}
	@Test
	final void testDivision() {
		float resultado=Calculadora.division(10, 4);
		float esperado=2.5f;
		assertEquals(resultado, esperado);
	}
}
