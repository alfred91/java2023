package ejemplos.arraylist;

import java.util.Objects;

public class Ingrediente {
	String nombre;
	int cantidad;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		return Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ingrediente [nombre=");
		builder.append(nombre);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}


	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	/**
	 * @param nombre
	 * @param cantidad
	 */
	public Ingrediente(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}


	public Ingrediente(Ingrediente otro) {
		this.nombre=otro.nombre;
		this.cantidad=otro.cantidad;
		
	}

}