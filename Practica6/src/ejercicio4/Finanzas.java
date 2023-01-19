package ejercicio4;
import java.util.Scanner;

public class Finanzas {
	
	private double dolares;
	static double euros;
	/**
	 * @param dolares
	 * @param euros
	 */
	public Finanzas(double dolares, double euros) {
		super();
		
		this.dolares = dolares*1.36;
		this.euros = euros;
	}
	public int cambioDivisas(int dolares) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce cantidad en $: ");
		euros=sc.nextDouble();
		return (int) dolares;
		
	}
}