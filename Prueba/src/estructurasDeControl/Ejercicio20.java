package estructurasDeControl;
import java.util.Scanner;
public class Ejercicio20 {
	
	public static void main(String[] args) {
		int numero=0,divisor=0,i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero=sc.nextInt();
		System.out.print("DIVISORES: ");
		if(numero>0) {
		for(i=1;i<numero;i++) {
			if(numero%i==0){
				System.out.print(i+" ");
				}
			}
		}
	}
}