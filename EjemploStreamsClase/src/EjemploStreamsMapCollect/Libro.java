package EjemploStreamsMapCollect;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String autor;
	private Integer numPaginas;
	
	public Libro(String titulo, String autor, Integer numPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
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
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numPaginas
	 */
	public Integer getNumPaginas() {
		return numPaginas;
	}

	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", numPaginas=");
		builder.append(numPaginas);
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
		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	
}