package ejercicio2;

public class CuentaCorriente extends CuentaBancaria {

	private double modifComisiones = 0.4;
	
	public CuentaCorriente(double saldo, double comisiones) {
		super(saldo, true, true, comisiones);
		this.comisiones = this.comisiones * this.modifComisiones;
	}

	public CuentaCorriente(CuentaCorriente otra) {
		super(otra);
	}

	public double prestamoPreconcedido() {
		return this.saldo * 2;
	}
}