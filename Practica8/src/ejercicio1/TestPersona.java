package ejercicio1;

import java.util.Scanner;

public class TestPersona {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce el nombre: ");
	        String nombre = sc.nextLine();

	        System.out.print("Introduce la edad: ");
	        int edad = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Introduce el DNI: ");
	        String dni = sc.nextLine();
	        
	        System.out.print("Introduce el sexo H o M: ");
	        char sexo = sc.next().charAt(0);;

	        System.out.print("Introduce el peso: ");
	        int peso = sc.nextInt();
	      
	        System.out.print("Introduce la altura CMs: ");
	        double altura = sc.nextDouble();
	        
	        
	       Persona persona = new Persona(nombre, edad, dni, sexo, peso, altura);
	       System.out.println("Mayor de edad? "+persona.esMayordeEdad());
	       System.out.println("IMC "+persona.calcularIMC());

	        
	        System.out.println("Ingrese nuevos datos para la persona:");
	        System.out.print("Nuevo nombre: ");
	        nombre = sc.next();
	        System.out.print("Nueva edad: ");
	        edad = sc.nextInt();
	        System.out.print("Nuevo sexo (M o F): ");
	        sexo = sc.next().charAt(0);;
	        System.out.print("Nuevo peso: ");
	        peso = sc.nextInt();
	        System.out.print("Nueva altura en metros: ");
	        altura = sc.nextDouble();
	        System.out.println("Mayor de edad? "+persona.esMayordeEdad());
		    System.out.println("IMC "+persona.calcularIMC());
	        
	        Persona nuevaPersona = new Persona(nombre, edad, dni, sexo, peso, altura);
	        nuevaPersona.esMayordeEdad();
	        nuevaPersona.calcularIMC();
	 
	    }
	   
}
