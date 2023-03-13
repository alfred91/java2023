package ejercicio6;
public class Escaleno extends Triangulo {
	
	public Escaleno() {
		super();
	}

	public Escaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}

	public Escaleno(Escaleno otro) {
		super(otro);
	}

	@Override
	public double area() {
		double s, area;
		
		s = (this.lado1 + this.lado2 + this.lado3) / 2;
		area = Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
		
		return area;
	}

	@Override
	public boolean valido() {
		
		if (this.lado1 != this.lado2 && this.lado2 != this.lado3 && this.lado1 != this.lado3)
			
			return true;
		
		else
			
			return false;
	}

}