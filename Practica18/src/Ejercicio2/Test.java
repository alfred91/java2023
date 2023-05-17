package Ejercicio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test {
	
    public static void main(String[] args) {
    	
        try {
        	
            String directoryPath = "C:\\Users\\usario1daw\\test";
            long directorySize = FileUtils.calculateDirectorySize(directoryPath);
            System.out.println("El tamanio total del directorio es : " + directorySize + " bytes");

            String searchDirectoryPath = "C:\\Users\\usario1daw\\test";
            String fileNameToSearch = "Hola.txt Hola2.txt";
            System.out.println("Archivos Encontrados : "+fileNameToSearch+" ");
            FileUtils.searchFileInSubdirectories(searchDirectoryPath, fileNameToSearch);

            String deleteDirectoryPath = "C:\\Users\\usario1daw\\test";
            String fileNameToDelete = "Borrar.txt";
            FileUtils.deleteFileInDirectory(deleteDirectoryPath, fileNameToDelete);
            System.out.println("Archivos eliminados con Exito");

            String regularFilesDirectoryPath = "C:\\Users\\usario1daw\\test";
            List<Path> regularFiles = FileUtils.getRegularFilesInDirectory(regularFilesDirectoryPath);
            System.out.println("Archivos regulares encontrados : ");
            for (Path file : regularFiles) {
                System.out.println(file);
            }
        } catch (IOException e) {
            System.err.println("Error al realizar las operaciones de archivo: " + e.getMessage());
        }
    }
}