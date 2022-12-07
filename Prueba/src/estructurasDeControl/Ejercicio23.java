package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio23 {
	
	public static void main(String[] args) {
		double numero=0;
		double suma=0;
		double media=0;
		double total=0;
		double cantidad;
		double mayor=0;
		double menor=10e10;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cantidad: ");
		cantidad= Double.parseDouble(sc.nextLine());
		
		for(i=0;i<cantidad;i++) {
			
			System.out.println("Dime un número");
			numero = Double.parseDouble(sc.nextLine());
			
			if (numero<menor) {menor=numero;}
			if (numero>mayor) {mayor=numero;}
		
			if (numero!=0) {
			total=total+numero;
			suma=suma+1;
			media=total/suma;
							}
									}
		sc.close();
		
		System.out.println("La media deberia ser "+media);
		System.out.println("El mayor es "+mayor);
		System.out.println("El menor es "+menor);
		}
	}