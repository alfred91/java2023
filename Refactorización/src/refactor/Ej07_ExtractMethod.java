package refactor;

public class Ej07_ExtractMethod {
	
	public boolean esPrimo(int numero) {
		
		int contador = 2;
		
		boolean primo = true;
		
		while (primo && contador != numero) {
			
			if (esMultiplo(numero, contador))
				
				primo = false;
			
			contador++;
		}
		
		return primo;
	}

	private boolean esMultiplo(int num1, int num2) {
		return num1 % num2 == 0;
	}

	public boolean esPar(int numero) {
		
		return (numero % 2 == 0);
	}

}