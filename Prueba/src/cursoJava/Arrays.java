package cursoJava;

public class Arrays {

	public static void main(String[] args) {
		
			/*	int mi_matriz[]=new int[5];
				
				mi_matriz[0]=5;
				mi_matriz[1]=6;
				mi_matriz[2]=7;
				mi_matriz[3]=8;
				mi_matriz[4]=9;*/
		
		int [] mi_matriz= {5,6,7,8,9,10,11,12,13};

		for (int i=0; i<mi_matriz.length; i++) {
			System.out.println(i+1+" Valor del indice "+i+" = "+mi_matriz[i]);
		}
	}

}