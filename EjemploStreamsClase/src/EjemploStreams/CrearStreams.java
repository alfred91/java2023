package EjemploStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class CrearStreams {

	public static void main(String[] args) {
		
		Stream.of("hola", "mundo", "cruel")
			.sorted()
			.forEach(System.out::println);
		
		List<String> palabras = new ArrayList<>();
		palabras.add("cruel");
		palabras.add("mundo");
		palabras.add("hola");
		
		palabras.stream()
			.sorted()
			.forEach(System.out::println);
		
		Stream.iterate(1, x -> x + 2)
			.limit(100)
			.forEach(System.out::println);
	
		System.out.println(
				Stream.generate(new Random()::nextInt)
					.limit(20)
					.max( (i1, i2) -> i1.compareTo(i2))
					.get()
		);

	}

}