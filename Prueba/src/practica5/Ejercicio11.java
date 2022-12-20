package practica5;

public class Ejercicio11 {
	
	public static void pintarVector(int vector[]) {
		System.out.print("[");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+",");
		}
		System.out.print("]");
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


	public static int mayorVector(int vector[]) {
		int mayorVector = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > mayorVector) {
				mayorVector = vector[i];
			}
		}
		return mayorVector;
	}

	public static int menorVector(int vector[]) {
		int menorVector = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < menorVector) {
				menorVector = vector[i];
			}
		}
		return menorVector;
	}
	
	public static double mediaVector(int vector[]) {
		double mediaVector = 0, sumaVector = 0;
		int contVector = 0;
		for (int i = 0; i < vector.length; i++) {
			sumaVector = sumaVector + vector[i];
			contVector++;
		}
		mediaVector = (sumaVector / contVector);
		return mediaVector;
	}

	public static void main(String[] args) {

		int vector[] = new int[50];
		
		System.out.print("Vector -> ");
		numAleatorios(vector, 1, 50);
		ordenarVectorInsercion(vector);
		pintarVector(vector);
		System.out.print("\n> El mayor número es: "+mayorVector(vector));
		System.out.print("\n> El mayor número es: "+menorVector(vector));
		System.out.print("\n> La media es: "+mediaVector(vector));
		
	}
}