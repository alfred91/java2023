package practica5;

public class Ejercicio8 {
	
	public static void pintarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+",");
		}
	}
	
	public static void numAle(int vector[], int min, int max) {
		for (int i = 0; i < vector.length; i++) {
			int num = (int)(Math.random() * (max - min + 1) + min);
		    while (chkNum(vector,num)) {
		    	num = (int)(Math.random() * (max - min + 1) + min);
		    }
		    vector[i] = num;
		}
	}
	
	public static boolean chkNum(int vector[], int num) {
		for (int i = 0; i < vector.length; i++) {
		    if(vector[i] == num) {
		    	return true;
		    }
		}
		return false;
	}

	public static void burbuja(int vector[]) {
		int aux;
		for (int i = 0; i < vector.length - 1; i++) {
			for(int j = 0; j < vector.length - 1; j++) {
				if (vector[j] > vector[j+1]) {
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int vector[] = new int[50];
		
		System.out.print("Original ");
		numAle(vector, 1, 100);
		pintarVector(vector);
		System.out.println("");
		System.out.print("Ordenado ");
		burbuja(vector);
		pintarVector(vector);		
	}
}