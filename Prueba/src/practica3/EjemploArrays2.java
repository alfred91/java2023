package practica3;

public class EjemploArrays2 {

	public static void main(String[] args) {
//saca el mayor y el menor de un array de 10 enteros
		
		int numeros[]=new int[10];
		int mayor=0;
		int menor=100;

		for (int i=0; i<numeros.length;i++ ) {
			numeros [i] =(int) (Math.random()*100)+1;
				System.out.print(numeros[i]+" ");
			
			if (numeros[i]> mayor) {
				mayor=numeros[i];
				} }
			System.out.println();
			
		for (int j = 0; j<numeros.length;j++ )
			{if (numeros[j]<menor) {menor=numeros[j]; } }
				System.out.println("Mayor: "+mayor+" Menor: "+menor);
	}
}