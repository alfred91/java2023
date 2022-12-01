package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static int billetes(int cinco, int diez, int veinte,
			int cincuenta, int cien, int doscientos, int quinientos) {
int cinco=5; int diez=10; int veinte=20; int cincuenta=50;
int cien=100; int doscientos=200; int quinientos=500;
int cantidad=0;
Scanner sc = new Scanner(System.in);
System.out.println("Introduce una cantidad");
cantidad = Integer.parseInt(sc.nextLine());

return cantidad; 
System.out.println();
}

	public static void main(String[] args) {
System.out.println(cantidad());

	}

}