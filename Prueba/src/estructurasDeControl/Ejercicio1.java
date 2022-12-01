package estructurasDeControl;

public class Ejercicio1 {

	public static int mayor(int a, int b, int c) {
	int mayor=0;
		
		if (a>b&&a>c) {mayor=a;}
		
		else if (b>a&&b>c) {mayor=b;}
		
		else if(c>a&&c>b) {mayor=c;}
		
	return mayor;
	}	

	public static void main(String[]args) {
System.out.println(mayor(10,20,30));
	}
}