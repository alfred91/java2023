package Ejercicio5;

public class NumCalc {

	private Integer entero;
	
	public NumCalc() {
		this.entero = 0;
	}
	
	public NumCalc(int num) {
		this.entero = num;
	}
	
	public int suma(int valor) {
		return this.entero + valor;
	}
	
	public double getDouble() {
		return this.entero.doubleValue();
	}
	
	public int getValor() {
		return this.entero;
	}
	
}
