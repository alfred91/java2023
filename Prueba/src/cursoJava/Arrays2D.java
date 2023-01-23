package cursoJava;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mi_matriz [][]= new int [4][5];
		
		mi_matriz[0][0]=0;
		mi_matriz[0][1]=1;
		mi_matriz[0][2]=2;
		mi_matriz[0][3]=3;
		mi_matriz[0][4]=4;
		
		mi_matriz[1][0]=5;
		mi_matriz[1][1]=6;
		mi_matriz[1][2]=7;
		mi_matriz[1][3]=8;
		mi_matriz[1][4]=9;
		
		mi_matriz[2][0]=10;
		mi_matriz[2][1]=11;
		mi_matriz[2][2]=12;
		mi_matriz[2][3]=13;
		mi_matriz[2][4]=14;

		mi_matriz[3][0]=15;
		mi_matriz[3][1]=16;
		mi_matriz[3][2]=17;
		mi_matriz[3][3]=18;
		mi_matriz[3][4]=19;
		
		for (int i=0;i<4;i++) {
			
			System.out.println();		
			
			for (int j=0;j<5;j++) {
				
				System.out.print(mi_matriz[i][j]+" ");
			}
		}
		
	}

}