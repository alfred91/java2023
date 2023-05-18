package Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class LeerFichero{
		
		
		public void lee(){

			try {
				
				FileReader entrada= new FileReader("ejemplo.txt");
				
				int c= entrada.read();
				
				while(c!=-1) {
					c=entrada.read();
					
					System.out.println(c);
				}
				
			} catch (IOException e) {
				
				// ESTO IMPRIME EL ESTADO DE LA PILA e.printStackTrace();
				
				System.out.println("No se ha encontrado el archivo");
			}
		}
		
	}
}