package practica5;

public class Ejercicio12 {
	
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+",");
		}
	}
	
	public static void numAleatorios(int vector[], int min, int max) {
		for (int i = 0; i < vector.length; i++) {
			int num = (int)(Math.random() * (max - min + 1) + min);
		    while (comprobarNum(vector,num)) {
		    	num = (int)(Math.random() * (max - min + 1) + min);
		    }
		    vector[i] = num;
		}
	}
	
	public static boolean comprobarNum(int vector[], int num) {
		for (int i = 0; i < vector.length; i++) {
		    if(vector[i] == num) {
		    	return true;
		    }
		}
		return false;
	}
	
	public static void ordenarVectorInsercion(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			int aux = vector[i];
			while ((i > 0) && (vector[i - 1] > aux)) {
				vector[i] = vector[i - 1];
				i--;
			}
			vector[i] = aux;
		}
	}

	public static void main(String[] args) {

		int vector[] = new int[100];
		
		System.out.print("Vector: ");
		numAleatorios(vector, 1, 1000);
		ordenarVectorInsercion(vector);
		pintarVector(vector);
		System.out.println("");
		System.out.print("Los 10 mayores: ");
		for (int i = vector.length - 1; i >= 90; i--) {
			System.out.print(vector[i]+", ");
		}		
	}
}