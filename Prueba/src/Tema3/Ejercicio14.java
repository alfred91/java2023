package Tema3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
	int numero=0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime u numero del 1 al 10");
	try {
	
	numero = Integer.parseInt(sc.nextLine());
	}catch (Exception e)
	{System.out.println("ERROR");}
	
	for(int i=1; i<=numero; i++) {
		for(int j=1; j<=(numero - i); j++) {
			System.out.print(" ");
		}
		
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		for(int j=1; j<=i-1;j++) {
			System.out.print("*");
		}
		System.out.println("");
		}
	
	}
}