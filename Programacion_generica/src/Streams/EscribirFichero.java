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
			
			String frase=" Esto es una prueba de escritura 2";
			
			try {
				
				FileWriter escritura = new FileWriter	//EL TRUE AGREGA LA LINEA AL FICHERO. SI LO QUITAS SOBREESCRIBES EL FICHERO
						("C:\\Users\\Apache\\eclipse-workspace\\Programacion_generica\\src\\Streams\\ejemploEscritura.txt",true);
					
					for(int i=0;i<frase.length();i++) {
						escritura.write(frase.charAt(i));
					}
						escritura.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}
	}