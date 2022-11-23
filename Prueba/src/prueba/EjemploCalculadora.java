package prueba;

import java.util.Scanner;

public class EjemploCalculadora {

	public static void main(String[] args)throws Exception {
		int opcion = 0;
		double numero1 = 0d;
		double numero2 = 0d;
		
		//CREAR SCANNER

		Scanner sc = new Scanner(System.in);
		
			//PINTAR TODAS LAS OPCIONES
			do {
			
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			
			//PEDIR AL USUARIO QUE ELIJA
			
			System.out.println("Dime la opción que eljes");
			try {
			opcion = Integer.parseInt(sc.nextLine());
			
			} catch 
			(Exception e){
				System.out.println("Opcion incorrecta");
			}
			
			//HACER ALGO EN FUNCION DE LA OPCION ESCOGIDA
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce el numero 1");
				numero1 = Integer.parseInt(sc.nextLine());
		
				System.out.println("Introduce el numero 2");
				numero2 = Integer.parseInt(sc.nextLine());
				System.out.println(numero1+" + "+numero2+" = " +(numero1 + numero2));
				
				break;
			case 2:
				System.out.println("Introduce el numero 1");
				numero1 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce el numero 2");
				numero2 = Integer.parseInt(sc.nextLine());
				System.out.println(numero1+" - "+numero2+" = " +(numero1 - numero2));
				break;
			case 3:
				System.out.println("Introduce el numero 1");
				numero1 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce el numero 2");
				numero2 = Integer.parseInt(sc.nextLine());
				System.out.println(numero1+" * "+numero2+" = " +(numero1 * numero2));
				break;
			case 4:
				System.out.println("Introduce el numero 1");
				numero1 = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce el numero 2");
				numero2 = Double.parseDouble(sc.nextLine());
				System.out.println(numero1+" / "+numero2+" = " +(numero1 / numero2));
				break;
			}
		} while (opcion!= 4);
	sc.close();
	}}