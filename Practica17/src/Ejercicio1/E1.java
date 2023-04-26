package Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E1 {
	
	public static void main(String[] args) {
		
        List<String> lista = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG", "In", "THE", "Street");

        List<String> listaMinusculas = lista.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Minusculas "+listaMinusculas);
        
        List<String> listaMasDeTres = lista.stream()
                .filter(s -> s.length() > 3)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Mas de tres " +listaMasDeTres);
        
        List<String> listaSaltaDos = lista.stream()
                .filter(s -> s.length() > 3)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Mas de tres " +listaSaltaDos);
        
        
    }
}