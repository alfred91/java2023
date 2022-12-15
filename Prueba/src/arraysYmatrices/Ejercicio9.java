package arraysYmatrices;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] tabla = new int[5];
		int pos;
		
		for (int i=0; i<tabla.length;i++) {
			System.out.println("introduce un numero: ");
			tabla[i] = sc.nextInt();}
		
		System.out.println("introduce una posicion: ");
		pos= sc.nextInt();
		
		for (int i=pos; i<tabla.length;i++) {
			tabla[i]=tabla[i+pos];
			
			if(tabla[i+pos]>=5) {
				tabla[i+pos]=tabla[i-pos];
			}
		}
		
			for(int i=0; i<tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
	}
}