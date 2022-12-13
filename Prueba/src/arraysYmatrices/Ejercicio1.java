package arraysYmatrices;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int i;
        int[] numeros = new int[10];

        Scanner sc = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca número "+(i+1)+" : ");
            numeros[i] = sc.nextInt();
        }

        for(i=numeros.length-1; i>=0;i--)
        {
            System.out.print(numeros[i]+" ");
        }
	}
}