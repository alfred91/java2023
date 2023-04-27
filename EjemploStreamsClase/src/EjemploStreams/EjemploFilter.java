package EjemploStreams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploFilter {

	public static void main(String[] args) {
		
		List<Persona> lista = Arrays.asList(
				
				new Persona("32345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "María", "López Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("22345678A", "Martín", "Casillas Cuenca", LocalDate.of(1991, 12, 12)),
				new Persona("32345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "María", "López Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("22345678A", "MartenX", "Casillas Cuenca", LocalDate.of(2001, 12, 12)),
				new Persona("32345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "María", "López Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("22345678A", "Martín", "Casillas Cuenca", LocalDate.of(1991, 12, 12)),				
				new Persona("32345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "María", "López Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("22345678A", "Martín", "Casillas Cuenca", LocalDate.of(1991, 12, 12))				
				);
		
		//Se pone primero el filtro que elimine más objetos del stream
		lista.stream()
			.filter( p -> p.getFechaNacimiento().getYear() > 2000)	
			.peek(System.out::println)
			.filter( p -> p.getNombre().contains("e"))			
			.forEach(System.out::println);
				
		
		//Stream<String>
		Arrays.asList("París", "Berlín", "Madrid", "Moscú", "Londres", "Roma", "Viena", "Bruselas", "París")
			.stream()
			.distinct()
			.skip(3)
			.limit(2)
			.map( c -> c.toUpperCase() )
			.map( String::toUpperCase )
			.map( c -> c.length())
			.sorted(Comparator.reverseOrder())
			.map( c -> c.toString() )
			.forEach(System.out::println);
		
		lista.stream()
		.sorted()
		.forEach(System.out::println);
		
		
		lista.stream()
		.sorted()
		.forEach(p -> {
			System.out.print(p.getDni());
			System.out.print(" - ");
			System.out.println(p.getFechaNacimiento().getYear());
		});
	}
}