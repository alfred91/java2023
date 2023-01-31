package ejercicio4;
import java.util.Scanner;

public class Finanzas {
	
public double dolares;
public double euros;

public Finanzas(double dolares, double euros) {
		super();
		this.dolares = euros*0.64;
		this.euros = dolares*1.36;
	}

	public void dolaresToEuros(double dolares) {
		this.dolares=dolares*1.36;
		this.euros=euros;
	}
	
	public void eurosToDolares(double euros) {
		this.euros=euros*0.64;
		this.dolares=dolares;
	}

	/**
	 * @return the dolares
	 */
	public double getDolares() {
		return dolares;
	}

	/**
	 * @param dolares the dolares to set
	 */
	public void setDolares(double dolares) {
		this.dolares = dolares;
	}

	/**
	 * @return the euros
	 */
	public double getEuros() {
		return euros;
	}

	/**
	 * @param euros the euros to set
	 */
	public void setEuros(double euros) {
		this.euros = euros;
	}

	/**
	 * @param dolares
	 * @param euros
	 */
	public int cambioDivisas(int dolares) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce cantidad en $: ");
		euros=sc.nextDouble();
		return (int) dolares;
		
	}
	
}