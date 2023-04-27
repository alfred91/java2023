package ejercicio5;

import java.util.*;

public class Publicacion {

	protected String isbn;
	protected String titulo;
	protected int ano;
	protected int paginas;
	protected ArrayList<Autor> autores;
	
	 public Publicacion(String isbn, int paginas, int anio, String titulo) {
	        this.isbn = isbn;
	        this.titulo = titulo;
	        this.ano = anio;
	        this.paginas = paginas;
	        this.autores = new ArrayList<Autor>();
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
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
	
	 public void addAutor(String nombre, String apellidos) {
	        autores.add(new Autor(nombre, apellidos));
	    }

	    public void deleteAutor(String nombre, String apellidos) {
	        Autor autor = new Autor(nombre, apellidos);
	        autores.removeIf(a -> a.equals(autor));
	    }


	    
	/**
		 * @return the autores
		 */
		public ArrayList<Autor> getAutores() {
			return autores;
		}
	/**
		 * @param autores the autores to set
		 */
		public void setAutores(ArrayList<Autor> autores) {
			this.autores = autores;
		}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(autores);
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