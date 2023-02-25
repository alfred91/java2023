package ejercicio1;

import ejercicio2.Banco;
import ejercicio2.CuentaAhorro;
import ejercicio2.CuentaCorriente;
import ejercicio2.CuentaJoven;

public class Aplicacion {

	public static void main(String[] args) {
		
		//CuentaBancaria cb1 = new CuentaBancaria(10000, true, false, 100);
		CuentaAhorro ca1 = new CuentaAhorro(3000, 50, 0.02);
		CuentaCorriente cc1 = new CuentaCorriente(5000, 80);
		CuentaJoven cj1 = new CuentaJoven(1000, 40);

		Banco b1 = new Banco("La Caixa");
		//mibbba.addCuenta(cb1);
		b1.addCuenta(ca1);
		b1.addCuenta(cc1);
		b1.addCuenta(cj1);

		System.out.println(b1);

		b1.mostrarPrestamosPreconcedidos();
	}

}
