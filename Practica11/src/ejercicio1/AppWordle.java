package ejercicio1;

import java.util.Scanner;

public class AppWordle {
	
	public static void main(String[] args) {
	    Wordle juego = new Wordle();
	    System.out.println("La palabra a adivinar tiene 5 letras. Tienes 6 intentos.");
	    Scanner scanner = new Scanner(System.in);
	    int intentos = 0;
	    while (intentos < 6) {
	        System.out.print("Introduce una palabra: ");
	        String intento = scanner.next().toUpperCase();
	        if (juego.comprobar(intento)) {
	            System.out.println("YOU WIN!");
	            return;
	        } else {
	            System.out.println(juego.toString());
	            System.out.print("Letras que no están: ");
	            for (char letra : juego.getLetrasNoEstan()) {
	                System.out.print(letra + " ");
	            }
	            System.out.println();
	        }
	        intentos++;
	    }
	    System.out.println("YOU LOSE");
	}
}