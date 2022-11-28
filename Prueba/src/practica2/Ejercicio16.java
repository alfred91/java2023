package practica2;

public class Ejercicio16 {

	public static void main(String[] args) {
	double diametro=15.5;
	double altura=42.2;
		
	double volumen=Math.PI*Math.pow((diametro/2),2)*altura;
	double area=2*Math.PI*(diametro/2)*((diametro/2)+altura);
	System.out.println("El volumen es : "+volumen+" m3");
	System.out.println("El área es : "+area+" metros");
	}
}
