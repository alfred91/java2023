package estructurasDeControl;
import java.util.Scanner;

public class Ejercicio10 {
	
    public static void main(String[] args) {
    	int numerotabla=0;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Dime un numero del 1 al 10: ");
    	numerotabla = Integer.parseInt(sc.nextLine());
  if (numerotabla>0&&numerotabla<11) {
                  imprimirTabla(numerotabla);}}
    
    public static void imprimirTabla(int numeroDeTabla) {
        for (int x = 1; x <= 10; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
            System.out.println(linea);
        }
}}