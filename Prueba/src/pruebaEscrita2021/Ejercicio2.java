package pruebaEscrita2021;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static int buscar(String[] palabras, String palabra) {
		for(int i=0; i < palabras.length; i++) {	
			// if (palabras[i].equals(palabra)) --> también funciona
			if (palabras[i].compareTo(palabra) == 0 ) {				
				return i; //Encontrado, devolvemos la posición en el array
			}
		}
		
		return -1; //No encontrado
	}

	public static void main(String[] args) {
		
		String[] palabrasES = { "hola", "hogar", "perro","gato", "mono", "coche", "tren", "luna", "juego", "mesa", "people","casa","facil","dificil","lugar" };
		String[] palabrasEN = { "hello", "home", "dog","cat", "monkey", "car", "train", "moon", "game", "table", "gente","house","easy","hard","place" };
		
		String palabra = "";
		int opcion = 0;
		int posicion = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Elige opción:");
			System.out.println("1. ES a EN");
			System.out.println("2. EN a ES");
			System.out.println("3. Salir");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("Traduciendo español - inglés ...");
				System.out.println("Introduce palabra: ");
				palabra = sc.nextLine();
				posicion = buscar(palabrasES, palabra);
				
				System.out.println("Traducción: " + palabrasEN[posicion]);
				break;
			case 2:
				System.out.println("Traduciendo inglés - español ...");
				System.out.println("Introduce palabra: ");
				palabra = sc.nextLine();
				posicion = buscar(palabrasEN, palabra);
				
				System.out.println("Traducción: " + palabrasES[posicion]);
				break;			
			}
			
		} while (opcion != 3);

	}
}