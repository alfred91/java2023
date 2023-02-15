package ana;
public class Calculadora {
	//métodos
	public static int suma(int a , int b) {
		return a + b;
	}
	public static int resta(int a , int b) {
		return a - b;
	}
	public static int producto(int a , int b) {
		return a * b;
	}
	public static float division (float a , float b) {
		return a / b;
	}
	public static void main(String args[]) {
		int a=  7, b = 3;
		System.out.println("a+b= "+suma(a,b));
		System.out.println("a-b= "+resta(a,b));
		System.out.println("a*b= "+producto(a,b));
		System.out.println("a/b= "+division(a,b));
	}
}

