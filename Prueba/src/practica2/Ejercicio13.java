package practica2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int t,segundos,minutos,horas;
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el tiempo en segundos: ");
t = sc.nextInt();

segundos = t%60;
minutos =t/60;
horas = (minutos-minutos%60)/60;

System.out.println(+horas+" Horas, "+minutos+" minutos, "+segundos+" segundos");
	}

}  