package prueba;

import java.util.Scanner;

public class EjemploMenu {

	public static void main(String[] args)throws Exception {

		int opcion = 0;
		
		//CREAR SCANNER

		Scanner sc = new Scanner(System.in);
		
			//PINTAR TODAS LAS OPCIONES
			do {
			
			System.out.println("1. Saludar");
			System.out.println("2. Despedirse");
			System.out.println("3. Darse la mano");
			System.out.println("4. Salir");
			
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
				System.out.println("Hola que tal");
				break;
			case 2:
				System.out.println("Hasta pronto!");
				break;
			case 3:
				System.out.println("WhatsupBRoH!?");
				break;
			case 4:
				System.out.println("TastaLuego!");
				break;
			}
		} while (opcion!= 4);
	sc.close();
	}}