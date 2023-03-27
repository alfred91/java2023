package ejemplos.rendimiento;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListvsLinkedList {

	public static void main(String[] args) {
		
		ArrayList<String> palabras = new ArrayList<>();
		for(int i=0; i<10000000; i++)
			palabras.add("Palabra"+i);
		
		long inicio = System.currentTimeMillis();
		for(int i=50000; i<55000; i++)
			palabras.remove(i);
		long fin = System.currentTimeMillis();
		System.out.println(fin - inicio);

		
		LinkedList<String> palabras2 = new LinkedList<>();
		for(int i=0; i<10000000; i++)
			palabras2.add("Palabra"+i);
		
		inicio = System.currentTimeMillis();
		for(int i=50000; i<55000; i++)
			palabras.remove(i);
		fin = System.currentTimeMillis();
		System.out.println(fin - inicio);

		
	}

}
