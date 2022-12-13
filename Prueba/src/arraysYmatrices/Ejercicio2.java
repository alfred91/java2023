package arraysYmatrices;

import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args) {
		
		int i,min,max;
		int media=0;
		int total=0;
	    int[] numeros = new int[10];

	    	Scanner sc = new Scanner(System.in);

	     	for(i=0; i<numeros.length; i++)
	     		{
	            System.out.printf("Introduzca número "+(i+1)+" : ");
	            numeros[i] = sc.nextInt();
	     			}
	    	for(i=0; i< numeros.length; i++) {
				total=total+numeros[i];
												}	
	    	media=total/numeros.length;
	        
			min=max=numeros[0];
			
			for(i = 0; i < numeros.length; i++)
			{
				if(min>numeros[i])
				{
						min=numeros[i];
				}
				if(max<numeros[i])
				{
					max=numeros[i];
				}
			} 
				System.out.println("El máximo es " +max + " y el minimo es " +min+" la media es: "+media);
	}
}