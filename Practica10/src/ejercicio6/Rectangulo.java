package ejercicio6;
public class Rectangulo extends Triangulo {
	public Rectangulo() {
		super();
	}

	public Rectangulo(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	public Rectangulo(Rectangulo otro) {
		super(otro);
	}

	/**
	 * lado2 y lado3 son los catetos
	 */
	@Override
	public double area() {
		if (this.lado1 == this.mayor()) {
			return (this.lado2 * this.lado3) / 2;
		} else if (this.lado2 == this.mayor()) {
			return (this.lado1 * this.lado3) / 2;
		} else {
			return (this.lado1 * this.lado2) / 2;
		}		
		
	}

	/**
	 * lado1 es la hipotenusa, lado2 y lado3 los catetos
	 */
	@Override
	public boolean valido() {
		if (this.lado1 == this.mayor()) {
			//Pitágoras
			if (Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2))
				return true;
			else 
				return false;
		} else if (this.lado2 == this.mayor()) {
			if (Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2))
				return true;
			else
				return false;
		} else {
			if (Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2))
				return true;
			else
				return false;
		}	
	}
	
	
	public double mayor() {
		if (this.lado1 > this.lado2 && this.lado1 > this.lado3)
			return this.lado1;
		else if (this.lado2 > this.lado1 && this.lado2 > this.lado3)
			return this.lado2;
		else 
			return this.lado3;
	}

}