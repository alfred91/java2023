package ejercicio5;

import java.util.Scanner;

public class TestBiblioteca {
    public static void main(String[] args) {
    	
        Biblioteca biblioteca = new Biblioteca(01, "Garrucha");
        
        Libro libro1 = new Libro("1234567890", "El Quijote", 1605, 863);
        Libro libro2 = new Libro("0987654321", "Cien años de soledad", 1967, 417);
        Libro libro3 = new Libro("1111111111", "La casa de los espíritus", 1982, 368);
        Libro libro4 = new Libro("2222222222", "El amor en los tiempos del cólera", 1985, 368);
        Libro libro5 = new Libro("3333333333", "La insoportable levedad del ser", 1984, 352);

        Revista revista1 = new Revista("001", 120, 2022, "National Geographic", 1);
        Revista revista2 = new Revista("002", 80, 2022, "Hola", 1);
        Revista revista3 = new Revista("0003", 64, 2022, "Super POP", 1);
    
        libro1.addAutor("Miguel", "de Cervantes");
        libro2.addAutor("Gabriel", "García Márquez");
        libro3.addAutor("Isabel", "Allende");
        libro4.addAutor("Gabriel", "García Márquez");
        libro5.addAutor("Milan", "Kundera");
        
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\n------- Biblioteca -------");
            System.out.println("1. Prestar");
            System.out.println("2. Devolver");
            System.out.println("3. Buscar");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); 
            
            switch(opcion) {
                case 1:
                    System.out.println("\nIngrese el título del material a prestar:");
                    String tituloPrestar = sc.nextLine();
                    biblioteca.prestar(tituloPrestar);
                    break;
                case 2:
                    System.out.println("\nIngrese el título del material a devolver:");
                    String tituloDevolver = sc.nextLine();
                    biblioteca.devolver(tituloDevolver);
                    break;
                case 3:
                    System.out.println("\nIngrese el título o autor a buscar:");
                    String tituloBuscar = sc.nextLine();
                    
                    Publicacion resultadoBusqueda = biblioteca.buscar(tituloBuscar);
                    
                    if(resultadoBusqueda == null) {
                        System.out.println("No se encontró ninguna publicación con ese título o autor.");
                           }
                    
                    break;
                case 4:
                    System.out.println("Saliendo de la biblioteca...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while(opcion != 4);		sc.close();
    }
}