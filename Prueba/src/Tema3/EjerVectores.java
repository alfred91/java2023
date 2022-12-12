package Tema3;

public class EjerVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tabla =new int[10];
		for (int i=0; i<8; i++) {
			tabla[i]= (int) (Math.random()-10+1);
		}
		for (int i=0; i<tabla.length; i++) {
			System.out.println(tabla[i]+" ");
		}
		System.out.println();
		//Pedirlo por teclado
		int numero=3;
		int posicion=3;
		//Empezamos por el final
		for (int i=tabla.length-1;i>posicion;i--) {
			tabla[i]=tabla[i-1];
		}
		
		tabla[3] =numero;
			for (int i=0;i<tabla.length;i++) {
				System.out.println(tabla[i]+" ");
			}
		
		}
	}


