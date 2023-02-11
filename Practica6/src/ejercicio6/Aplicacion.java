package ejercicio6;

public class Aplicacion {

	public static void main(String[] args) {
		
	Satelite satelite1 = new Satelite(100,100,1000);

	satelite1.printPosicion();
	System.out.println();
	System.out.print("Variamos la altura +50. ");
	satelite1.variaAltura(50);
	System.out.println(" Variamos la posicion +50 +50.");
	satelite1.variaPosicion(50,50);
	satelite1.printPosicion();
	System.out.println();
	System.out.println(satelite1.enOrbita());

	
	}
}