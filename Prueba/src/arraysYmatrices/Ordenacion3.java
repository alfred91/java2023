package arraysYmatrices;
import java.util.Arrays;
public class Ordenacion3 {

	public static void main(String[] args) {

		        int numeros[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
		        
		        System.out.println("Original : " + Arrays.toString(numeros));
		        burbuja(numeros);
		        
		        System.out.println("Burbuja : " + Arrays.toString(numeros));
		        String[] nombres = {"Jose", "Carmen", "Gines", "Marcos", "Ana"};
		        
		        System.out.println("");
		        
		        System.out.println("Original : " + Arrays.toString(nombres));
		        burbuja(nombres);
		        System.out.println("Burbuja: " + Arrays.toString(nombres));
		    }

		    private static void burbuja(int[] vector) {
		        for (int x = 0; x < vector.length; x++) {
		            // Aquí "y" se detiene antes de llegar
		            // a length - 1 porque dentro del for, accedemos
		            // al siguiente elemento con el índice actual + 1
		            for (int y = 0; y < vector.length - 1; y++) {
		                int elementoActual = vector[y],
		                        elementoSiguiente = vector[y + 1];
		                if (elementoActual > elementoSiguiente) {
		                    // Intercambiar
		                    vector[y] = elementoSiguiente;
		                    vector[y + 1] = elementoActual;
		                }
		            }
		        }
		    }
		    private static void burbuja(String[] vector) {
		        for (int x = 0; x < vector.length; x++) {
		            // Aquí "y" se detiene antes de llegar
		            // a length - 1 porque dentro del for, accedemos
		            // al siguiente elemento con el índice actual + 1
		            for (int y = 0; y < vector.length - 1; y++) {
		                String elementoActual = vector[y],
		                        elementoSiguiente = vector[y + 1];
		                if (elementoActual.compareTo(elementoSiguiente) > 0) {
		                    // Intercambiar
		                    vector[y] = elementoSiguiente;
		                    vector[y + 1] = elementoActual;
		                }
		            }
		        }
		    }
		}