package ejemplos.herencia;

public class Rectangulo extends Figura {

	private double ladoMayor;
	private double ladoMenor;
	
	public Rectangulo(String color, String id, double ladoMayor, double ladoMenor) {
		super(color, id);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	
	public double getArea() {
		return this.ladoMayor * this.ladoMenor;
	}

}
