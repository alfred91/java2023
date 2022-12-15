package arraysYmatrices;

public class Ejercicio19 {
	
	public static void pintarMatriz(int[][] matriz) {
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			
			int[][] matriz = new int[4][5];
			int[] sumaFilas = new int[matriz.length];
			int[] sumaColumnas = new int[matriz[0].length];
			
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
			}
			
			pintarMatriz(matriz);
			System.out.println("");
			
			//Suma filas
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					sumaFilas[i] = sumaFilas[i] + matriz[i][j];
				}
			}
			
			//Suma columnas
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					sumaColumnas[j] = sumaColumnas[j] + matriz[i][j];
				}
			}
			
			//PINTAR
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + "  ");
				}
				System.out.println(" Suma: " + sumaFilas[i]);
			}
			int total = 0;
			for(int i = 0; i < sumaColumnas.length; i++) {
				System.out.print( sumaColumnas[i] + " ");
				total = total + sumaColumnas[i];
			}
			System.out.println(" Total: " + total);
		}

	}