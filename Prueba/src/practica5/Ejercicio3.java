package practica5;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Escribe un texto: ");
			String frase= sc.nextLine();
		
		System.out.println("Introduce un caracter a buscar: ");
			String palabraBuscar = sc.nextLine();
		
		int contador = 0;
		int posicion = 0;
		
		//Si devuelve -1 es que ya no lo encuentra
		while (posicion >= 0) {
			posicion = frase.indexOf(palabraBuscar, posicion);
			
			if (posicion >= 0) {
				contador++;
				//posicion++;  //Así también vale
				posicion += palabraBuscar.length(); //Para que busque a partir de la palabra encontrada
			} 			
		}
		
		System.out.println("La palabra " + palabraBuscar + " aparece " + contador + " veces.");
	}
}