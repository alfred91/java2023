package Ejercicio5;

public class Aplicacion {

	public static void main(String[] args) {
		Numero n1 = new Numero();		
		System.out.println(n1.getValor());
		
		Numero n2 = new Numero(33);
		n2.suma(22);
		n2.resta(15);
		System.out.println(n2.getValor());

		
		NumCalc nc1 = new NumCalc(2);
		System.out.println(nc1.suma(22));
		System.out.println(nc1.getValor());
	}

}
