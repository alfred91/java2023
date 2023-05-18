package Streams;

import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LeerFichero accediendo=new LeerFichero();
		
		accediendo.lee();		
		
	}

	static class LeerFichero{
		
		
		public void lee(){

			try {
				
				FileReader entrada = new FileReader
					("C:\\Users\\Apache\\eclipse-workspace\\Programacion_generica\\src\\Streams\\ejemplo.txt");
				
				int c = 0;
				
					while(c!=-1) {
					
						c=entrada.read();
					
						char letra=(char)c;
					
						System.out.print(letra);
										
					} entrada.close();
				
			} catch (IOException e) {
				
				// ESTO IMPRIME EL ESTADO DE LA PILA e.printStackTrace();
				
				System.out.println("No se ha encontrado el archivo");
			}
		}
		
	}
}