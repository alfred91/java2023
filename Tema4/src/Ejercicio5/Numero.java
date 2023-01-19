package Ejercicio5;

public class Numero {

	private Integer entero;

	public Numero() {
		super();
		this.entero = 0;
	}
	
	public Numero(int num) {
		this.entero = num;
	}
	
	public void sumaDouble(double sumando) {
		this.entero = (int) (this.entero.doubleValue() + sumando);
	}
	
	public void suma(int sumando) {
		this.entero = this.entero + sumando;
	}
	
	public void resta(int restando) {
		this.entero = this.entero - restando;
	}
	
	public int getValor() {
		return this.entero;
	}
	
	public double getDouble() {
		return this.entero.doubleValue();
	}
	
	public void setNumero(int num) {
		this.entero = num;
	}
	
	
	
	
}
