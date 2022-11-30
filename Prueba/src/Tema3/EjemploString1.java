package Tema3;

public class EjemploString1 {

	public static void main(String[] args) {
		//1.Contar vocales de una cadena
		
		String cadena="Esto de la programacion es mas dificil de lo que parece";
		int contador=0;
		int i=0;
		//Recorrerse la cadena caracter a caracter -> .charAt(i);
		
		/* CON IF
		for (int i=0; i<cadena.length();i++) {
			if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e' ||
				cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u') {
			contador++}			
		}
		*/
		switch(cadena.charAt(i)) {
		case 'a','e','o','u','á','é','í','ó','ú','A','E','I','O','U':
		contador++;
		break;
		}
			System.out.println("Numero de vocales: "+contador);
	}
	}