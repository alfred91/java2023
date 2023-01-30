package ejemplos.herencia;

public class Circulo extends Figura {

	private double radio;
	private double perimetro;
	
	public Circulo(String color, String id, double radio, double perimetro) {
		super(color, id); //Llama al constructor de Figura(color, id)
		this.radio = radio;
		this.perimetro = perimetro;		
	}
	
	public double getArea() {
		return 2 * Math.PI * this.radio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo [radio=");
		builder.append(radio);
		builder.append(", perimetro=");
		builder.append(perimetro);
		builder.append(", color=");
		builder.append(color);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	

}
