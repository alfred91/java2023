package Tema3;

import java.util.Scanner;

public class Ejercicio9 {

		
	public static void main(String[] args) {
		double numero=0;
		double acumulador=1;
Scanner sc = new Scanner(System.in);

System.out.println("Dime un numero para calcular su factorial");
numero = Double.parseDouble(sc.nextLine());


for(double i=(int)numero; i>=1; i--) {
	acumulador = acumulador * i;
}
System.out.println("El factorial de "+numero+" es "+acumulador);
	}

}