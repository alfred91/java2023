package practica5;

import java.util.Arrays;

public class Ejercicio10 {

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
	
	public static void insercion(int vector[]) {
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

		int v1[] = new int[5];
		int v2[] = new int[5];
        int lv1 = v1.length;
        int lv2 = v2.length;
        int v3[] = new int[lv1 + lv2];

			System.out.print("Vector 1: ");
			numAle(v1, 10, 99);
			pintarVector(v1);
			System.out.println("");
			
			System.out.print("Vector 2: ");
			numAle(v2, 10, 99);
			pintarVector(v2);
			System.out.println("");
			
			System.out.print("Vector 3: ");
	        System.arraycopy(v1, 0, v3, 0, lv1);  
	        System.arraycopy(v2, 0, v3, lv1, lv2);
	        insercion(v3);
			System.out.println(Arrays.toString(v3));
	}
}