package Ejercicio2;

import java.util.stream.*;
import java.util.*;

public class TestPelicula {

	public static void main(String[] args) {
		
		
		ArrayList<Genero> generos = new ArrayList<>();
		generos.add(new Genero(1, "Acción"));
		generos.add(new Genero(2, "Ciencia ficción"));
		generos.add(new Genero(3, "Drama"));

        
        
        ArrayList<Director> directores = new ArrayList<>();
        directores.add(new Director(1, "Ridley Scott"));
        directores.add(new Director(2, "F.F. Coppola"));
        directores.add(new Director(3, "C. Nolan"));
        directores.add(new Director(4, "Martin Scorsese"));
        directores.add(new Director(5, "Quentin Tarantino"));

                
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula(1, "Pulp Fiction", 1994));
        peliculas.add(new Pelicula(2, "Reservoir Dogs", 1992));
        peliculas.add(new Pelicula(3, "Gladiator", 2000));
        peliculas.add(new Pelicula(4, "Blade Runner", 1982));
        peliculas.add(new Pelicula(5, "Alien", 1979));
        peliculas.add(new Pelicula(6, "Apocalypse Now", 1979));
        peliculas.add(new Pelicula(7, "El Padrino", 1972));
        peliculas.add(new Pelicula(8, "Tenet", 2020));
        peliculas.add(new Pelicula(9, "Origen", 2010));
        peliculas.add(new Pelicula(10, "Casino", 1995));
        peliculas.add(new Pelicula(11, "Goodfellas", 1990));
        peliculas.add(new Pelicula(12, "El lobo de Wall Street", 2013));
                
     
        Director director1 = directores.get(0);
        director1.addPelicula(peliculas.get(3));
        director1.addPelicula(peliculas.get(4)); 

     
        Director director2 = directores.get(1);
        director2.addPelicula(peliculas.get(6)); 

      
        Director director3 = directores.get(2);
        director3.addPelicula(peliculas.get(7));
        director3.addPelicula(peliculas.get(8));

    
        Director director4 = directores.get(3);
        director4.addPelicula(peliculas.get(9)); 
        director4.addPelicula(peliculas.get(10));
        director4.addPelicula(peliculas.get(11));

     
        Director director5 = directores.get(4);
        director5.addPelicula(peliculas.get(0));
        director5.addPelicula(peliculas.get(1));
        
        peliculas.add( Genero(peliculas.get(0), generos.get(1))); 
	       
        
	        
	       

	        
	        List<Pelicula> pelisOrdenadasPorAño = peliculas.stream()
	                .sorted(Comparator.comparing(Pelicula::getAnio))
	                .collect(Collectors.toList());
	        System.out.println("Películas ordenadas por año: ");
	        pelisOrdenadasPorAño.forEach(System.out::println);
		
	

	}

}