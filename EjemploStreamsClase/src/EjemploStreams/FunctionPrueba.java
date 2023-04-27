package EjemploStreams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionPrueba {

	public static void main(String[] args) {
		
		List<Persona> lista = Arrays.asList(
				new Persona("32345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "María", "López Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("22345678A", "Martín", "Casillas Cuenca", LocalDate.of(1991, 12, 12))				
				);
		
		List<String> lista2 = lista.stream()
			.sorted( (p1, p2) -> p1.getDni().compareTo(p2.getDni()) )
			.map( p -> p.getNombre() )
			.sorted()
			.collect(Collectors.toList());
		
		
		lista2.forEach(System.out::println);
		
		Persona pepe = lista.stream()
			.filter( p -> p.getNombre().contains("e"))
			.findFirst()
			.get();
		
	}
}