package pract9ej2;

public class CuentaCorriente extends CuentaBancaria {

	private double modifComisiones=0.4;
	
	public CuentaCorriente(String numeroCuenta, double saldo,
			double comisiones) {
		super(numeroCuenta, saldo, true,true, comisiones);
		this.modifComisiones=this.modifComisiones*this.modifComisiones;
		
		// TODO Auto-generated constructor stub
	}

	public CuentaCorriente(CuentaCorriente otra) {
		
		super(otra);
		// TODO Auto-generated constructor stub
	}

}
