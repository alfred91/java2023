package com.tienda.proyecto.modelos;

public enum IVA {
	
	GENERAL(21),REDUCIDO(10),SUPERREDUCIDO(4);
		
	private final int valor;
		
	private IVA(int valor) {
		this.valor=valor;
	}
	
	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
};