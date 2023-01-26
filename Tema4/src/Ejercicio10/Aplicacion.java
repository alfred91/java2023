package Ejercicio10;

public class Aplicacion {

	public static void main(String[] args) {
		
		Consumo cm = new Consumo(250, 15, 110, 1.75);
		System.out.println(cm.getTiempo() + " horas");
		System.out.println(cm.consumoMedio() + " l/100kms");
		System.out.println(cm.consumoEuros() + " €/100kms");
		

	}

}
