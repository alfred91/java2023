package pooCursoJava;

public class Coche {

	int ruedas;
	int largo;
	int ancho;
	int motor;
	int peso;
	
//	CONSTRUCTOR
	
	public Coche () {
		ruedas=4;
		largo=3000;
		ancho=1800;
		motor=5000;
		peso=3000;
	}
	public static void main(String[] args) {

		Coche Audi=new Coche();
		
		System.out.println("Este coche tiene "+Audi.ruedas+" ruedas.");
		
	}
}
