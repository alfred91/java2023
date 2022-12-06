package estructurasDeControl;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		int uno, dos=0, i=0, pares=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el 1º numero: ");
		uno=sc.nextInt();
		System.out.println("Introduce el 2º numero: ");
		dos=sc.nextInt();
		if(dos>uno) {
		pares=(dos-uno)/2+1;
		for (i=uno;i<=dos;i++)
			
		{ if(i%2==0)
				System.out.println(i);
		;}
		System.out.println("Contador de números pares : "+pares);
		}	else {
			pares=(uno-dos)/2+1;
			for (i=dos;i<=uno;i++)
		
	{ if(i%2==0)
			System.out.println(i);
	;}
	System.out.println("Contador de números pares : "+pares);{}
		}}
}