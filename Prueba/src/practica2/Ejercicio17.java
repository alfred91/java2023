package practica2;

import java.util.Random;

public class Ejercicio17 {

	public static String[] generarMesesAleatorios(int cantidad) {
		String[] mesesAleatorios = new String[cantidad];

		String[] meses = { "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
		for (int i = 0; i < cantidad; i++) {
			mesesAleatorios[i] = meses[(int) (Math.floor(Math.random() * ((meses.length - 1) - 0 + 1) + 0))];
		}
		return mesesAleatorios;
	}

	public static void imprimir(String[] mesesGenerados) {
		for (int i = 0; i < mesesGenerados.length; i++) {
			System.out.println(mesesGenerados[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] numAle = new int[] { 5,7,33,77,125 };
		
		Random r1=new Random();
		int n1=r1.nextInt(49)+1;
		
		
		Random r2=new Random();
		int n2=r2.nextInt(100)*2;
	
		Random r3=new Random();
		double n3=r3.nextDouble(10)+1;
		
		Random r4=new Random();
		int n4=r4.nextInt(100)-151;
		
		Random r5=new Random();
		int n5=r5.nextInt(200)-100;
		
		Random r6=new Random();
	    int numAle1 = r6.nextInt(numAle.length);
	    System.out.println(n1);	    
		System.out.println(n2);
	    System.out.println(n3);
	    System.out.println(n4);
	    System.out.println(n5);
	    System.out.println(numAle[numAle1]);
		imprimir(generarMesesAleatorios(1));
	}
}