package ana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Persona1Test {

	@Test
	final void test1() {
		Persona1 p=new Persona1(0,false);
		assertFalse(p.Me());
	}
	@Test
	final void test2() {
		Persona1 m=new Persona1(17,false);
		assertFalse(m.Me());
	}
	@Test
	final void test3() {
		Persona1 l=new Persona1(18,false);
		assertTrue(l.Me());
	}
	@Test
	final void test4() {
		Persona1 o=new Persona1(100,false);
		assertTrue(o.Me());
	}
	final void test5() {
		Persona1 i= new Persona1(-1,true);
		assertTrue(i.Me());
	}
}