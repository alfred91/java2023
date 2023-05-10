package Ejercicio2;

import java.util.ArrayList;
import java.util.Objects;

class Genero {
	
    protected int id;
    protected String nombre;
	/**
	 * @param id
	 * @param nombre
	 */
	Genero(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Genero [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return id == other.id;
	}

    
}