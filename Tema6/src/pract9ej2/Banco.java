package pract9ej2;

import java.util.ArrayList;

public class Banco {
	private String nombre;

	private ArrayList<CuentaBancaria> cuentas;
/**
	 * @param nombre
	 */
	Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.cuentas=new ArrayList<>();
	}
	public void addCuentaBancaria(CuentaBancaria cb) {
		int posicion= cuentas.indexOf(cb);
		//Solo se añade si la cuenta no esta en el banco
		if (posicion<0) {
			cuentas.add(cb);
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [nombre=");
		builder.append(nombre);
		builder.append(", cuentas=/n");
		
		for(CuentaBancaria cb: this.cuentas)
			builder.append(cb.toString());
			
		//builder.append(cuentas);
		
			builder.append("]");
			return builder.toString();
	}

}