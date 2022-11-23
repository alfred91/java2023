package prueba;

import java.util.Scanner;

public class CalculadoraFunciones {
	public static double leerTeclado() {
		double numero=0;
		Scanner sc = new Scanner 
	}

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
			System.out.println("5. Salir");
			
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
			case
			}
	sc.close();
	}}