package arraysYmatrices;

public class Ejercicio12 {
	
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//Matriz marco 8x6. Los bordes 1, el resto 0
		//11111
		//10001
		//10001
		//11111
		
		int[][] marco = new int[8][6];
		
		for(int i=0; i < marco.length; i++) {
			for(int j=0; j < marco[i].length; j++) {
				
				marco[i][j] = 0;
				
				//Fila arriba
				if (i == 0) {
					marco[i][j] = 1;
				}
				
				//Fila abajo
				if (i == marco.length - 1) {
					marco[i][j] = 1;
				}
				
				//Columna izquierda
				if (j == 0) {
					marco[i][j] = 1;
				}
				
				//Columna derecha
				if (j == marco[i].length - 1) {
					marco[i][j] = 1;
				}
				
				/**
				 * Versión optimizada
				 * 
				 *  if ( (i==0) || (i == marco.length - 1) || (j == 0) ||  (j == marco[i].length - 1)) {
						marco[i][j] = 1;
					} else {
						marco[i][j] = 0;
					}
				 */
			}
		}
		
		pintarMatriz(marco);

	}

}