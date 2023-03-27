package ejemplos.clase;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Publicacion {

	enum Genero {NOVELA, POESÍA, DRAMA, ENSAYO};
	
	private String isbn;
	private int numCapitulos;
	private Genero genero;
	

	public Libro(String titulo, String editorial, LocalDate fechaPublicacion, int numPaginas, double precio, String isbn,
					int numCapitulos, Genero genero) {
		super(titulo, editorial, fechaPublicacion, numPaginas, precio);
		this.isbn = isbn;
		this.numCapitulos = numCapitulos;
		this.genero = genero;
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
	 * @return the numCapitulos
	 */
	public int getNumCapitulos() {
		return numCapitulos;
	}




	/**
	 * @param numCapitulos the numCapitulos to set
	 */
	public void setNumCapitulos(int numCapitulos) {
		this.numCapitulos = numCapitulos;
	}



	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}




	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titulo=");
		builder.append(titulo);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append(", fechaPublicacion=");
		builder.append(fechaPublicacion);
		builder.append(", numPaginas=");
		builder.append(numPaginas);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", numCapitulos=");
		builder.append(numCapitulos);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	

}
