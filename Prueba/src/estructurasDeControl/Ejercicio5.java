package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero=0;
	 
			do{ Scanner sc = new Scanner(System.in);
			System.out.println("Dime un numero");
			numero = Integer.parseInt(sc.nextLine());
				}		
			while (numero<1 || numero>10);
	}
}