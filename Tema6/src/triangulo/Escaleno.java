package triangulo;

public class Escaleno extends Triangulo {

	/**
	 * 
	 */
	Escaleno() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	Escaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param otro
	 */
	Escaleno(Escaleno otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		double s,area;
		
		s=(this.lado1+this.lado2+this.lado3)/2;
		
		area= Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
		
		return area;
	}

	@Override
	public boolean valido() {
		
		if	(this.lado1!=this.lado2&&this.lado2!=this.lado3&&this.lado1!=this.lado3)
	
			return true;

		else 
			return false;

	}

}
