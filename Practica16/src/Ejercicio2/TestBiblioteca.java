package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class TestBiblioteca {
	
    public static void main(String[] args) {
    	
        ArrayList<Autor> autores = new ArrayList<Autor>();
        
        Autor autor1 = new Autor("Juan", "Pérez", 30, "Calle Mayor 1", "juan.perez@gmail.com", "Madrid");
        Autor autor2 = new Autor("María", "García", 35, "Plaza Catalunya 1", "maria.garcia@gmail.com", "Barcelona");
        Autor autor3 = new Autor("Pedro", "López", 40, "Avenida del Puerto 1", "pedro.lopez@gmail.com", "Valencia");
        Autor autor4 = new Autor("Ana", "Martínez", 25, "Calle San Pablo 1", "ana.martinez@gmail.com", "Sevilla");
        Autor autor5 = new Autor("Carlos", "Sánchez", 28, "Gran Vía 1", "carlos.sanchez@gmail.com", "Bilbao");
        
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        autores.add(autor4);
        autores.add(autor5);
        
        System.out.println("Lista de autores:");
        for (Autor autor : autores) {
            System.out.println(autor.toString());
        }
        ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();


     Collections.sort(listaPublicaciones);



    }
}