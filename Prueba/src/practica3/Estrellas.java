package practica3;

import java.util.Scanner;

public class Estrellas {

	public static void main(String[] args) {
		
		// Pedir n por teclado (1-10)
		//n = 3
		//  *       2 espacios - 1 estrella   - 0 estrella    espacios = 3-nestrellas
		// ***      1 espacio  - 2 estrellas  - 1 estrella   espacios = 3-nestrellas
		//*****     0 espacios - 3 estrellas  - 2 estrella   espacios = 3-nestrellas
		
		// for (i=1 hasta 3) {
		//    for (1 - numero-i) { 
        //			print " "
		//    }
		//    for ( 1 - i) {
		//          print "*"
		//    }		
		//	  println
		// }
		
		int numero=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número para crear la figura");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch(Exception e) {
			System.out.println("Error no me has escrito un número");
		}
		
		
		for(int i=1; i <= numero; i++) {
			for(int j=1; j <= numero-i; j++ ) {
				System.out.print(" ");	
			}
			
			for(int j=1; j <= i; j++) {
				System.out.print("*");				
			}
			
			for(int j=1; j <= i-1; j++) {
				System.out.print("*");				
			}
			
			System.out.println();
			
			
		}
	}

}