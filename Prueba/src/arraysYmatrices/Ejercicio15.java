package arraysYmatrices;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	
public static void main(String[] args) {
    // TODO Auto-generated method stub

    Random rant = new Random();
    Scanner n = new Scanner(System.in);

    // crear un array de numeros aleatoros mas pequeños que el 20 y luego en
    // otro array mostrar los numeros mas pequeños que el 20 que no se hayan
    // generado en el array

    int[] array = new int[10];
    int numero = 0;
    // lo generamos
    for (int i = 0; i < array.length; i++) {
        numero = rant.nextInt(20 - 1);
        if (repetido(array, numero) == false) {
            array[i] = numero;
        }
    }
    // comprovamos que no haya ningun numero repetidos

    // lo mostramos
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+" ");
    }
    
}

public static boolean repetido(int[] array, int valor) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == valor && valor!=0) {
            return true; //Si está repetido devolvemos true
        }
    }
    return false; //Si ha acabado el bucle quiere decir que no había valores repetidos
                  //así que podemos devolver directamente false
	}
}