package arraysYmatrices;

import java.util.Arrays;

public class Ejercicio23 {

	/**
	 * Devuelve la matriz traspuesta de una matriz original
	 * @param matrizOriginal
	 * @return
	 */
	public static int[][] traspuesta(int[][] matrizOriginal) {
		
		int longitudX = matrizOriginal.length; //Filas
		int longitudY = matrizOriginal[0].length; //Columnas
		
		int[][] trasp = new int[longitudY][longitudX];
		
		for(int i=0; i < matrizOriginal.length; i++) {
			for(int j=0; j < matrizOriginal[i].length; j++) {
				trasp[j][i] = matrizOriginal[i][j];
			}
		}
		
		return trasp;
	}
	
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
		
		pintarMatriz(matriz);
		
		System.out.println("------------------");
		
		//Ordenar por filas
		for(int i=0; i<matriz.length; i++) {
			Arrays.sort(matriz[i]);
		}
		
		pintarMatriz(matriz);
		
		System.out.println("------------------");

		int[][] trasp = traspuesta(matriz);
		
		for(int i=0; i<trasp.length; i++) {
			Arrays.sort(trasp[i]);
		}
		matriz = traspuesta(trasp);
		
		pintarMatriz(matriz);
	}
}