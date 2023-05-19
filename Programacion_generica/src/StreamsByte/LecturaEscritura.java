package StreamsByte;

import java.io.*;

public class LecturaEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		
		int datosEntrada[]=new int[28293];
		
		try {	
		
		FileInputStream archivoLectura = new FileInputStream
			("C:\\Users\\Apache\\eclipse-workspace\\Programacion_generica\\src\\StreamsByte\\img.jpg");
		
			boolean archivoFinal=false;
			
			while (!archivoFinal) {
				
				int byteEntrada=archivoLectura.read();
				
				if(byteEntrada!=-1)
					
					datosEntrada[contador]=byteEntrada;
				
				else
				archivoFinal=true;
				
				System.out.println(datosEntrada[contador]);
				
				contador++;
			}
		archivoLectura.close();
		
	} catch (IOException e) {
		
		System.out.println("Error al acceder a la imagen");
	}
		
		System.out.println(contador);
		
		crearFichero(datosEntrada);
		
	}
	
	
	static void crearFichero(int datosNuevoFichero[]) {
		
		try {
				
			FileOutputStream ficheroNuevo= new FileOutputStream					
				("C:\\Users\\Apache\\eclipse-workspace\\Programacion_generica\\src\\StreamsByte\\imgCopia.jpg");
			
			for (int i=0;i<datosNuevoFichero.length;i++) {
				
				ficheroNuevo.write(datosNuevoFichero[i]);
			}
		
			ficheroNuevo.close();	
			
		} catch(IOException e) {
			System.out.println("Error al crear el archivo");
		}
	}
	
}