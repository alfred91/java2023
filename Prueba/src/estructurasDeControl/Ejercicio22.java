package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio22 {
	public static void divisor() {	
	int numero=0,i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduce un número: ");
	numero=sc.nextInt();
	sc.close();
	System.out.print("DIVISOR MAXIMO: ");
	
	if(numero>1) {
		
		for(i=numero-1;i>0;i--){
			if(numero%i==0){
				System.out.print(i);
					break;
							}
							   }
				  }				}
	public static void main(String[] args) {
		divisor();		
	}
}