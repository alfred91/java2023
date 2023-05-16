package Ejercicio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test {
	
    public static void main(String[] args) {
    	
        try {
        	
            String directoryPath = "ruta_del_directorio";
            long directorySize = FileUtils.calculateDirectorySize(directoryPath);
            System.out.println("El tamaño total del directorio es: " + directorySize + " bytes");

            String searchDirectoryPath = "ruta_del_directorio";
            String fileNameToSearch = "nombre_del_archivo";
            System.out.println("Archivos encontrados:");
            FileUtils.searchFileInSubdirectories(searchDirectoryPath, fileNameToSearch);

            String deleteDirectoryPath = "ruta_del_directorio";
            String fileNameToDelete = "nombre_del_archivo";
            FileUtils.deleteFileInDirectory(deleteDirectoryPath, fileNameToDelete);
            System.out.println("Archivos eliminados con éxito");

            String regularFilesDirectoryPath = "ruta_del_directorio";
            List<Path> regularFiles = FileUtils.getRegularFilesInDirectory(regularFilesDirectoryPath);
            System.out.println("Archivos regulares encontrados:");
            for (Path file : regularFiles) {
                System.out.println(file);
            }
        } catch (IOException e) {
            System.err.println("Error al realizar las operaciones de archivo: " + e.getMessage());
        }
    }
}
