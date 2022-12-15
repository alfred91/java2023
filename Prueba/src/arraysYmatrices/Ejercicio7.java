package arraysYmatrices;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] tabla = new int[10];
		int numero=0;
		int posicion = 0;
		for(int i=0; i<2; i++) {
			
			tabla[i] = (int) (Math.random() * 10 +1);
		}
		
		for(int i=0; i<2; i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.println();
		
	for (int i=2; i<10;i++) {
		System.out.println("introduce un numero: ");
		tabla[i] = sc.nextInt();}
	
		System.out.println("introduce un numero para posicionar: ");
		numero= sc.nextInt();
	
		System.out.println("introduce una posicion: ");
		posicion= sc.nextInt();
		
				//Empezamos por el final
		for(int i=tabla.length-1; i>posicion; i--) {
			tabla[i] = tabla[i-1];
		}
		//Ahora pongo el nuevo número
		
		tabla[posicion] = numero;
		
		for(int i=0; i<tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
	}
}