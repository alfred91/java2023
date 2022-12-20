package practica5;

import java.util.Arrays;

public class Ejercicio10 {
	

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
	
	public static void main(String[] args) {

		int vector1[] = new int[5];
		int vector2[] = new int[5];
        int lenVector1 = vector1.length;
        int lenVector2 = vector2.length;
        int vector3[] = new int[lenVector1 + lenVector2];

		System.out.print("Vector 1-> ");
		numAleatorios(vector1, 10, 99);
		pintarVector(vector1);
		System.out.print("\nVector 2-> ");
		numAleatorios(vector2, 10, 99);
		pintarVector(vector2);
		System.out.print("\nVector 3-> ");
        System.arraycopy(vector1, 0, vector3, 0, lenVector1);  
        System.arraycopy(vector2, 0, vector3, lenVector1, lenVector2);
        ordenarVectorInsercion(vector3);
		System.out.println(Arrays.toString(vector3));
	}
}