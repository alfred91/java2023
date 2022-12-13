package arraysYmatrices;

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
	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
		
		//Pintar
		pintarMatriz(matriz);
		
		System.out.println("------------------");
		
		ordenarPorColumnas(matriz);
		
		pintarMatriz(matriz);		
	}
}