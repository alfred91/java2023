package ejemplo1;


public class Aplicacion {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche("Peugeot", "407 Coupé", "", 30000);
		Coche cocheMiTia = new Coche("BMW", "i3", "blanco", 450000);
		Coche cocheMiTia2 = new Coche("BMW", "i3", "blanco", 450000);
		
		System.out.println(cocheMiTia.pintar());
		
		cocheMiTia.setPrecio(46500);
		cocheMiTia.precio = 0;
		
		System.out.println(cocheMiTia.pintar());
		System.out.println(miCoche.pintar());
		
		System.out.println(miCoche.getModelo());
		
		System.out.println(cocheMiTia);
		System.out.println(cocheMiTia2);

	}
	
	public static void main2() {
		
	}


}
