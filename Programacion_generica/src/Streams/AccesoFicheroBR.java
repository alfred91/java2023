package Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheroBR {


	public static void main(String[] args) {

		LeerFichero accediendo=new LeerFichero();
		
		accediendo.lee();		
		
	}

	static class LeerFichero{
		
		
		public void lee(){

			try {
				
				FileReader entrada = new FileReader
			("C:\\Users\\Apache\\eclipse-workspace\\Programacion_generica\\src\\Streams\\ejemploBR.txt");
				
				BufferedReader mibuffer= new BufferedReader(entrada);
				
				String linea ="";
				
					while(linea!=null) {
					
						linea=mibuffer.readLine();
										
						if (linea!=null)//QUITAR LA PALABRA NULL DEL FINAL
						System.out.println(linea);
										
					} entrada.close();
				
			} catch (IOException e) {
				
				// ESTO IMPRIME EL ESTADO DE LA PILA: e.printStackTrace();
				
				System.out.println("No se ha encontrado el archivo");
		
			}
		}
		
	}
}