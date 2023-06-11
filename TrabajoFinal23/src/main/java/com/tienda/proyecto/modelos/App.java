package com.tienda.proyecto.modelos;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
		Tienda catalogo= new Tienda();
		
		abrirCSV();
	
		switch (opc) {

			System.out.println("--- MENU ---");
				case 1: System.out.println("1: Mostrar productos cuyo precio supera los 3000 eur");
					break;
				
				case 2: System.out.println("2: Mostrar categorias con el num de productos que hay en cada una");
					break;
				
				case 3 :System.out.println("3: Mostrar productos ordenados por precio");
					break;
				
				case 4 : System.out.println("4: Obtener los 3 productos mas baratos");
					break;
					
				case 5: System.out.println("5: Crea y agrega un producto base al catalogo");
					break;
					
				case 6: System.out.println("6: Muestra los productos virtuales que sean de tipo Video o VideoJuego");
					break;
					
				case 7: System.out.println("7: Salir");
				break;
				
				default:
			    break;
			}


		}

		
	
	
	private static void abrirCSV() {
		
	}

}