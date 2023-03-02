package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsMayorTest {

	@Test
	final void testMayor() {
		int resultado=EsMayor.mayor(1, 2, 3);
		int esperado=3;
		assertEquals(resultado,esperado);}
	
	@Test
		final void testMayor1() {
			int resultado=EsMayor.mayor(3, 2 ,10 );
			int esperado=10;
			assertEquals(resultado,esperado);
		
	}
		@Test
		final void testMayor2() {
			int resultado=EsMayor.mayor(-1, 2, 3);
			int esperado=3;
			assertEquals(resultado,esperado);
			}

		@Test
		final void testMayor3() {
			int resultado=EsMayor.mayor(0, -10, 1);
			int esperado=1;
			assertEquals(resultado,esperado);}
}