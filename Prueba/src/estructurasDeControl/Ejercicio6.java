package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio6 {

	    public static void main(String[] args) {
	    	
		        Scanner sc = new Scanner(System.in);
		        int n;
		        System.out.print("Introduce un número entero: ");
		        n = sc.nextInt();
		           
		        int i = 1;
		        while (n>0 && i < n-1) {
		            System.out.println((i+=2));		            
		        }		    
	}

}