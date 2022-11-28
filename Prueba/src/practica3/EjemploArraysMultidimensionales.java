package practica3;

public class EjemploArraysMultidimensionales {

	public static void main(String[] args) {
		
		double notas[][]= new double[10][5];

		double notas2[][]= {{5,7,6,8,9}, {3,7,1,2,9}, {5,7,6,8,9}, {3,7,1,2,9}, {5,7,6,8,9}, {3,7,1,2,9}, {5,7,6,8,9}, {3,7,1,2,9},
				{5,7,6,8,9}, {3,7,1,2,9}};
		
		for(int i=0; i<notas2.length;i++) {
			for (int j=0; j<notas2[0].length;j++) {
				System.out.println(notas2[i][j]+" ");
			}
			System.out.println();
		}
		}

}
