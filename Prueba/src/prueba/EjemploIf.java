package prueba;

import java.util.Scanner;

public class EjemploIf {

	public static void main(String[] args) {
		// Variable Precio = 295
		// Variable IVA =1.25
		// Variable Cantidad = x
		//Calcular el precio final aplicando el iva,si la cantidad es mayor o igual que 5 no se aplica el IVA
		Scanner sc = new Scanner(System.in);
		int precio=295;
		double iva=1.25;
		int cantidad;
		double total;
		System.out.println("Precio: "+precio);
		System.out.println("Escribe la cantidad");
		cantidad=sc.nextInt();
		if (cantidad>=5) {
			total=precio*cantidad;
		}else {
			total=(cantidad*precio*iva);
		}
		System.out.println(+total);
	}

}