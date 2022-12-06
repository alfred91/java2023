package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) {
		double numero=0, suma=0;
		double media=0;
		double total=0;
	
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dime un número");
			numero = Double.parseDouble(sc.nextLine());
			if (numero!=0) {
			total=total+numero;
			suma=suma+1;
			media=total/suma;
			}}
		while (numero!=0);
		
		System.out.println(" La media deberia ser: "+media);
		}
	}