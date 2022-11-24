package practica2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
			
		     Scanner in = new Scanner(System.in);
		        int hrs1, hrs2, min1, min2, seg1;
		        int seg2;
		        System.out.print("Ingresa el valor de hrs1: ");
		        hrs1 = in.nextInt();
		        in.nextLine();
		        System.out.print("Ingresa el valor de min1: ");
		        min1 = in.nextInt();
		        in.nextLine();
		        System.out.print("Ingresa el valor de seg1: ");
		        seg1 = in.nextInt();
		        in.nextLine();
		        seg2=seg1%60;
		        min2=min1+(seg1-seg2)/60;
		        hrs2=hrs1+(min2-min2%60)/60;
		        min2=min2%60;
		        hrs2=hrs2%24;
		        System.out.println("Valor de hrs2: " + hrs2);
		        System.out.println("Valor de min2: " + min2);
		        System.out.println("Valor de seg2: " + seg2);
		    }


	}