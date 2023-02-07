package ejercicio2;

public class Aplicacion {

	public static void main(String[] args) {
		
	Coche c1=new Coche();
		
		System.out.println("Velocidad inicial: "+c1.getVelocidad());
		
		c1.acelera(100);
		
		System.out.println("Velocidad tras acelerar "+c1.getVelocidad()+": "+c1.getVelocidad());
		
		c1.frena(50);
		
		System.out.println("Velocidad tras frenar "+c1.getVelocidad()+": "+c1.getVelocidad());
		
	}

}