package ejemplos.set;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparacionSetArrayList {

	public static void main(String[] args) {
		
		ArrayList<Persona> juntaDirectiva = new ArrayList<>();
		

		juntaDirectiva.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		juntaDirectiva.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
		juntaDirectiva.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1995, 3, 4)));
		juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		//Si tratamos de añadir un elemento repetido...
		juntaDirectiva.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		juntaDirectiva.add(new Persona("24567890C", "Ana", "Sánchez", LocalDate.of(1992, 3, 4)));

		//Ordenar un ArrayList
		Collections.sort(juntaDirectiva);
		
		//Comprobamos que al listarlos todos, no aparece duplicado
		for(Persona p : juntaDirectiva)
			System.out.println(p);
				
			
		//Ordenamos de otra forma
		Collections.sort(juntaDirectiva, new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {

				return o1.getDni().compareTo(o2.getDni());
			}
			
		});
		
		System.out.println("------------------------");
		
		//Comprobamos que al listarlos todos, no aparece duplicado
		for(Persona p : juntaDirectiva)
			System.out.println(p);
		
	}

}
