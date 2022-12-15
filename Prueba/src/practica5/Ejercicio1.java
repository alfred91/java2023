package practica5;
import java.util.Scanner;
public class Ejercicio1 {
	
	 public static String reverse(String str) {
	        return new StringBuffer(str).reverse().toString();
	    }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Escribe una cadena: ");
			String str =sc.nextLine();
			 
	        // Tenga en cuenta que la string es inmutable en Java
	        str = reverse(str);
	 
	        System.out.println("Stringbuffer: " + str);
	        
			
			System.out.println("Escribe una cadena: ");
			
			String cadena= sc.nextLine();
			
			// Esta será la cadena invertida, primero está vacía
			String invertida = "";
			
			// Recorremos la original del final al inicio
			for (int indice = cadena.length() - 1; indice >= 0; indice--) {
				
				// Y vamos concatenando cada carácter a la nueva cadena
				invertida += cadena.charAt(indice);
			}
			System.out.println("Cadena original: " + cadena);
			System.out.println("String : " + invertida);
		}
	}