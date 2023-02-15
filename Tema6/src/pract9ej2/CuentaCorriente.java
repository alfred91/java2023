package pract9ej2;

public class CuentaCorriente extends CuentaBancaria {

	private double modifComisiones=0.4;
	
	public CuentaCorriente(double saldo, double comisiones) {
		super(saldo, true, true, comisiones);
		
		this.modifComisiones = this.modifComisiones * this.modifComisiones;
		
	}

	public CuentaCorriente(CuentaCorriente otra) {
		
		super(otra);
	
	}

}
