package Ejercicio11;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		int pX = 0, pY = 0;
		boolean error = true;
		Robot rb = null;
		
		Scanner sc = new Scanner(System.in);
		
		while (error == true) {
			System.out.println("Introduce CX");
			pX = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce CY");
			pY = Integer.parseInt(sc.nextLine());

			error = false;
			
			try {
				rb = new Robot(pX, pY);
			} catch (Exception e) {
				error = true;
				System.out.println(e.getMessage());
			}
		}

		rb.irArriba();
		rb.irDerecha();
		System.out.println(rb);

	}

}
