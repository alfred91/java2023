package primeraevaluacion;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void tirada(String args[])
    {
        System.out.print("Introduce el nº de tiradas: ");

        Scanner input = new Scanner(System.in);
        int ntiradas = input.nextInt();

        Random ranNum = new Random();

        System.out.print("Tus resultados : ");
        int total = 0;
        int numale = 0;

        for (int i = 0; i < ntiradas; i++) {

            numale = ranNum.nextInt(6) + 1;
            total = total + numale;
            System.out.print(numale);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Total: " + total);
        input.close();
    }
	
		  public static void main(String[] args) {

		    int dado1, dado2;
		    int suma=0;
		    int suma1=0;
		    int ntiradas=0;
		    int total=0;
		    do {
		      dado1 = (int)(Math.random() * 6) + 1;
		      	suma=dado1+suma;
		      	ntiradas=ntiradas+1;
		      dado2 = (int)(Math.random() * 6) + 1;
		      	suma1=dado2+suma1;
		      	total=suma+suma1;
		      	
		      System.out.println(dado1 + " " + dado2);
		      
		    } while (dado1 !=6 || dado2 !=6);
		    
		    
		    
		    
		    total=total-12;
		    System.out.println(suma+" "+suma1);
		    System.out.println("Nª tiradas: "+ntiradas);
		    System.out.println("La suma total hasta que sacaron un 6: "+total);
		  }
	}