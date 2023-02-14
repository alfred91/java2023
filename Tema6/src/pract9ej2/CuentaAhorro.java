package pract9ej2;

public class CuentaAhorro extends CuentaBancaria {
private double comisiones;
	/**
	 * @param otra
	 */
	CuentaAhorro(CuentaBancaria otra) {
		super(otra);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisiones
	 */
	CuentaAhorro(String numeroCuenta, double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisiones) {
		super(numeroCuenta, saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisiones);
		// TODO Auto-generated constructor stub
	}

}
