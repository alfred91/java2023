package prueba;

import java.util.Scanner;

public class EjemploIf2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	char sexo;
	int edad;
	edad=sc.nextInt();
	sexo=sc.next().charAt(0);
	
	System.out.println("Escribe el sexo");
	
	
	System.out.println("Escribe la Edad");
	
	if (edad<=11) {
		System.out.println("Hola niño");
		
	}else {
		if (edad<=18)
			System.out.println("Hola adolescente macho")
			else 
				if (edad<=55) {System.out.println("Hola hombre")
				else System.out.println("Que hay de nuevo viejo?")	
	}

}
