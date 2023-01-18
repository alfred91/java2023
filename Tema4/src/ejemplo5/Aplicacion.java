package ejemplo5;

public class Aplicacion {

	public static void main(String[] args) {
		

		Coche c1 = new Coche("Mercedes", "9876 LKC");
		Coche c2 = new Coche("BMW", "6666 JJJ");
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		System.out.println(Coche.numCoches);
	}

}
