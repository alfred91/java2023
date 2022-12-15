package arraysYmatrices;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] tabla = new int[5];
		int ultimo;
		for (int i=0; i<5;i++) {
			System.out.println("introduce un numero: ");
			tabla[i] = sc.nextInt();}
		
		ultimo=tabla[tabla.length-1];
		
			//Empezamos por el final
		for(int i=tabla.length-1; i>0; i--) {
			tabla[i] = tabla[i-1];
		}
		//Ahora pongo el nuevo número
		
		tabla[0]=ultimo;
		
		for(int i=0; i<tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
	}
}