package primeraevaluacion;

import java.util.Scanner;

public class Laberinto {
	
	/**
	 * Pinta el tablero del laberinto
	 * @param tablero
	 */
	public static void pintar(char[][] tablero) {
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero[0].length; j++) {
				System.out.print(tablero[i][j] + " " );
			}
			System.out.println();
		}
	}
	
	/**
	 * Generar salida del tablero de forma aleatoria
	 * @param args
	 */
	public static int[] generarSalida(char[][] tablero) {
		int[] salida = new int[2];
		int aleatorio = 0;
		int posicion = 0;
		
		//Generar aleatorio entre 1 y 4
		//1 - arriba
		//2 - abajo
		//3 - derecha
		//4 - izquierda
		
		aleatorio = (int) (Math.random() * 4) + 1;
		posicion = (int) (Math.random() * 19);
		
		switch (aleatorio) {
		case 1:
			salida[0] = 0;
			salida[1] = posicion;
			break;
		case 2:
			salida[0] = 19;
			salida[1] = posicion;
			break;
		case 3:
			salida[0] = posicion;
			salida[1] = 19;
			break;
		case 4:
			salida[0] = posicion;
			salida[1] = 0;
			break;
		}
		
		return salida;
	}

	public static void main(String[] args) {

		char[][] laberinto = new char[20][20];
		
		//Rellenar con .
		for(int i=0; i<laberinto.length; i++) {
			for(int j=0; j<laberinto[0].length; j++) {
				laberinto[i][j] = '.';
			}
		}
		
		//Rellenar la parte superior e inferior con -
		for(int i=0; i<laberinto.length; i++) {
			laberinto[0][i] = '-';
			laberinto[19][i] = '-';
		}
		
		//Rellenar derecha e izquierda con |
		for(int i=0; i<laberinto.length; i++) {
			laberinto[i][0] = '|';
			laberinto[i][19] = '|';
		}

		//Colocar inicio
		laberinto[0][0] = '@';
		
		//Colocar bomba
		int bombaX = (int) (Math.random() * 18) + 1;
		int bombaY = (int) (Math.random() * 18) + 1;
		//laberinto[bombaX][bombaY] = 'X';
		
		//Generar la salida
		int[] salida = generarSalida(laberinto);
		
		//Colocar salida
		laberinto[salida[0]][salida[1]] = '#';
		
		//Pintar tablero
		pintar(laberinto);
		
		
		//Moverser por el tablero
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int movimientos = 0;
		int jugadorX = 0;
		int jugadorY = 0;
		char aux = 'I';
		
		do {
			System.out.println("Introduce opción");
			System.out.println("1. Derecha");
			System.out.println("2. Izquierda");
			System.out.println("3. Abajo");
			System.out.println("4. Arriba");
			
			laberinto[jugadorX][jugadorY] = aux;
			
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
				case 1:
					jugadorY++;
					break;
				case 2:
					jugadorY--;
					break;
				case 3:
					jugadorX++;
					break;
				case 4:
					jugadorX--;
					break;
			}
			
			movimientos++;
			
			try {
				if (laberinto[jugadorX][jugadorY] == '#') {
					System.out.println("Has ganado. Lo has hecho en " + movimientos + " movimientos.");
					break;
				} else if (jugadorX == bombaX && jugadorY == bombaY) {
					System.out.println("Booom. Explotaste y perdiste");
					break;
				} else {
					aux = laberinto[jugadorX][jugadorY];
					laberinto[jugadorX][jugadorY] = '@';
				}				
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Has perdido, te has salido del tablero");
				break;
			}
			
			//Pintar tablero
			pintar(laberinto);
			
		} while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);
		
		
	}

}