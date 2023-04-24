package Ejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param fechaNac
	 * @param telefono
	 * @param direccion
	 */
	Usuario(String nombre, String apellidos, LocalDate fechaNac, long telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	private String nombre;
	private String apellidos;
	private LocalDate fechaNac;
	private long telefono;
	private String direccion;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the fechaNac
	 */
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	/**
	 * @return the telefono
	 */
	public long getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNac=");
		builder.append(fechaNac);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
}
