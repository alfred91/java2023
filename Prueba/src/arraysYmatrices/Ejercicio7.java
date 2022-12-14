package arraysYmatrices;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		
		int[] tabla = new int[10];
		int numero=0;
		int posicion = 0;
		for(int i=0; i<8; i++) {
			tabla[i] = (int) (Math.random() * 10 +1);
		}
		
		for(int i=0; i<tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un numero: ");
		numero= sc.nextInt();
		System.out.println("introduce una posicion: ");
		posicion= sc.nextInt();
		
				//Empezamos por el final
		for(int i=tabla.length-1; i>posicion; i--) {
			tabla[i] = tabla[i-1];
		}
		//Ahora pongo el nuevo número
		
		tabla[posicion] = numero;
		
		for(int i=0; i<tabla.length-1; i++) {
			System.out.print(tabla[i] + " ");
		}
	}
}