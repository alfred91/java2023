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

	        str = reverse(str);
	 
	        System.out.println("Stringbuffer: " + str);
	        
			System.out.println("Escribe una cadena: ");
			
			String cadena= sc.nextLine();

			String invertida = "";

				for (int indice = cadena.length() - 1; indice >= 0; indice--) {

					invertida += cadena.charAt(indice);
				}
					System.out.println("Cadena original: " + cadena);
					System.out.println("String : " + invertida);
		}
	}