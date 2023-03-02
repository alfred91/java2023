package ejemploEditorial;

import java.util.Objects;

public class Articulo {
	private String titulo;
	private Autor autor;
	private String tipo;
	/**
	 * @param titulo
	 * @param autor
	 * @param tipo
	 */
	Articulo(String titulo, Autor autor, String tipo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
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
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articulo [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", tipo=");
		builder.append(tipo);
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
		Articulo other = (Articulo) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
}
