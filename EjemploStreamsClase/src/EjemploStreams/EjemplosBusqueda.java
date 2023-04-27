package EjemploStreams;

import java.util.Arrays;
import java.util.List;

public class EjemplosBusqueda {

	public static void main(String[] args) {
		
		List<String> ciudades = Arrays.asList("Madrid", "Barcelona", "Bilbao", "Valencia", "Almería", "Toledo");
		
		//Coincidencia
		boolean mayorCuatro = ciudades.stream()
			.allMatch( c -> (c.length() > 4) );
		
		System.out.println(mayorCuatro);
		
		System.out.println(
				ciudades.stream()
					.anyMatch(c -> c.contains("i"))
		);
		
		//Busqueda
		System.out.println(
				ciudades.stream()
					.filter( c -> c.contains("o"))
					.findFirst()
					.orElse("No encontrado")
		);
		
		//Busqueda
		ciudades.stream()
					.filter( c -> c.contains("o"))
					.findAny()
					.ifPresent(c -> {
						System.out.println("He encontrado un elemento");
						System.out.println("El elemento es " + c);
					});
		

	}

}