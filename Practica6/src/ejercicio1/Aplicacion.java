package ejercicio1;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] argumentos) {
		
      double celsius,fahrenheit;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa los Grados Celsius: ");
        
        	celsius = sc.nextDouble();
        
        System.out.println("Son "+Ejercicio1.celsiusAFahrenheit(celsius)+" Fahrenheit");
        
        System.out.println("Ingresa los fahrenheit: ");
        
        	fahrenheit=sc.nextDouble();
        
        System.out.println("Son "+Ejercicio1.fahrenheitACelsius(fahrenheit)+" Celsius");
    }

}