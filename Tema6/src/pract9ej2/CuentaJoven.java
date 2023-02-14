package pract9ej2;

public class CuentaJoven extends CuentaBancaria {
	
	private double modifComisiones=0.25;
	

	public CuentaJoven(String numeroCuenta, double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisiones) {
		super(numeroCuenta, saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisiones);
		this.comisiones=this.comisiones*this.modifComisiones;
		// TODO Auto-generated constructor stub
	}

	public CuentaJoven(CuentaJoven otra) {
		super(otra);
		// TODO Auto-generated constructor stub
	}

}
