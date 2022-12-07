package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio25 {
	
	public static void main(String[] args) {
		long numero=0;
		long falta,invertido,resto;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero = sc.nextLong();
			while (numero<=0);
			falta=numero;
			invertido=0;
			resto=0;
				
			while (falta!=0) {
			resto=falta%10;
			falta=falta/10;
			invertido=invertido*10+resto;}
				
	if(invertido==numero)
		 System.out.println("Es capicua");
	else System.out.println("No es capicua");
		}
	}