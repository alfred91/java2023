package EjemploStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class EjemplosOrdenacion {

	public static void main(String[] args) {
	
		
		Stream.generate(new Random()::nextInt)
			.limit(10)
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	
		Stream.generate(new Random()::nextInt)
			.limit(10)
			.sorted()
			.forEach(System.out::println);

		
		List<String> ciudades = Arrays.asList("Madrid", "Barcelona", "Bilbao", "Valencia", "Almería", "Toledo");
		ciudades.stream()
			.sorted( (p1,p2) -> p1.compareTo(p2))
			.forEach(System.out::println);
	
	}
	

}