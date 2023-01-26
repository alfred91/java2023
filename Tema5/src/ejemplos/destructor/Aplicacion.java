package ejemplos.destructor;

public class Aplicacion {

	public static void main(String[] args) throws InterruptedException {
		
		Coche c1 = new Coche("4566LN3", "Cupra", "León 1.5 eTsi", "Gris");
		System.out.println(c1);
		c1 = null;
		
		while(true) {
			Coche c2 = new Coche("111111", "Cupra", "León 1.5 eTsi", "Gris");
		}
		
		
		
		
	}
}
