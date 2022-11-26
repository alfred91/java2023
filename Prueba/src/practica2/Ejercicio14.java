package practica2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio14 {

	public static void main(String[] args) 
	{
		System.out.println("Introduce el numero de tiradas");
		
		Scanner input = new Scanner(System.in);
		int numeroTiradas=input.nextInt();
		Random ranNum = new Random();
		
		System.out.println("Tus tiradas: ");
		int total =0;
		int numAleatorio=0;
		
		for(int i=0;i<numeroTiradas;i++) {
			
			numAleatorio=ranNum.nextInt(6)+1;
			total = total + numAleatorio;
			System.out.print(numAleatorio+" ");
			System.out.print(" ");
			}
		
		System.out.println("");
		System.out.println("Total: "+total);
	
		input.close();

	}
}