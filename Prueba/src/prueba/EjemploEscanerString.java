package prueba;

import java.util.Scanner;

public class EjemploEscanerString {

	public static void main(String[] args) {
		String nombre, apellido1, apellido2;
		
		Scanner sc = new Scanner(System.in);
		try {
		
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tu apellido 1");
		apellido1 = sc.nextLine();
		System.out.println("Introduce tu apellido 2");
		apellido2 = sc.nextline();
		
	} catch (Exeption e) {
		System.out.println("Error leyendo de teclado");
	}
		System.out.println("Te llamas" +nombre+ ""+apellido1+""+apellido2+);
	}
}
