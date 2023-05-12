package Ejercicio2;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula pulpFiction = new Pelicula(1, "Pulp Fiction", 1994);
		Pelicula reservoirDogs = new Pelicula(2, "Reservoir Dogs", 1992);
		Pelicula gladiator = new Pelicula(3, "Gladiator", 2000);
		Pelicula bladeRunner = new Pelicula(4, "Blade Runner", 1982);
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
		
		


	    private List<Pelicula> peliculas;

	    public TestPelicula(List<Pelicula> peliculas) {
	        this.peliculas = peliculas;
	    }

	    public void pelisOrdenadasPorAño() {
	        peliculas.stream()
	                .sorted(Comparator.comparing(Pelicula::getAnio))
	                .forEach(System.out::println);
	    }

	    public void tituloMasLargo() {
	        peliculas.stream()
	                .max(Comparator.comparing(p -> p.getTitulo().length()))
	                .ifPresent(System.out::println);
	    }

	    public void directoresMayúsculas() {
	        peliculas.stream()
	                .flatMap(p -> p.getDirectores().stream())
	                .distinct()
	                .sorted(Comparator.comparing(Director::getNombre))
	                .map(Director::getNombre)
	                .map(String::toUpperCase)
	                .forEach(System.out::println);
	    }

	    public void numPelis() {
	        Map<Director, Long> pelisPorDirector = peliculas.stream()
	                .flatMap(p -> p.getDirectores().stream())
	                .collect(Collectors.groupingBy(d -> d, Collectors.counting()));

	        pelisPorDirector.entrySet().stream()
	                .sorted(Comparator.comparing(e -> e.getKey().getNombre()))
	                .forEach(e -> System.out.println(e.getKey().getNombre() + ": " + e.getValue()));
	    }

	    public void dramaYMafia() {
	        Predicate<Genero> esDrama = g -> g.getNombre().equals("Drama");
	        Predicate<Genero> esMafia = g -> g.getNombre().equals("Mafia");

	        peliculas.stream()
	                .filter(p -> p.getGeneros().stream().anyMatch(esDrama.and(esMafia)))
	                .forEach(System.out::println);
	    }

	    public void filmografías() {
	        peliculas.stream()
	                .flatMap(p -> p.getDirectores().stream()
	                        .map(d -> new AbstractMap.SimpleEntry<>(d, p)))
	                .collect(Collectors.groupingBy(
	                        e -> e.getKey(),
	                        TreeMap::new,
	                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
	                .forEach((d, ps) -> {
	                    System.out.println(d.getNombre());
	                    ps.stream()
	                            .sorted(Comparator.comparing(Pelicula::getAnio))
	                            .forEach(System.out::println);
	                });
	    }
	}