package Ejercicio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

		//Este método calcula el tamaño total de un directorio y todos sus archivos de forma recursiva.
	
    public static long calculateDirectorySize(String directoryPath) throws IOException {
        Path directory = Paths.get("/");
        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        Files.walkFileTree(directory, visitor);
        return visitor.getTotalSize();
    }

    // Este busca un archivo por su nombre en todas las subcarpetas de un directorio. 
    
    public static void searchFileInSubdirectories(String directoryPath, String fileName) throws IOException {
        Path directory = Paths.get(directoryPath);
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.getFileName().toString().contains(fileName)) {
                    System.out.println(file);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    // Este elimina un archivo por su nombre en un directorio y subdirectorios.
    
    public static void deleteFileInDirectory(String directoryPath, String fileName) throws IOException {
        Path directory = Paths.get(directoryPath);
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.getFileName().toString().equals(fileName)) {
                    Files.deleteIfExists(file);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    public static List<Path> getRegularFilesInDirectory(String directoryPath) throws IOException {
        Path directory = Paths.get(directoryPath);
        List<Path> regularFiles = new ArrayList<>();
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (Files.isRegularFile(file)) {
                    regularFiles.add(file);
                }
                return FileVisitResult.CONTINUE;
            }
        });
        return regularFiles;
    }
    	
    // Devuelve una lista de rutas de archivos regulares dentro de un directorio y subdirectorio.
    
    private static class SizeCalculatorVisitor extends SimpleFileVisitor<Path> {
        private long totalSize;

        public long getTotalSize() {
            return totalSize;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            totalSize += Files.size(file);
            return FileVisitResult.CONTINUE;
        }
    }
}
