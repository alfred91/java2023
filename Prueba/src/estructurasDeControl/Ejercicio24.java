package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio24 {
	
	public static void main(String[] args) {
		double numero=0, suma=0;
		double media=0;
		double total=0;
		double cantidad=0;
		double mayor=0;
		double menor=0;
		int i=0;
		int numeros[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cantidad: ");
		cantidad= Double.parseDouble(sc.nextLine());
		
		for(i=1;i<=cantidad;i++) {
			
			System.out.println("Dime un número");
			numero = Double.parseDouble(sc.nextLine());
			
			if (numero!=0) {
			total=total+numero;
			suma=suma+1;
			media=total/suma;
			numero=numeros[];
			}
			}
		sc.close();
		
		System.out.println(" La media deberia ser: "+media);
		System.out.println();
		}
	}