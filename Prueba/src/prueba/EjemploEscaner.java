package prueba;

import java.util.Scanner;

public class EjemploEscaner {

	public static void main(String[] args) {
int numero=0, error;

		Scanner sc = new Scanner(System.in); //LEER POR TECLADO
		
	do {
		try {
			numero = Integer.parseInt(sc.nextLine());
			error = 0;
		} catch (Exception e) {
			System.out.println("Te hassss equivocado, introduce un entero por favor");
			error=1;}
		} 
	while (error==1);
		
		System.out.println(numero);
		
		}
	}