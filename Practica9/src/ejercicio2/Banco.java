package ejercicio2;

import java.util.ArrayList;

public class Banco {

	private String nombre;
	private ArrayList<CuentaBancaria> cuentas;
	
	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.cuentas = new ArrayList<>();
	}
	
	public void addCuenta(CuentaBancaria cb) {
		int posicion = cuentas.indexOf(cb);
		//Solo añado si la cuenta no está ya en el banco
		if (posicion < 0) {
			cuentas.add(cb);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco = ");
		builder.append(nombre);
		builder.append("\n");
		
		for(CuentaBancaria cb: this.cuentas) {
			builder.append(cb.toString());
			builder.append("\n");
		}
		
		return builder.toString();
	}
	
	/**
	 * Buscar si está la cuenta en el ArrayList de cuentas
	 * @param numeroCuenta
	 * @return
	 */
	public CuentaBancaria getCuenta(String numeroCuenta) {
		
		//FORMA1. Buscando con indexOf con un objeto vacío solo con el número de cuenta
		/*
		CuentaBancaria cb = new CuentaBancaria(0, false, false, 0);
		cb.setNumeroCuenta(numeroCuenta);
		
		int posicion = cuentas.indexOf(cb);
		if (posicion >= 0)
			return cuentas.get(posicion);
		else
			return null;
		*/

		//FORMA2. Buscando yo directamente una cuenta con ese número de cuenta

		for(CuentaBancaria cb : this.cuentas) {
			if (cb.getNumeroCuenta().equals(numeroCuenta)) {
				return cb;
			}
		}
		
		return null;
	}


	public void mostrarPrestamosPreconcedidos() {
		for(CuentaBancaria cb: this.cuentas) {
			System.out.println(cb.prestamoPreconcedido());
		}
	}
}