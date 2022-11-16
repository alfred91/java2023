package practica2;

public class Ejercicio1 {

	public static void main(String[] args) {

		int a=6, b=2, c=3;
		int res=0;
		
		res=(a*c)%c; // 6 * 3 % 3 = 0
		
		res=a*b/c;  // 6 * 2 / 3 = 4
		
		res=c%b+c*b; // El resto de 3/2[1] + 2*3 [6] = 7
				
		res=a%(a*b*c/(b+c)); // 6 % (6*2*3)[36]/(2+3)[5] 7 = 6
	
		res=b*b+c-b*(a%b); // 4 +3 - 0 = 7
				
		System.out.println(res);

		}
}