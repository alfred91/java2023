package ejemplos.clase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Publicacion {

	protected String titulo;
	protected String editorial;
	protected LocalDate fechaPublicacion;
	protected int numPaginas;
	protected double precio;
	
	public Publicacion(String titulo, String editorial, LocalDate fechaPublicacion, int numPaginas, double precio) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
		this.fechaPublicacion = fechaPublicacion;
		this.numPaginas = numPaginas;
		this.precio = precio;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the fechaPublicacion
	 */
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	/**
	 * @param fechaPublicacion the fechaPublicacion to set
	 */
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	/**
	 * @return the numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}

	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [titulo=");
		builder.append(titulo);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append(", fechaPublicacion=");
		builder.append(fechaPublicacion);
		builder.append(", numPaginas=");
		builder.append(numPaginas);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}	
}
