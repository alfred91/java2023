package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio24 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre 1 y 999");
		int n=0;
		int i=0;
		n=sc.nextInt();
		
		if (n>0&&n<1000)
		for (i=0;n>0;n/=10,i*=10)
		    i+=n%10;
		System.out.println("El nº al reves: "+i/10); 
	}}