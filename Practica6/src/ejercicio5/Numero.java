package ejercicio5;
import java.util.Scanner;

public class Numero {
Scanner sc=new Scanner(System.in);
	private int numero;

	Numero(int numero) {
		super();
		this.numero = numero;
		numero = 0;
	}
	
	public int suma() {	
	System.out.println("Introduce un numero para sumar: ");
		int sumando=sc.nextInt();
		int suma = sumando+numero;
			return suma;
	
	}
	
	public int resta() {	
		System.out.println("Introduce un numero para restar: ");
			int sustraendo=sc.nextInt();
			int resta = numero-sustraendo;
				return resta;
		}
	
	public static int getValor(int numero) {
		return numero;
	}
	public static int getDoble(int numero) {
		return numero*2;
	}
	public static int setNumero(int numero) {
		
		return numero*0;
	}
	
}