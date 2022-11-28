package practica3;

public class EjemploArraysMultidimensionales1 {

	public static void main(String[] args) {
		
		double notas[]= {6.6,7,8.8,9,4};
		double media=0;
				
				for(int i=0; i<notas.length;i++) {
					media = media+notas[i];
				}
				
		System.out.println("la nota media es "+media/notas.length);
	}

}