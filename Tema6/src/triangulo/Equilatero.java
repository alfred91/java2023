package triangulo;

public class Equilatero extends Triangulo {

	/**
	 * 
	 */
	Equilatero() {
		super();
	}

	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	Equilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	/**
	 * @param otro
	 */
	Equilatero(Equilatero otro) {
		super(otro);
	}

	@Override
	public double area() {
		
	return Math.sqrt(3)/4*Math.pow(this.lado1, lado2);
	}

	@Override
	public boolean valido() {
		if(this.lado1==this.lado2&&this.lado2==this.lado3)
		return true;
	else return false;
	}
}
