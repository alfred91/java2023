package ejemploEditorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Publicacion {
	


	private String isbn;
	enum Genero {NOVELA, POESIA, DRAMA, TERROR}
	private int numCapitulos; 
	private ArrayList<Autor> autor;
	private Genero genero;
	
	
	Libro(String titulo, String editorial, LocalDate fechaDePublicacion, int numPaginas, double precio, String isbn, int numCapitulos, Genero genero) {
		super(titulo, editorial, fechaDePublicacion, numPaginas, precio);
		// TODO Auto-generated constructor stub
	this.isbn=isbn;
	this.numCapitulos=numCapitulos;
	this.autor=autor;
	this.genero=genero;
	}

	



	public void addAutor(Autor a) {
		
		if (autores.indexOf(a) < 0 ) {
			autores.add(a);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [isbn=");
		builder.append(isbn);
		builder.append(", numCapitulos=");
		builder.append(numCapitulos);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append(", fechaDePublicacion=");
		builder.append(fechaDePublicacion);
		builder.append(", numPaginas=");
		builder.append(numPaginas);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}





	@Override
	public ArrayList<Autor> getAutores() {
		// TODO Auto-generated method stub
		return null;
	}
}
