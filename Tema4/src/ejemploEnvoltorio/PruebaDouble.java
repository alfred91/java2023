package ejemploEnvoltorio;

public class PruebaDouble {

	public static void main(String[] args) {
		
		double precio = 45.99;
		double precio2 = 100.99;
		
		Double precioE = precio2; //AutoBoxing
		precio2 = precioE; //AutoUnBoxing -> Double.doubleValue()
		
		precioE = 45.99 + precioE;
		
		int precioInt = precioE.intValue();
		
		System.out.println(precioInt);
		
		double salario = Double.parseDouble("1200.66");
		System.out.println(salario);
		
			

	}

}
