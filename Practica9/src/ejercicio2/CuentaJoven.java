package ejercicio2;

public class CuentaJoven extends CuentaBancaria {

	private double modifComisiones = 0.25;

	public CuentaJoven(double saldo, double comisiones) {
		super(saldo, false, false, comisiones);
		this.comisiones = this.comisiones * this.modifComisiones;
	}

	public CuentaJoven(CuentaJoven otra) {
		super(otra);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaJoven [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisiones=");
		builder.append(comisiones);
		builder.append("]");
		return builder.toString();
	}

	public double prestamoPreconcedido() {
		return this.saldo * 1.5;
	}
}