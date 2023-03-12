package ejemploEditorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Revista extends Publicacion {

	
	enum Tematica{HISTORIA, GEOGRAFIA, BIOLOGIA, MATEMATICAS, FILOSOFIA, DERECHO, CIENCIA}
	
	private int numero;
	private Tematica tematica;
	private ArrayList<Articulo> articulos;
	
	
	public Revista(String titulo, String editorial, LocalDate fechaDePublicacion, int numPaginas, double precio,
			int numero, Tematica tematica) {
		super(titulo, editorial, fechaDePublicacion, numPaginas, precio);
		this.numero=numero;
		this.tematica=tematica;
		this.articulos=new ArrayList<>();		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [numero=");
		builder.append(numero);
		builder.append(", tematica=");
		builder.append(tematica);
		builder.append(", articulos=");
		builder.append(articulos);
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

	/**
	 * @return the articulos
	 */
	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	@Override
	public ArrayList<Autor> getAutores() {
		
		// Recorrer todos los articulos sacar el autor de cada uno y meterlo en un arraylist a devolver
		
		
		ArrayList<Autor>autores= new ArrayList<>();
		
		for (Articulo ar: this.articulos) {
			autores.add(ar.getAutor());
		}
		
		return autores;
	}

	/**
	 * @return the tematica
	 */
	public Tematica getTematica() {
		return tematica;
	}

	/**
	 * @param tematica the tematica to set
	 */
	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}
}