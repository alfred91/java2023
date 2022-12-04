package estructurasDeControl;

import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        double suma, un_numero;
        suma = 0;
        for (i=1; i<=100; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de un numero: ");
            un_numero = in.nextDouble();
            in.nextLine();
            suma=suma+un_numero;
            System.out.println();
        }
        System.out.println("Valor de suma: " + suma);
    }

}
