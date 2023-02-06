package ejercicio6;

public class Aplicacion {

	public static void main(String[] args) {
		
	Satelite satelite = new Satelite(100,100,1000);
	
	satelite.printPosicion();
	System.out.println();
	satelite.variaAltura(50);
	satelite.variaPosicion(50,50);
	satelite.printPosicion();
	System.out.println();
	if(satelite.enOrbita()==true) {
		System.out.println("El satelite esta en orbita");}
	else {
		System.out.println("Estamos con los pies en la tierra");}
	}
}