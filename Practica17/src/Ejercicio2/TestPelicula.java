package Ejercicio2;

import java.util.*;

public class TestPelicula {
    public static void main(String[] args) {
	
	Pelicula pulpFiction = new Pelicula(1, "Pulp Fiction", 1994);
	Pelicula reservoirDogs = new Pelicula(2, "Reservoir Dogs", 1992);
	Pelicula gladiator = new Pelicula(3, "Gladiator", 2000);
	Pelicula dragonfly = new Pelicula(4, "DragonFly", 1982);
	Pelicula alien = new Pelicula(5, "Alien", 1979);
	Pelicula apocalypseNow = new Pelicula(6, "Apocalypse Now", 1979);
	Pelicula elPadrino = new Pelicula(7, "El Padrino", 1972);
	Pelicula tenet = new Pelicula(8, "Tenet", 2020);
	Pelicula origen = new Pelicula(9, "Origen", 2010);
	Pelicula casino = new Pelicula(10, "Casino", 1995);
	Pelicula goodfellas = new Pelicula(11, "Goodfellas", 1990);
	Pelicula elLoboDeWallStreet = new Pelicula(12, "El Lobo de Wall Street", 2013);

	Director ridleyScott = new Director(1, "Ridley Scott");
	Director francisFordCoppola = new Director(2, "Francis Ford Coppola");
	Director christopherNolan = new Director(3, "Christopher Nolan");
	Director martinScorsese = new Director(4, "Martin Scorsese");
	Director quentinTarantino = new Director(5, "Quentin Tarantino");
	
	Genero drama = new Genero("Drama");
	Genero comedia = new Genero("Comedia");
	Genero accion = new Genero("Accion");
	Genero terror =new Genero("Terror");
	Genero scifi = new Genero("Ciencia Ficcion");
	Genero animacion = new Genero("Animacion");
	
	
	alien.addGenero(terror);
	apocalypseNow.addGenero(accion);
	dragonfly.addGenero(drama);
	casino.addGenero(accion);
	elLoboDeWallStreet.addGenero(drama);
	elPadrino.addGenero(drama);
	gladiator.addGenero(accion);
	goodfellas.addGenero(comedia);
	origen.addGenero(scifi);
	pulpFiction.addGenero(drama);
	reservoirDogs.addGenero(drama);
	tenet.addGenero(animacion);
	
	gladiator.addDirector(ridleyScott);

    

    
    List<Pelicula> peliculas = new ArrayList<>();
    peliculas.add(pulpFiction);
    peliculas.add(reservoirDogs);
    peliculas.add(gladiator);
    peliculas.add(dragonfly);
    peliculas.add(alien);
    peliculas.add(apocalypseNow);
    peliculas.add(elPadrino);
    peliculas.add(tenet);
    peliculas.add(origen);
    peliculas.add(casino);
    peliculas.add(goodfellas);
    peliculas.add(elLoboDeWallStreet);
    
    for (Pelicula pelicula : peliculas) {
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Anio: " + pelicula.getAnio());
        System.out.println("Director: " + pelicula.getDirectores());
        System.out.print("Genero: ");
        for (Genero genero : pelicula.getGeneros()) {
            System.out.print(genero.getNombre() + " ");
        }
        System.out.println("\n");
    }
    
    for (Pelicula pelicula : peliculas) {
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Anio: " + pelicula.getAnio());
        System.out.print("Director/es: ");
        for (Director director : pelicula.getDirectores()) {
            System.out.print(director.getNombre() + " ");
        }
        System.out.print("\nGenero: ");
        for (Genero genero : pelicula.getGeneros()) {
            System.out.print(genero.getNombre() + " ");
        }
        System.out.println("\n");
    }

    }
}