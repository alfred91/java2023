package pract9ej2;

public class CuentaJoven extends CuentaBancaria {
	
	private double modifComisiones=0.25;
	
	public CuentaJoven(double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisiones) {
		super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisiones);
		this.comisiones=this.comisiones*this.modifComisiones;
	}

	public CuentaJoven(CuentaJoven otra) {
		super(otra);
	}

}