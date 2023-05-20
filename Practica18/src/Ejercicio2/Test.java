package Ejercicio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test {
	
    public static void main(String[] args) {
    	

    	try {
            String currentDirectory = Paths.get("").toAbsolutePath().toString();

            //CALCULAR TAMANIO DEL DIRECTORIO
            
            long directorySize = FileUtils.calculateDirectorySize(currentDirectory);
            System.out.println("Tamaño total del directorio: " + directorySize + " bytes");

            //LISTAR ARCHIVOS REGULARES
            
            System.out.println("Archivos regulares en el directorio:");
            List<Path> regularFiles = FileUtils.getRegularFilesInDirectory(currentDirectory);
            for (Path file : regularFiles) {
                System.out.println(file);
            }

            //BUSCAR ARCHIVO
            
            String searchFileName = "archivo.txt";
            System.out.println("Búsqueda del archivo '" + searchFileName + "' en subdirectorios:");
            FileUtils.searchFileInSubdirectories(currentDirectory, searchFileName);

            //ELIMINAR
            
            String deleteFileName = "archivo.txt";
            System.out.println("Eliminación del archivo '" + deleteFileName + "' en el directorio y subdirectorios:");
            FileUtils.deleteFileInDirectory(currentDirectory, deleteFileName);

            // AGREGAR
            
            String regularFilesDirectoryPath = "C:\\Users\\Apache\\eclipse-workspace\\Practica18";
            List<Path> additionalRegularFiles = FileUtils.getRegularFilesInDirectory(regularFilesDirectoryPath);
            System.out.println("Archivos regulares encontrados en '" + regularFilesDirectoryPath + "':");
            for (Path file : additionalRegularFiles) {
                System.out.println(file);
            }
        } catch (IOException e) {
            System.out.println("Error al realizar la operacion: " + e.getMessage());
        }
    }
}