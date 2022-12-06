package estructurasDeControl;
import java.util.Scanner;
public class Ejercicio21 {
	
	public static void esPrimo() {
		int num=0;
		boolean esPrimo=true;
		boolean noEsprimo=false;
		 Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero y te dire si es primo: ");
			 	num = sc.nextInt();
		 sc.close();
			 	
		 if(num%2!=0 && num%3!=0 && num%4!=0 && num%5!=0 && num%6!=0 && num%7!=0 && num%8!=0&& num%9!=0)
		 	{System.out.println(esPrimo);	}
		
		 else if (num%2==0 || num%3==0 || num%4==0 || num%5==0 || num%6==0 || num%7==0 || num%8==0 || num%9==0)
			{System.out.println(noEsprimo);		}
	}		
	
	public static void main(String[] args) {
esPrimo();
	}
}