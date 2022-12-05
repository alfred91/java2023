package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio9 {
	
static double factorial(int n)
{
	  if (n == 0)
	  return 1;
	   
	  return n*factorial(n-1);
	 }

	public static void main(String[] args) {	 
	int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = Integer.parseInt(sc.nextLine());
		  System.out.println("El factorial de "+ num + " es " + factorial(num));
		 }
		
	}