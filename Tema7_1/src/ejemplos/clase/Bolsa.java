package ejemplos.clase;

import java.util.ArrayList;

public class Bolsa<T extends Number, U extends CharSequence > {

	private ArrayList<T> bolsa;
	private int cantidad;
	private U otro;
	
	public Bolsa() {
		super();
		this.bolsa = new ArrayList<>();
		this.cantidad = 0;
	}

	/**
	 * @return the bolsa
	 */
	public ArrayList<T> getBolsa() {
		return bolsa;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	
	public void nuevo(T elemento) {
		bolsa.add(elemento);
		this.cantidad++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bolsa [bolsa=");
		builder.append(bolsa);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
