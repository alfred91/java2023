package Tema3;

public class EjemploMatrices {
	public static void pintarMatrizEnteros(int matriz[][]) {
		System.out.println("[");
		for(int i=0; i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				System.out.println(matriz[i]);
				if (j!= matriz[i].length-1)
					System.out.println(", ");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		
	int matriz[][]= new int[5][10];
	
	for (int i=0; i <=matriz.length; i++) {
		
		for (int j=0; j <matriz[0].length; j++) {
			matriz[i][j]=(int)(Math.random()*10)+1;
		}
	}
	pintarMatrizEnteros(matriz);
	int tota=0;
	for(int i=0;i<matriz.length;i++) {
		total=0;
		for(int j=0; j<matriz[0].length;i++) {
	}
	}

}