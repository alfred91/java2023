package refactor;

public class Ej08_ChangeMethodSignature {
	
	public static void main(String[] args) {
		
		System.out.println(esPrimo(0));
	}

	private static boolean esPrimo(int n) {
		
		//int numero = 75;
		
		int contador = 2;
		
		boolean primo = true;
		
		while (primo && contador != n) {
			
			if (n % contador == 0)
				
				primo = false;
			
			contador++;
		}
		
		return primo;
	}
}