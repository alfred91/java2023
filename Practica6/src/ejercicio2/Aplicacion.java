package ejercicio2;

public class Aplicacion {

	public static void main(String[] args) {
		Coche c1=new Coche();
		
		System.out.println(c1.getVelocidad());
		c1.acelera(100);
		c1.acelera(10);
		
		System.out.println(c1.getVelocidad());
		c1.frena(120);
		System.out.println(c1.getVelocidad());
		
	}

}