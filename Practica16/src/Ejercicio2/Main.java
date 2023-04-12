package Ejercicio2;

public class Main {
public static void main(String[] args) {
	
	Autor autor1 = new Autor("Gabriel", "García Márquez");
	Autor autor2 = new Autor("Mario", "Vargas Llosa");

    Libro libro1 = new Libro("Cien años de soledad", 1967, 432);
    libro1.addAutor(autor1);

    Libro libro2 = new Libro("La ciudad y los perros", 1963, 471);
    libro2.addAutor(autor2);

    Revista revista1 = new Revista("National Geographic", 2022, 3);
    revista1.addAutor(autor1);
    revista1.addAutor(autor2);

    Biblioteca biblioteca = new Biblioteca();
    
    biblioteca.addPublicacion(libro1);
    biblioteca.addPublicacion(libro2);
    biblioteca.addPublicacion(revista1);

    biblioteca.buscar("Cien años de soledad");
    biblioteca.buscar(autor1);
}
}