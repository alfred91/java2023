package ejemplos.herencia;

import java.util.ArrayList;

public class TestFigura {

	public static void main(String[] args) {
		
		
		Circulo c1 = new Circulo("amarillo", "f2", 4.5, 3.5);
		Cuadrado cu1 = new Cuadrado("verde", "f3", 10);
		Rectangulo r1 = new Rectangulo("naranja", "f4", 12, 5);
		CuadradoH cuh1 = new CuadradoH("marrón", "f5", 10);
		
		System.out.println(c1.getArea());
		System.out.println(cu1.getArea());
		System.out.println(r1.getArea());
		System.out.println(cuh1.getArea());
		
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(c1);
		figuras.add(cu1);
		figuras.add(r1);
		figuras.add(cuh1);
		
		for(Figura f: figuras) {
			System.out.println(f.getId() + "  " + f.getArea());
		}
		

	}

}
