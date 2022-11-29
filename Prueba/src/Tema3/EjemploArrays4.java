package Tema3;

public class EjemploArrays4 {

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		for(int i=2; i<numero;i++) {
		if (numero% i==0) {
			primo=false;
			break;
		}
		return primo;
		}
		
		public static void pintarVectorInt(int vector[]) {
			
			System.out.print("[");
			for(int i=0; i<vector.length; i++) {
				if(i == vector.length-1)
					System.out.print(vector[i] + "");
				else
					System.out.print(vector[i] + ", ");
			}
				System.out.println("]");
		}

}
public static void main(String[]args) {
	
	int numeros[]=new int[100];

	for (int i=0; i<numeros.length;i++) {
		numeros[i]=(int)(Math.random()*50)+1;
		
		pintarVectorInt(numeros);
		
		int total=0;
		for(int i=0; i<numeros.length;i++) {
			if(esPrimo(numeros[i])) {
				total +=numeros[i];
				System.out.println("Este número es primo"+numeros[i]); 
			}
		}
		
	}
	
		}
}