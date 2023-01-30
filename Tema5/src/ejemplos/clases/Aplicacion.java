package ejemplos.clases;

public class Aplicacion {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(2,3);
		Rectangulo r3 = r1;
		Rectangulo r2 = null;
		
		try {
			r2 = (Rectangulo) r1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		//r1.incrementarAlto();
		System.out.println(r1);
		
		System.out.println(r2);

		if (r1.equals(r2)) {
			System.out.println("Son iguales");
		}
		
		if (r1.equals(r3)) {
			System.out.println("Son iguales");
		}
	}

}
