package prueba;

public class EjemploWhile {

	public static void main(String[] args) {
	int n1=1, n2=2, suma=0;
			while (suma<100) {
				suma += n1+n2; //suma = suma
			}
	System.out.println(suma);
	
	// Numeros del 1 al 10
	
	int numero =1;
	while (numero<=10) {
		numero++;
		System.out.println(numero);
	}
	
	//DO WHILE
	
	numero =11;
	do {
		numero--;
		System.out.println(numero);
	}
	
	while (numero>0);
	
	}

}