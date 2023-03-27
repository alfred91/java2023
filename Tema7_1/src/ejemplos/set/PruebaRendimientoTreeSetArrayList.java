package ejemplos.set;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class PruebaRendimientoTreeSetArrayList {

	public static void main(String[] args) {

		
		ArrayList<Persona> juntaDirectiva = new ArrayList<>();
		
		long tiempo = System.currentTimeMillis();
		for(int i=0; i<10000000; i++)
			juntaDirectiva.add(new Persona(i+"A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));

		//Ordenar un ArrayList
		Collections.sort(juntaDirectiva);
		System.out.println(System.currentTimeMillis() - tiempo);
		
		System.out.println("------------------------");
		
		TreeSet<Persona> juntaDirectiva2 = new TreeSet<>();
		tiempo = System.currentTimeMillis();
		for(int i=0; i<10000000; i++)
			juntaDirectiva.add(new Persona(i+"A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		
		System.out.println(System.currentTimeMillis() - tiempo);
		
		System.out.println("------------------------");

	}

}
