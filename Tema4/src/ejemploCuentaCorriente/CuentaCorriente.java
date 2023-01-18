/**
 * 
 */
package ejemploCuentaCorriente;

/**
 * @author profesor
 *
 */
public class CuentaCorriente {

	private String numCuenta;
	private double saldo;
	
	public CuentaCorriente(double saldo) {
		super();
		this.numCuenta = CuentaCorriente.generarCuenta();
		this.saldo = saldo;
	}

	/**
	 * @return the numCuenta
	 */
	public String getNumCuenta() {
		return numCuenta;
	}

	/**
	 * @param numCuenta the numCuenta to set
	 */
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente [numCuenta=");
		builder.append(numCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	/**
	 * Método que genera un número de cuenta para el objeto
	 * @return
	 */
	private static String generarCuenta() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("ES00");
		int digito=0;
		for(int i=0; i<15; i++) {
			digito = (int) (Math.random() * 10);
			builder.append(digito);
		}
		
		return builder.toString();
		
	}
	
	/**
	 * Incrementa el saldo en la cantidad recibida como argumento
	 * @param cantidad
	 */
	public void ingreso(double cantidad) {
		
		this.saldo = this.saldo + cantidad;
	}
	
	
	/**
	 * Decrementa el saldo en la cantidad marcada.
	 * Si hay saldo suficiente devuelve un 1
	 * Si no hay suficiente saldo, no se resta y devuelve un 0
	 * @param cantidad
	 * @return
	 */
	public int cargo(double cantidad) {
		
		double resultado=0;
		resultado = this.saldo - cantidad;
		
		if (resultado > 0) {
			this.saldo = resultado;
			return 1;
		} else {
			return 0;
		}
	}
	
	
	/**
	 * Si hay saldo de la cuenta saliente suficiente restará la cantidad a su saldo y se lo incrementará a la otra cuenta.
	 * Devuelve 1.
	 * Si no hay saldo en la cuenta saliente no restará la cantidad ni la incrementará en la otra.
	 * Devuelve 0.
	 * @param cantidad
	 * @param otraCuenta
	 * @return
	 */
	public int transferencia(double cantidad, CuentaCorriente otraCuenta) {
		
		double resultado=0;
		resultado = this.saldo - cantidad;
		
		if (resultado > 0) {
			this.saldo = resultado; //Quito el dinero de mi cuenta
			otraCuenta.ingreso(cantidad);
			return 1;
		} else {
			return 0;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
