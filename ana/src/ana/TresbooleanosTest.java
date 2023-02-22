package ana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TresbooleanosTest {

	@Test
	void testMetodo() {
		int salida=Tresbooleanos.metodo(true, false, true);
		int esperado=2;
		assertEquals(salida,esperado);
	}

	@Test
	void testMetodo2() {
		int salida=Tresbooleanos.metodo(true, false, false);
		int esperado=0;
		assertEquals(salida,esperado);
	}
	
	@Test
	void testMetodo3() {
		int salida=Tresbooleanos.metodo(true, true, true);
		int esperado=1;
		assertEquals(salida,esperado);
	}
	@Test
	void testMetodo4() {
		int salida=Tresbooleanos.metodo(false, false, false);
		int esperado=0;
		assertEquals(salida,esperado);
	}
}