package ejemplos.set;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PruebaBasicaSet {

	public static void main(String[] args) {
		
		
		//Set<Persona> juntaDirectiva = new HashSet<>();
		//Set<Persona> juntaDirectiva = new TreeSet<>(); //Para ordenar, Persona debe implementar Comparable		
		Set<Persona> juntaDirectiva = new LinkedHashSet<>();
		
		
		//TreeSet con Comparator
		/*
		Set<Persona> juntaDirectiva = new TreeSet<>( new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {

				return o1.getDni().compareTo(o2.getDni());
			}
			
		}); 
		*/
		juntaDirectiva.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		juntaDirectiva.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
		juntaDirectiva.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1995, 3, 4)));
		juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		//Si tratamos de añadir un elemento repetido...
		juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		juntaDirectiva.add(new Persona("24567890C", "Ana", "Sánchez", LocalDate.of(1992, 3, 4)));
		
		//Comprobamos que al listarlos todos, no aparece duplicado
		for(Persona p : juntaDirectiva)
			System.out.println(p);
		
		
		//TreeSet con Comparator
		Set<Persona> juntaDirectiva2 = new TreeSet<>( new miComparador() ); 
		
		//Añadimos los de el otro TreeSet
		for(Persona p : juntaDirectiva)
			juntaDirectiva2.add(p);
		
		System.out.println("------------------------------");
		//Comprobamos que al listarlos todos, no aparece duplicado
		for(Persona p : juntaDirectiva2)
			System.out.println(p);


	}

}

class miComparador implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getApellidos().compareTo(o2.getApellidos());
	}
	
}
