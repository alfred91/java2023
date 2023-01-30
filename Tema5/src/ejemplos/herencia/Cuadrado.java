package ejemplos.herencia;

public class Cuadrado extends Figura {

	private double lado;
	
	public Cuadrado(String color, String id, double lado) {
		super(color, id);
		this.lado = lado;
	}

	public double getArea() {
		return this.lado * this.lado;
	}
}
