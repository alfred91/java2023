package primeraevaluacion;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio33 {
    public static void tirada(String args[])
    {
        System.out.print("Introduce el nº de tiradas: ");

        Scanner input = new Scanner(System.in);
        int ntiradas = input.nextInt();

        Random ranNum = new Random();

        System.out.print("Tus resultados : ");
        int total = 0;
        int randomNumber = 0;

        for (int i = 0; i < ntiradas; i++) {

            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Total: " + total);
        input.close();
    }
}