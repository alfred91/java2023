package Tema3;

public class EjemploArrays3 {
	
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
	
	public static void main(String[] args) {
		//CREAR UN ARRAY DE 15 ELEMENTOS CON VALORES ALEATORIOS ENTRE 1 Y 100
		//SUMA LOS IMPARES
		int numeros[] = new int[15];
		
		for(int i=0;i<=numeros.length;i++) {
			numeros[i]=(int) (Math.random()*100)+1;
			
			
		}
		int total=0;
		for (int i=0;i<numeros.length;i++) {
			if(numeros[i]%2!=0) {
				total+=numeros[i];
			}
		}
	}

}
