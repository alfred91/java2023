package ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;

import ejercicio7.Multimedia.Genero;

public class TestScotify {
    public static void main(String[] args) {
        // Creamos autores
        Autor autor1 = new Autor("C. Tangana", "Madrid, España");
        Autor autor2 = new Autor("Kase.O", "Zaragoza, España");
        Autor autor3 = new Autor("Natos y Waor", "Madrid, España");
        
        // Creamos las canciones de rap español
        Cancion cancion1 = new Cancion("Demasiadas Mujeres", 250, 2020, Genero.RAP);
        Cancion cancion2 = new Cancion("Tonta", 234, 2019, Genero.RAP);
        Cancion cancion3 = new Cancion("Bienvenidos a la jungla", 312, 2016, Genero.RAP);
        Cancion cancion4 = new Cancion("Cicatrices", 228, 2015, Genero.RAP);
        Cancion cancion5 = new Cancion("Catarsis", 243, 2016, Genero.RAP);
        Cancion cancion6 = new Cancion("Mañana Sera Otro Día", 263, 2017, Genero.RAP);
        
        // Creamos los discos
        Disco disco1 = new Disco("El Madrileño", LocalDate.of(2021, 2, 26), autor1, "Sony Music");
        Disco disco2 = new Disco("El Círculo", LocalDate.of(2016, 9, 23), autor2, "BOA Music");
        Disco disco3 = new Disco("Martes 13", LocalDate.of(2017, 9, 29), autor3, "Locoplaya Records");
        
        // Añadimos canciones a los discos
        disco1.addCancion(cancion1);
        disco1.addCancion(cancion2);
        disco2.addCancion(cancion3);
        disco2.addCancion(cancion4);
        disco3.addCancion(cancion5);
        disco3.addCancion(cancion6);
        
        // Creamos una instancia de Scotify
        Scotify scotify = new Scotify();
        
        // Añadimos los discos y canciones a Scotify
        scotify.addMultimedia(disco1);
        scotify.addMultimedia(disco2);
        scotify.addMultimedia(disco3);
        
        // Mostramos todas las canciones de rap español de Scotify
        ArrayList<Cancion> cancionesRapEspañol = scotify.buscarPorGenero(Genero.RAP);
        System.out.println("Canciones de rap español en Scotify:");
        for (Multimedia multimedia : cancionesRapEspañol) {
            System.out.println(multimedia);
        }
    }
}