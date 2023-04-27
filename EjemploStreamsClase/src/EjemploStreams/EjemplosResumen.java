package EjemploStreams;

import java.util.Arrays;
import java.util.List;

public class EjemplosResumen {

	public static void main(String[] args) {
		
		List<String> ciudades = Arrays.asList("Madrid", "Barcelona", "Bilbao", "Valencia", "Almería", "Toledo");
		
		System.out.println(
				ciudades.stream()
					.filter( p -> p.contains("o"))
					.count()
		);
		
		System.out.println(
				ciudades.stream()
					.max( (c1, c2) -> c1.length() - c2.length())
					.get()
		);

		System.out.println(
				ciudades.stream()
					.min( (c1, c2) -> c2.compareTo(c1))
					.get()
		);
		
		
	}

}