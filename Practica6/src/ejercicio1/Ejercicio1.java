package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
		
	    public static void main(String[] argumentos) {
	        double celsius;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Ingresa los Grados Celsius: ");
	        celsius = sc.nextDouble();
	        // Calcular
	        double fahrenheit = celsiusAFahrenheit(celsius);
	        System.out.printf("%f Celsius son %f grados fahrenheit", celsius, fahrenheit);
	    }

	    public static double celsiusAFahrenheit(double celsius) {
	        return (celsius * 1.8f) + 32;
	    }

	    public static double fahrenheitACelsius(double fahrenheit) {
	        return (fahrenheit - 32) / 1.8f;
	    }
	}