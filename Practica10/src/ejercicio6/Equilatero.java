package ejercicio6;
public class Equilatero extends Triangulo {

	
	public Equilatero() {
		super();
	}

	public Equilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	public Equilatero(Equilatero otro) {
		super(otro);
	}

	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * Math.pow(this.lado1, 2);
	}

	@Override
	public boolean valido() {
		if (this.lado1 == this.lado2 && this.lado1 == this.lado3)
			return true;
		else
			return false;
	}

}
