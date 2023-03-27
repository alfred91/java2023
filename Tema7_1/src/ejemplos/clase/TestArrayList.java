package ejemplos.clase;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.addAll(List.of(4,5,6));
		
		System.out.println(numeros.toString());
		
		numeros.removeAll(List.of(5,6,7));
		
		System.out.println(numeros.toString());

		
	}

}
