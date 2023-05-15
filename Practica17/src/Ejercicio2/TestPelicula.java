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
	Genero mafia= new Genero("Mafia");
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
	elPadrino.addGenero(mafia);
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
    
   System.out.println("PELIS ORDENADAS POR ANIO :");  
   pelisOrdenadasPorAnio(peliculas);
   		System.out.println();

   	System.out.println("PELIS DE CIENCIA-FICCION POSTERIORES AL 2000");
    scifi2000(peliculas);
    	System.out.println();

    System.out.println("TITULO MAS LARGO :");
    tituloMasLargo(peliculas);
    	System.out.println();

    	System.out.println("DIRECTORES EN MAYUSCULAS: ");
        directoresMayusculas(peliculas);
        	System.out.println();
        	
       System.out.println("MOSTRAR DIRECTOR Y NUMERO DE PELIS"); 	
        numPelis(peliculas);
        	System.out.println();
        
        	System.out.println("MOSTRAR TODAS LAS PELICULAS DE DRAMA Y MAFIA");
        dramaYMafia(peliculas);
        	System.out.println();
        	
        	System.out.println("MOSTRAR LAS PELICULAS DE CADA DIRECTOR ORDENADAS POR ANIO");
        filmografias(peliculas);
    		System.out.println();
    }
    
    // MOSTRAR PELIS ORDENADAS POR AÑO 
    public static void pelisOrdenadasPorAnio(List<Pelicula> peliculas) {
        peliculas.stream()
                .sorted(Comparator.comparing(Pelicula::getAnio))
                .forEach(System.out::println);
        
    }
        
        
     // MOSTRAR PELIS DE CIENCIA FICCION POSTERIORES AL AÑO 2000
    public static void scifi2000(List<Pelicula> peliculas) {
        peliculas.stream()
                .filter(p -> p.getGeneros().stream().anyMatch(g -> g.getNombre().equals("Ciencia Ficcion"))
                			&& p.getAnio() >= 2000)
                .forEach(System.out::println);
    }


        // MOSTRAR LA PELICULA CON EL TITULO MAS LARGO
        public static void tituloMasLargo(List<Pelicula> peliculas) {
            peliculas.stream()
                    .max(Comparator.comparing(p -> p.getTitulo().length()))
                    .ifPresent(System.out::println);
        }
        
     // MOSTRAR NOMBRES DE LOS DIRECTORES ORDENADOS Y EN MAYUSCULAS
        
        public static void directoresMayusculas(List<Pelicula> peliculas) {
            List<String> directoresMayusculas = peliculas.stream()
                    .map(Pelicula::getDirectores)
                    .flatMap(List::stream)
                    .map(Director::getNombre)
                    .distinct()
                    .sorted()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            directoresMayusculas.forEach(System.out::println);
        }
        
        // MOSTRAR DIRECTOR Y NUMERO DE PELIS
        public static void numPelis(List<Pelicula> peliculas) {
            peliculas.stream()
                    .collect(Collectors.groupingBy(Pelicula::getDirectores, Collectors.counting()))
                    .forEach((k, v) -> System.out.println(k + ": " + v));
        }
        
        // MOSTRAR TODAS LAS PELICULAS DE DRAMA Y MAFIA
        public static void dramaYMafia(List<Pelicula> peliculas) {
            Predicate<Pelicula> drama = p -> p.getGeneros().contains("drama");
            Predicate<Pelicula> mafia = p -> p.getGeneros().contains("mafia");
            peliculas.stream()
                    .filter(drama.and(mafia))
                    .forEach(System.out::println);
        }

        // MOSTRAR LAS PELICULAS DE CADA DIRECTOR ORDENADAS POR ANIO 
        public static void filmografias(List<Pelicula> peliculas) {
            peliculas.stream()
                    .collect(Collectors.groupingBy(Pelicula::getDirectores))
                    .forEach((director, pelis) -> {
                        System.out.println(director);
                        pelis.stream()
                                .sorted(Comparator.comparing(Pelicula::getAnio))
                                .forEach(p -> System.out.println("\t" + p));
                    });
        }
}
