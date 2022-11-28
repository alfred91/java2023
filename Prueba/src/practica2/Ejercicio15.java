package practica2;

public class Ejercicio15 {

	public static void main(String[] args) {
		
	double cantidad = 2000;
	double interes = 0.275;
	double retencion = 0.18;
	double misIntereses, misInteresesRetencion;
	
	misIntereses = cantidad * interes / 2;
	misInteresesRetencion = misIntereses * retencion;
	
	System.out.println(misIntereses + "€ sin retencion");
	System.out.println("Hacienda se queda " +misInteresesRetencion);
	System.out.println("A mi me corresponde " +(misIntereses - misInteresesRetencion) + "€");
	}
	

}