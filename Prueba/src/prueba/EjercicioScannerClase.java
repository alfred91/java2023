package prueba;

import java.util.Scanner;

public class EjercicioScannerClase {

	public static void main(String[] args) {
		String nombre ="";
		double sueldoNeto =0 ;
		int irpf = 0;
	
		Scanner sc = new Scanner(System.in);
			
		try {
		
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		
		System.out.println("Introduce tu Sueldo Bruto");
		sueldoBruto = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce el IRPF");
		irpf = sc Integer.parseInt(sc.nextLine());
		
		}
		catch (Exception.e) {
			System.out.println(e.getMessage());
		}
		sueldoNeto = sueldoBruto - (sueldoBruto * irpf / 100);
		System.out.println("Te queda limpio" +sueldoNeto+);
		}
		}