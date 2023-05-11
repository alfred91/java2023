package Ejercicio2;

import java.util.stream.*;
import java.util.*;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPelicula {

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