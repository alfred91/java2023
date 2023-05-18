package Streams;

import java.io.*;

public class EscribirFichero {

	public static void main(String[] args) {

		Escribiendo accede = new Escribiendo();
		
		accede.escribir();
		
	}

}

	class Escribiendo{
		
		public void escribir() {
			
			String frase="Esto es una prueba de escritura";
			
			try {
				
				FileWriter escritura = new FileWriter					
						("C:\\Users\\Apache\\eclipse-workspace\\Programacion_generica\\src\\Streams\\ejemploEscritura.txt");
					
					for(int i=0;i<frase.length();i++) {
						escritura.write(frase.charAt(i));
					}
						escritura.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}
	}
