package arraysYmatrices;

import java.util.Arrays;

public class Ejercicio17 {

	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void ordenarPorColumnas(int matriz[][]) {
		for(int j=0; j<matriz[0].length; j++) {
			for(int i=0; i<matriz.length; i++) {
				
				//Ordenar
				for(int h=0; h<matriz.length-1; h++) {
					if (matriz[h][j] > matriz[h+1][j]) {
						int aux = matriz[h][j];
						matriz[h][j] = matriz[h+1][j];
						matriz[h+1][j] = aux;
					}
				}
			}
		}
	}
	public static void ordenarPorFilas(int matriz[][]) {
	
		
				for(int i=0; i<matriz.length; i++) {
					Arrays.sort(matriz[i]);}
				
				//Pintar
				pintarMatriz(matriz);
			
					}
				
			
	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 500 + 1);
			}
		}
		//Pintar
		pintarMatriz(matriz);
		
		System.out.println("-------COLUMNAS-----------");
		
		ordenarPorColumnas(matriz);
		
		pintarMatriz(matriz);		
		
		System.out.println("-------FILAS-----------");
		
		ordenarPorFilas(matriz);
		
	}
}