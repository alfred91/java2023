package practica2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Introduce el valor de A ");
		a = sc.nextInt();
		System.out.println("Introduce el valor de B ");
		b = sc.nextInt();
System.out.println("Valores iniciales: A= "+a+" B: "+b);

a=a+b;
b=a-b;
a=a-b;
System.out.println("Valores inrercambiados: A "+a+" B= "+b);
	}
}