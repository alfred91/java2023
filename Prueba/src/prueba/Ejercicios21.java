package prueba;

public class Ejercicios21 {
 
	public static void main(String[] args) {
			
	for (int numero=10;numero<=1000;numero+=10) {
		System.out.println(numero+" ");
		
	}
		// int numero = 0;
		// while (numero<10000) {
		// System.out.printl(numero);
		// numero = numero + 10;
		// }
	//IMPARES
	
	for (numero=1;numero<=1000; numero +=2) {
		System.out.println(numero);
	}
	//MUESTRA LOS NUMEROS ENTRE -1 Y 1
	
	for(double numero=1;numero<1;numero+= 0.01) {
		System.out.println(numero);
	}
	// GENERA UN NUM ALEATORIO ENTRE 1 Y 100 MUESTRA TODOS LOS NUMEROS ENTRE UNO Y 100 MENOS ESE ALEATORIO
	
	int numero =(int) ((Mat.random()*100)+1);
	System.out.println(numero);
	for(int i=1; i<=100, i++) {
		if (i==numero) {
			continue;
		}
	}
	}
	}