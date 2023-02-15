package pract9ej2;

import java.util.ArrayList;

public class Banco {
	
	private String nombre;
	private ArrayList<CuentaBancaria> cuentas;

	public Banco(String nombre) {
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
	
	public CuentaBancaria getCuenta(String numeroCuenta) {
//FORMA1. Buscando con indexOf con un objeto vacío solo con el número de cuenta
		CuentaBancaria cb=new CuentaBancaria (0,false,false,0);
		cb.setNumeroCuenta(numeroCuenta);
		
		int posicion=cuentas.indexOf(cb);
		if (posicion>=0)
			return cuentas.get(posicion);
		else
			return null;
		
	//FORMA2. Buscando yo directamente una cuenta con ese número de cuenta
				/*
				for(CuentaBancaria cb : this.cuentas) {
					if (cb.getNumeroCuenta().equals(numeroCuenta)) {
						return cb;
					}
				}
				
				return null;
				*/
	}

}