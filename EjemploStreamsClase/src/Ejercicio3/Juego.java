package Ejercicio3;

import java.util.Objects;

public class Juego  {

	private String nombre;
	private String plataforma;
	
	public Juego(String nombre, String plataforma) {
		super();
		this.nombre = nombre;
		this.plataforma = plataforma;
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
	 * @return the plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

	/**
	 * @param plataforma the plataforma to set
	 */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nombre);
		builder.append(" - ");
		builder.append(plataforma);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, plataforma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(plataforma, other.plataforma);
	}

}