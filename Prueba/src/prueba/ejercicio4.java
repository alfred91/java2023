package prueba;
import java.util.Scanner;
public class ejercicio4 {
	public static void pintar(char[][] matriz) {
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
		System.out.print(matriz[i][j] + " ");
					}
		System.out.println();
			}
		}	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int opc=0;
		char  [][] matriz= new char [20][20];

		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {	
				
			matriz[i][j] = '.';

			if (j == matriz[i].length - 1) {
				matriz[i][j] = '|';
			}
				if (j == 0) {
				matriz[i][j] = '|';
			}
				if (i == matriz.length - 1) {
				matriz[i][j] = '-';
			}
				if (i == 0) {
				matriz[i][j] = '-';
			}	else if (j==19) {
				matriz[i][j] = '|';
			}
			matriz[0][19]='|';
			matriz[0][0]='@';
			matriz[19][0]='#';
			}	}	
		
		do {
		pintar(matriz);
	System.out.println("Introduce Opcion:");
	System.out.println("1. Izquierda");
	System.out.println("2. Derecha");
	System.out.println("3. Arriba");
	System.out.println("4. Abajo");
	
			try {
				opc=Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				System.out.println("Escribe un número (1-4)");
			}
			switch(opc){
	
			case 1:
				System.out.println("Te has salido de la zona");
			;break;
			
			case 2:	
				matriz[0][0]='|';
				matriz[0][1]='@';
				pintar(matriz);
			;break;
			
			case 3: 
				System.out.println("Te has salido de la zona");
				pintar(matriz);
			;break;
			
			case 4: 
				matriz[0][0]='|';
				matriz[1][0]='@';
				pintar(matriz);
			;break;
			}} 
		while(opc==1||opc==2||opc==3||opc==4);
	}
}