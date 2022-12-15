package practica5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String palabra = "";
		String palabraSinCaracterFinal = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		
		try {
			palabra = sc.nextLine();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		//Girar la cadena
		StringBuffer sb = new StringBuffer(palabra);
		sb.reverse();
		
		palabraSinCaracterFinal = palabra.substring(0, palabra.length() - 1);		
		
		System.out.println(palabraSinCaracterFinal + sb);
	}

}