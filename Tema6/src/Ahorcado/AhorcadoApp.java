package Ahorcado;
import java.util.Scanner;

public class AhorcadoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabrasVarias;
		boolean repetir = false;
		int contador = 0;
		char intentoLetra = '*';
		boolean ganar = false;

		System.out.println("***JUEGO DEL AHORCADO***");
		System.out.println("Introduce 5 palabras. Luego se establecer� una al azar que tendr�s que adivinar");

		Ahorcado juego = new Ahorcado();

		do {
			try {
				palabrasVarias = sc.nextLine().toUpperCase();
				juego.addPalabra(new Palabras(palabrasVarias));
				contador++;

			} catch (Exception e) {
				repetir = true;
				System.out.println("Introduce solo letras sin espacios");
			}

		} while ((repetir == true) || contador < 5);

		contador = 0;

		System.out.println("");

		juego.setPalabraAdivinar();

		juego.setPalabraActual();

		System.out.println("Comenzamos el juego. Puedes escribir una letra o escribir una palabra e intentar resolver");
		System.out.println("Tienes 5 intentos antes de que el 'Ahorcado' quede completamente dibujado y pierdas");

		do {
			System.out.println(juego.getPalabraActual());
			try {
				palabrasVarias = sc.nextLine().toUpperCase();

				if (palabrasVarias.length() == 1) {
					intentoLetra = palabrasVarias.charAt(0);
					if (!juego.intentar(intentoLetra))
						contador++;
					System.out.println("Intento n� " + contador);
					repetir = true;
				}

				else {
					System.out.println("Has decidido resolver con la palabra: " + palabrasVarias);
					ganar = juego.resolver(palabrasVarias);

					repetir = false;
				}

			} catch (Exception e) {
				System.out.println("Introduce solo letras sin espacios");
			}
		} while (repetir == true && contador < 5);

		if (ganar == true)
			System.out.println("Has acertado la palabra. Has ganado!");
		else
			System.out.println("Lo siento. Has perdido. La palabra secreta era: " + juego.getPalabraAdivinar());
	}

}