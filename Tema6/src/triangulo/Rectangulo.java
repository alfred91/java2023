package triangulo;

public class Rectangulo extends Triangulo {

	/**
	 * 
	 */
	Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	Rectangulo(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param otro
	 */
	Rectangulo(Rectangulo otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		
		if (this.lado1==this.mayor()) {
	
			return (this.lado2*this.lado3)/2;}
	
		else if (this.lado2==this.mayor()) {
		
			return (this.lado3*this.lado1)/2;}
		
			else 
				
		return (this.lado1*this.lado2)/2;
	}
	//Suponemos que lado 1 es la hipotenusa y lado 2 y lado 3 los catetos
	
	@Override
	public boolean valido() {
		// TODO Auto-generated method stub
		return false;
	}
public double mayor() {
	if (this.lado1>this.lado2&&this.lado1>this.lado3)
		return this.lado1;
	else if(this.lado2>this.lado1 && this.lado2>this.lado3)
			return this.lado2;
	else if(this.lado3>this.lado1 && this.lado3>this.lado2)
		return this.lado2;
	
	return this.lado3;
	}
}