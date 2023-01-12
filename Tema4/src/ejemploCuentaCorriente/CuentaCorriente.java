package ejemploCuentaCorriente;

public class CuentaCorriente {
	
private String numCuenta;
private double saldo;


public CuentaCorriente(double saldo) {
	super();
	this.numCuenta= CuentaCorriente.generarCuenta();
	this.saldo=saldo;
}

public String getNumCuenta() {
	return numCuenta;
}

public void setNumCuenta(String numCuenta) {
	this.numCuenta = numCuenta;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public CuentaCorriente(String numCuenta, double saldo) {
	super();
	this.numCuenta = numCuenta;
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

private static String generarCuenta() {
	StringBuilder builder= new StringBuilder();
	builder.append("ES00");
	int digito=0;
	for (int i=0;i<15;i++) {
		digito=(int) (Math.random()*10);
		builder.append(digito);
	}
	return builder.toString();
}
/**
Incrementa el saldo en la canticdad recibida como argumento @param cantodad
*/

public void ingreso (double cantidad) {
	
	this.saldo=this.saldo+cantidad;
}
/**Incrementa el saldo en la cantidad marcada
 * Si hay saldo suficiente devuelve un uno
 * Si no hay suficiente no se resta y devuelve un 0
 * @param cantidad
 * @return
 */

public int cargo(double cantidad) {
	double resultado=0;
	resultado = this.saldo-cantidad;
	if (resultado>0) {
		this.saldo=resultado;
		return 1;
	} else {return 0;	}	
}

/** Si hay saldo de la cuenta saliente suficiente restara la cantidad a su saldo y se lo incrementara a la otra cuenta 
 * Devuelve 1
 * Si no hay saldo en la cuenta saliente no restara la cantidad ni la incrementara en la otra
 * Devuelve 0
 * @param cantidad
 * @param otraCuenta
 * @return
 * @param cantidad
 * @param otra
 * @return
 */
public int transferencia (double cantidad, CuentaCorriente otraCuenta) {
	
	double resultado=0;	
	resultado = this.saldo - cantidad;
	
	if (resultado >0 ) {
		this.saldo= resultado;
		otraCuenta.ingreso(cantidad); return 1;} 
			else {return 0;}
	}

}