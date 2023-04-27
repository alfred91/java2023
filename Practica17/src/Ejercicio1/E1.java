package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E1 {
	
	public static void main(String[] args) {
		
//Crea una nueva lista con todos los strings en minúscula y muéstralos después con System.out
       
		List<String> lista = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG", "In", "THE", "Street");

        List<String> listaMinusculas = lista.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        
        	System.out.println("Minusculas "+listaMinusculas);

 //Haz lo mismo, pero sólo con los strings que tengan más de tres caracteres.
        
        List<String> listaMasDeTres = lista.stream()
                .filter(s -> s.length() > 3)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Mas de tres " +listaMasDeTres);
        
//Haz lo mismo que el anterior, a partir de ese resultado añade que salte los dos primeros strings,
 // y devuelve sólo tres strings del resultado
        
        List<String> listaSaltaDos = lista.stream()
                .filter(s -> s.length() > 3)
                .map(String::toLowerCase)
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Salta dos devuelve 3 " +listaSaltaDos);
        
//Toma la lista y directamente imprímela ordenada.
        
        System.out.println("LISTA ORDENADA:");
        lista.stream()
        .sorted()
        .forEach(System.out::println);
        
//- Cuenta cuántos strings tienes más de 4 caracteres.
        
        long masDeCuatro = lista.stream()
        		.filter(s -> s.length()>4)
        		.count();
        System.out.println("Strings de 4+ caracteres: " +masDeCuatro);
        
//- Usando una reducción devuelve una cadena uniendo todas las cadenas separadas por un “-“.
        
        String cadenaGuion = lista.stream()
        		.reduce((s1, s2) -> s1 + "-" + s2)
        		.orElse("");
				System.out.println("Cadena: "+cadenaGuion);
				

//Devuelve la primera cadena que cumpla que contiene (contains) la “O”. (Usar filter con un Predicate).

        String stringConO=lista.stream()
        		.filter(s-> s.contains("O"))
        		.findFirst()
        		.orElse("");
        System.out.println("Primer String que contiene la 'O' "+stringConO);
        
    }
}