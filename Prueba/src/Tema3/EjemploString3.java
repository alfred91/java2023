package Tema3;

public class EjemploString3 {

	public static void main(String[] args) {
		// Comprueba que tenga Mayus
		//toLowerCase, Si al convertirla es igual entonces no tiene Mayus
		
		String cadena="abc123DEF";
		
		if (cadena.equals(cadena.toLowerCase())) {
			System.out.println("Cadena en minúsculas");
		}else {
			System.out.println("La cadena tiene al menos una mayúscula");
		}
	}

}