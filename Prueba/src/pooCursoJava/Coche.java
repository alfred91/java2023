package pooCursoJava;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
//	CONSTRUCTOR
	
	public Coche () {
		ruedas=4;
		largo=3000;
		ancho=1800;
		motor=5000;
		peso_plataforma=1500;
	}
	
	public static void main(String[] args) {

		Coche Audi=new Coche();
		
		System.out.println("Este coche tiene "+Audi.ruedas+" ruedas.");
		
	}
}
