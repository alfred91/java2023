package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero para calcular las cifras: ");
		num=sc.nextInt();
		System.out.print("El numero "+num);
		int digitos=0;
		
		while(num !=0)
		 {
		   num = num/10;
		   digitos++;
		 }

	System.out.println(" tiene "+digitos+" Digitos");
}}