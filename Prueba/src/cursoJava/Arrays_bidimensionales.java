package cursoJava;

public class Arrays_bidimensionales {

	public static void main(String[] args) {

		int [][] matrix= {
				{10,15,18,19,21},
				{ 1,89,87,39,35},
				{11,51,18,29,22},
				{12,40,81,91,12},
		};
	
/**		for (int i=0;i<4;i++) {
			System.out.println();
			for (int j=0;j<5;j++) {
				System.out.print(matrix[i][j]+" ");
			}	}	**/
		
		for (int[]filas:matrix) {
			System.out.println();
			
			for(int z:filas) {
				System.out.print(z+" ");
			}			
		}
	}
}