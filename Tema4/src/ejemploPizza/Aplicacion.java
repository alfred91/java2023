package ejemploPizza;

public class Aplicacion {

	public static void main(String[] args) {
		
		Pizza pi1 = new Pizza("Normal", "Barbacoa");
		Pizza pi2 = new Pizza("Normal", "Cuatro quesos");
		Pizza pi3 = new Pizza("Normal", "Hawaiana");
		
		System.out.println(Pizza.totalPedidas());
		System.out.println(Pizza.totalServidas());
		
		pi2.servir();
		pi3.servir();
		
		System.out.println(Pizza.totalServidas());
		
		
	}

}
