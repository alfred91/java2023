package Tema3;

import java.util.Scanner;

public class Ejercicio91 {

		
	public static void main(String[] args) {
		int numero=0;
		double acumulador=1;
Scanner sc = new Scanner(System.in);

System.out.println("Dime un numero para calcular su division por 10");
numero = Integer.parseInt(sc.nextLine());


for(int i=numero; i%10>10; i/10) {
	acumulador = acumulador / i;
}
System.out.println("El factorial de "+numero+" es "+acumulador);
	}

}