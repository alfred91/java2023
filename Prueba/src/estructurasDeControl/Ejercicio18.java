package estructurasDeControl;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio18 {

	public static void serieMaximoMinimo() {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> numeros = new ArrayList<>();
	    while (true) {
	        System.out.println("Ingresa un número: ");
	        int numero = sc.nextInt();
	        if (numero == -1) {
	            break;
	        } else {
	            numeros.add(numero);
	        }
	    }
	    if (numeros.size() <= 0) {
	        System.out.println("No se ha introducido ningún valor correcto.");
	    } else {
	        int mayor = numeros.get(0);
	        int menor = numeros.get(0);
	        for (int numero : numeros) {
	            if (numero > mayor) {
	                mayor = numero;
	            }
	            if (numero < menor) {
	                menor = numero;
	            }
	        }
	        System.out.printf("Máximo: %d; Mínimo: %d", mayor, menor);
	    }
	    sc.close();
	}
	public static void main(String[] args) {
serieMaximoMinimo();
	}
}