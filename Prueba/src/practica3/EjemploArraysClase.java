package practica3;
import java.util.Scanner;
public class EjemploArraysClase {

	public static void pintarVectorInt(int vector[]) {
		System.out.println("[");
		for (int i=0; i<vector.length;i++) {
			if (i==vector.length-1)
				System.out.println(vector[i]);
			else
				System.out.println(vector[i] + ", ");
		}
		System.out.println("]");
	}
		//CREA UN ARRAY DE 6
		//PIDE POR TECLADO 6 ENTEROS Y GUARDALOS EN EL ARRAY
		//PINTA EL ARRAY 
		//DIME EL MAYOR Y LA POSICION
	
	public static void main(String[]args) {
		int elem[]=new int[6];
		Scanner sc=new Scanner(System.in);
		try {
			for (int i=0; i< elem.length;i++) {
				elem[i] = Integer.parseInt(sc.nextLine());
						}}
			catch (Exception e) {
				System.out.println("Error leyendo de teclado");
			}
			int mayor = elem[0];
			int posicion=0;
			int suma=0;
		}
			
	}