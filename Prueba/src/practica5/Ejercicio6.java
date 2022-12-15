package practica5;

public class Ejercicio6 {

	public static void main(String[] args) {
		String[] cadenas = { "Natural", "es o no es", "Hola", "Sol", "Sacas", "Otto", "Oso",
				"A ti no, bonita",};
		for (String cadena : cadenas) {
			System.out.println("¿'" + cadena + "' es palíndromo? " + esPalindromo(cadena));
		}
	}

	/**
		Comprobar si es palíndromo en Java
		@author parzibyte
	*/
	public static boolean esPalindromo(String cadena) {
		// Convertir a minúscula y quitar espacios " ", puntos "." y comas ","
		// También remplazar palabras con acento p.ej. í => i

		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		// Invertir la cadena, y si es igual que la original entonces
		// son palíndromos
		String invertida = new StringBuilder(cadena).reverse().toString();
		// Para invertir recomiendo ver
		// https://parzibyte.me/blog/2019/02/20/invertir-cadena-string-java/
		return invertida.equals(cadena);
	}
}