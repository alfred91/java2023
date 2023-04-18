package Ejercicio5;

import java.util.*;

public class OrdenacionMezcla {

    public static List<Integer> ordenar(List<Integer> lista1, List<Integer> lista2) {
        
        Queue<Integer> q1 = new LinkedList<>(lista1);
        Queue<Integer> q2 = new LinkedList<>(lista2);
        
        List<Integer> resultado = new ArrayList<>();
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() < q2.peek()) {
                resultado.add(q1.poll());
            } else {
                resultado.add(q2.poll());
            }
        }
        
        resultado.addAll(q1);
        resultado.addAll(q2);
        
        return resultado;
    }

	public static void main(String[] args) {
		
	    List<Integer> lista1 = Arrays.asList(1, 13, 15, 17);
	    List<Integer> lista2 = Arrays.asList(2, 10, 26, 34);
	    
	    List<Integer> resultado = ordenar(lista1, lista2);
	    
	    System.out.println(resultado);
		}
}