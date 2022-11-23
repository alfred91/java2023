package prueba;

import java.util.Scanner;

public class EjemploScannerNumeros {

	public static void main(String[] args) {
int cantidad=0;
double precio=0d;

Scanner sc = new Scanner(System.in);
try {
		System.out.println("Dime el precio del producto");
		precio = Double.parseDouble(sc.nextLine());
		System.out.println("Dime la cantidad que quieres comprar");
		cantidad = Integer.parseInt(sc.nextLine());
}catch (Exception e) 
{
		System.out.println("Total de la compra " + (precio * cantidad));
	}

	}}