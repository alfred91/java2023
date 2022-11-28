package practica2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int t,segundos,minutos,horas;
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el tiempo en segundos: ");
t = sc.nextInt();

segundos = ((t%3600)%60);
minutos = (t%3600/60);
horas = t/3600;

System.out.println(+horas+" Horas, "+minutos+" minutos, "+segundos+" segundos");
	}

}  