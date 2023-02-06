package ejercicio5;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		System.out.println("Introduce un numero: ");
		int i=sc.nextInt();
		System.out.println("El valor del numero es: "+Numero.getValor(i));
		System.out.println("El doble del numero es: "+Numero.getDoble(i));
		System.out.println("El valor inicial del numero es: "+Numero.setNumero(i));
	sc.close();
	}
}