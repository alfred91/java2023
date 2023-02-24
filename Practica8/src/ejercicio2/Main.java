package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int a;
    	Scanner sc=new Scanner(System.in);
        Password pass1 = new Password();
        System.out.println("Indica la longitud para contraseña 2: ");
        a=sc.nextInt();
        
        Password pass2 = new Password(a);

        System.out.println("Contraseña 1: " + pass1.generarPassword());
        System.out.println(pass1.esFuerte());

        System.out.println();

 
        System.out.println("Contraseña 2 "+pass2.generarPassword());
        System.out.println( pass2.esFuerte());
    }
}