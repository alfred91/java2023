package ejercicio5;

import java.util.Objects;

public class Publicacion {

	protected int isbn;
	protected int ano;
	protected int paginas;
	protected String titulo;
	
	public Publicacion(int isbn, int ano, int paginas, String titulo) {
		super();
		this.isbn = isbn;
		this.ano = ano;
		this.paginas = paginas;
		this.titulo = titulo;
	}
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}
	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", titulo=");
		builder.append(titulo);
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