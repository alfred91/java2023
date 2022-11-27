package practica2;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		// int a = 10, b = 3 , e = 1, d, e;
		//e se ha asignado previamente a 1		
		int a = 10, b = 3 , e = 1, d;
			System.out.println(a+" "+b+" "+e);

		//float x, y;
		//hay que definir las variables para que muestre algo
		float x1=1,y1=2;
			System.out.println(x1+""+y1);
			
		 // c = a < b && c; ESTA NO SE COMO SE ARREGLA, ME SUGIERE ALGO DE BOOLEAN
		
		//x=a/b;
		//hay que definir x como una variable de tipo numero entero
		int x = a/b;
			System.out.println(x);
	
		d=a+b;	//d=a+b++; aqui suma a=10 + b=3, el ++ sobra
			System.out.println(d);
		
		e=a-b;	//e=++a-b; aqui resta a=10 - b=3, el ++ sobra
			System.out.println(e);
			
		//	y=(float)a/b;
		// Hay que definir y como float antes de asignarle el valor, haciendo esto, te saca el real de a=10 / b=3
		float y = (float)a/b;
			System.out.println(y);
			}
	}