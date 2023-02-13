package primeraevaluacion;

import java.util.Iterator;

public class RecuperacionEj3 {


	public static  void pintarTablero(char[][] tablero1) {
			
		for(int x=0;x<tablero1.length;x++) {
			for(int y=0;y<tablero1[x].length;y++) {
				System.out.print(tablero1[x][y]+" ");
			}
			System.out.println();
		}
	}
		
	
	public static void colocarBarco(int x,int y,String direccion,int longitudBarco,char letra,char[][] tablero) {
		
		if (direccion == "derecha") {
			for(int i=0;i<longitudBarco;i++) {
				tablero[x][y+i]=letra;
			}
		}
		
		if (direccion == "izquierda") {
			for(int i=0; i<longitudBarco;i++) {
				tablero[x][y-i]=letra;
			}
		}

		if (direccion == "arriba") {
			for(int i=0;i<longitudBarco;i++) {
				tablero[x-i][y]=letra;
			}
		}
		
		if (direccion == "abajo") {
			for(int i=0;i<longitudBarco;i++) {
				tablero[x+i][y]=letra;
			}
		}

		
	}
		
	
	public static boolean comprobarBarco(int x,int y, String direccion,int longitudBarco,char [][] tablero) {
		return false;
		
		
	}
	
	
	public static void disparar(int x, int y,char[][] tablero) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tablero[][] = new char [10][10];
		
		
		for(int x=0;x <tablero.length; x++) {
			for(int y=0; y<tablero[x].length;y++) {
				tablero[x][y] ='a';
			}
		}
		
		//pintarTablero(tablero);
		
		colocarBarco(1,1,"abajo", 3,'l',tablero);
		pintarTablero(tablero);
		
		
	}

}