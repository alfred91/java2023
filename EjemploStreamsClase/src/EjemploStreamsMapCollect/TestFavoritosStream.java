package EjemploStreamsMapCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestFavoritosStream {

	public static void main(String[] args) {
		
		List<Favoritos> favoritos = new ArrayList<>();
		
		Favoritos p1 = new Favoritos("Jonatan");
		p1.addFavorito(new Libro("Libro1", "Autor1", 100));
		p1.addFavorito(new Libro("Libro2", "Autor2", 200));
		

		Favoritos p2 = new Favoritos("Andrés");
		p2.addFavorito(new Libro("Libro3", "Autor1", 500));
		p2.addFavorito(new Libro("Libro2", "Autor2", 200));
		
		Favoritos p4 = new Favoritos("Andrés");
		p4.addFavorito(new Libro("Libro3", "Autor1", 500));
		p4.addFavorito(new Libro("Libro2", "Autor2", 200));
		
		Favoritos p3 = new Favoritos("Estela");
		p3.addFavorito(new Libro("Libro4", "Autor2", 1000));
		p3.addFavorito(new Libro("Libro2", "Autor2", 200));
		p3.addFavorito(new Libro("Libro3", "Autor1", 500));
		
		favoritos.add(p1);
		favoritos.add(p2);
		favoritos.add(p3);
		//favoritos.add(p4);
		
		
		//Imprime los nombre de las personas que han guardado sus libros favoritos
		System.out.println("1");
		favoritos.stream()
			.map( f -> f.getNombrePersona() )
			.forEach(System.out::println);

		//Generar un Set con los nombres de las personas que han guardado sus favoritos
		System.out.println("2");
		Set<String> nombres = favoritos.stream()
								.map( f -> f.getNombrePersona() )
								.collect(Collectors.toSet());
		for(String s: nombres) {
			System.out.println(s);
		}
		
		//Pintar los nombres de las personas que han guardado sus favoritos ordenados alfabéticamente
		System.out.println("3");
		favoritos.stream()
				.map( f -> f.getNombrePersona() )
				.collect(Collectors.toSet())
				.stream()
					.forEach(System.out::println);
		;
		
		//Pintar los nombres de las personas que han guardado sus favoritos ordenados alfabéticamente
		System.out.println("4");
		favoritos.stream()
				.map( f -> f.getNombrePersona() )
				.distinct()
				.forEach(System.out::println);
		;
		
		//Mostrar los favoritos de todas las personas
		System.out.println("5");
		favoritos.stream()
				.map( f -> f.getFavoritos())
				.forEach(System.out::println);


		//Mostrar los favoritos de todas las personas en general, no repetidos
		System.out.println("5");
		favoritos.stream()
				.flatMap( f -> f.getFavoritos().stream() )
				.distinct()
				.forEach(System.out::println);

		//Devuelve un mapa, cuya clave sea la inicial del nombre, y el valor sea los libros favoritos
		Map<String, List<Libro>> mapa =  favoritos.stream()
											.collect(Collectors.toMap(Favoritos::getNombrePersona,  
													                  Favoritos::getFavoritos ));
		
		for(String clave: mapa.keySet()) {
			System.out.println(clave + " - " + mapa.get(clave));
		}

	}
}