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
			
			boolean c=true;
			c=a<b&&c;
			System.out.println(c);
			
		 // c = a < b && c; ESTA NO SE COMO SE ARREGLA, ME SUGIERE ALGO DE BOOLEAN
		
		//x=a/b;
		//hay que definir x como una variable de tipo numero entero
		int x = a/b;
			System.out.println(x);
	
		d=a+b++;//++DESPUES SIGNIFICA QUE LA OPERACION SE VA A REALIZAR DESPUES DEL PUNTO Y COMA**	// Se suma uno a la b y despues se suma con a
	
			System.out.println(d);
		
		e=++a-b; // Se le suma primero 1 a la a y luego se resta b
			System.out.println(e);
			
		//	y=(float)a/b;
		// Hay que definir y como float antes de asignarle el valor, haciendo esto, te saca el real de a=10 / b=3
		float y = (float)a/b;
			System.out.println(y);
			}
	}