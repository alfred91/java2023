package primeraevaluacion;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una palabra o frase: ");
		String cadena=sc.nextLine();
		System.out.println("Ingrese la vocal por la cual quiere reemplazar "+ "las letras de la palabra o frase ingresada ");
		String vocal =sc.nextLine();
		String regexp="[aeiouAEIOU]";
		System.out.println(cadena.replaceAll(regexp, vocal));
	}
}