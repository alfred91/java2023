package prueba;

public class ControlExcepcion {

public static double dividir(double num1, double num2) {
	return num1/num2;
	if (num2==0) {
throw new ArithmeticException ("Division por czero by JJ");}
	
			return -1;
		}

	public static void main(String[] args) {
int numero = 5;
try {
	System.out.println("Voy a intentar hacer una difvision por cero");
	numero = numero / 0;
	System.out.println("Si llegas aqui, has podido dividir por cero");
}
catch (Exception e) {System.out.println("Error division por cero " + e.getMessage());
} 


//CONVERTIR CADENA A ENTERO
String cadena ="23a";
int num=0;
try {
num = Integer.parseInt(cadena);
}
catch(NumberFormatException e) {
System.out.println("No se puede convertir una cadena a entero");
	}
System.out.println(num);

System.out.println(dividir(3,0));
	} }