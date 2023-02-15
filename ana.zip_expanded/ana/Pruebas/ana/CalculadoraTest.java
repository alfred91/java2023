package ana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	final void testSuma() {
		int resultado=Calculadora.suma(3, 4);
		int esperado=7;
		assertEquals(resultado, esperado);
	}

	@Test
	final void testResta() {
		int resultado=Calculadora.resta(10, 4);
		int esperado=6;
		assertEquals(resultado, esperado);
	}

}
