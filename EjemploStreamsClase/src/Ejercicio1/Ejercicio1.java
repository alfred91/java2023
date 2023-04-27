package Ejercicio1;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		List<String> lista = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY",
				"DOG", "In", "THE", "Street");
		
		String resultado = lista.stream()
			.reduce( (c1,c2) -> c1 + " - " + c2)
			.orElse("Error concatenando");
		
		System.out.println(resultado);
			
	}
}