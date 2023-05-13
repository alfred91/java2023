package Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPelicula {
	
    public static void main(String[] args) {

	//CREAR PELICULAS 
    	
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
	
	//DIRECTORES

	Director ridleyScott = new Director(1, "Ridley Scott");
	Director francisFordCoppola = new Director(2, "Francis Ford Coppola");
	Director christopherNolan = new Director(3, "Christopher Nolan");
	Director martinScorsese = new Director(4, "Martin Scorsese");
	Director quentinTarantino = new Director(5, "Quentin Tarantino");
	
	//GENEROS
	
	Genero drama = new Genero("Drama");
	Genero comedia = new Genero("Comedia");
	Genero accion = new Genero("Accion");
	Genero terror =new Genero("Terror");
	Genero scifi = new Genero("Ciencia Ficcion");
	Genero animacion = new Genero("Animacion");
	
	//ASOCIAR GENEROS A LAS PELICULAS
	
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
	
	//ASOCIAR DIRECTORES A LAS PELICULAS
	
	gladiator.addDirector(ridleyScott);
	pulpFiction.addDirector(quentinTarantino);
	elPadrino.addDirector(francisFordCoppola);
	tenet.addDirector(christopherNolan); 
	origen.addDirector(christopherNolan); 
	casino.addDirector(martinScorsese);
	reservoirDogs.addDirector(quentinTarantino);
	goodfellas.addDirector(martinScorsese);
	elLoboDeWallStreet.addDirector(martinScorsese);
	dragonfly.addDirector(christopherNolan);
	alien.addDirector(ridleyScott);
	apocalypseNow.addDirector(francisFordCoppola);
	
	
	//METER LAS PELICULAS EN EL ARRAYLIST
	
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
	    
	    
	  List<Genero> generos = new ArrayList<>();
		  generos.add(drama);
		  generos.add(scifi);
		  generos.add(terror);
		  generos.add(comedia);
		  generos.add(animacion);
		  
	  
    
    //MOSTRAR LAS PELICULAS 
    
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
    
    
    // EJECUCION DE LOS STREAMS 
    
   System.out.println("Pelis ordenadas por anio:");  
   pelisOrdenadasPorAnio(peliculas);
   		System.out.println();

   	System.out.println("Pelis de ciencia ficcion del 2000");
    scifi2000(peliculas);
    	System.out.println();

    System.out.println("Titulo mas largo:");
    tituloMasLargo(peliculas);
    	System.out.println();

    	System.out.println();
        directoresMayusculas(peliculas);
        	System.out.println();
        	
       System.out.println(); 	
        numPelis(peliculas);
        	System.out.println();
        
        	System.out.println();
        dramaYMafia(peliculas);
        	System.out.println();
        	
        	System.out.println();
        filmografias(peliculas);
    		System.out.println();
    }
    // Método para mostrar todas las películas ordenadas por año
    public static void pelisOrdenadasPorAnio(List<Pelicula> peliculas) {
        peliculas.stream()
                .sorted(Comparator.comparing(Pelicula::getAnio))
                .forEach(System.out::println);
    }
        
        
     // Método para mostrar las películas de ciencia ficción posteriores al año 2000
        public static void scifi2000(List<Pelicula> peliculas) {
            peliculas.stream()
                    .filter(p -> p.getGeneros().contains("Ciencia") && p.getAnio() >= 2000)
                    .forEach(System.out::println);
        }

        // Método para mostrar la película cuyo título es más largo
        public static void tituloMasLargo(List<Pelicula> peliculas) {
            peliculas.stream()
                    .max(Comparator.comparing(p -> p.getTitulo().length()))
                    .ifPresent(System.out::println);
        }
        
     // Método para mostrar los nombres de los directores ordenados y en mayúsculas
        public static void directoresMayusculas(List<Pelicula> peliculas) {
            peliculas.stream()
                    .map(Pelicula::getDirector)
                    .distinct()
                    .sorted()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        }
        
        // Método para mostrar el director y al lado el número de películas de cada director
        public static void numPelis(List<Pelicula> peliculas) {
            peliculas.stream()
                    .collect(Collectors.groupingBy(Pelicula::getDirector, Collectors.counting()))
                    .forEach((k, v) -> System.out.println(k + ": " + v));
        }
        
        // Método para mostrar todas las películas de drama y mafia
        public static void dramaYMafia(List<Pelicula> peliculas) {
            Predicate<Pelicula> drama = p -> p.getGeneros().contains("Drama");
            Predicate<Pelicula> mafia = p -> p.getGeneros().contains("Mafia");
            peliculas.stream()
                    .filter(drama.and(mafia))
                    .forEach(System.out::println);
        }

        // Método para mostrar las películas de cada director ordenadas por año
        public static void filmografias(List<Pelicula> peliculas) {
            peliculas.stream()
                    .collect(Collectors.groupingBy(Pelicula::getDirector))
                    .forEach((director, pelis) -> {
                        System.out.println(director);
                        pelis.stream()
                                .sorted(Comparator.comparing(Pelicula::getAnio))
                                .forEach(p -> System.out.println("\t" + p));
                    });
        }
}
