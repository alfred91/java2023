package Tema3;
import java.util.Scanner;

public class Ejercicio24{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int unidades=0;
int decenas=0;
int centenas=0;
int numero=0;

System.out.println("Introduce un numero");
numero = Integer.parseInt(sc.nextLine());

centenas=numero/100;
unidades=numero%100%10;
decenas=numero%100/10;


	System.out.println(""+unidades+""+decenas+""+centenas);
}}