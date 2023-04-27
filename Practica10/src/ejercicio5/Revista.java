package ejercicio5;

public class Revista extends Publicacion {
	
private int numero;

public Revista(String isbn, int ano, int paginas, String titulo, int numero) {
	
	super(isbn, numero, paginas, titulo);
	
	this.numero = numero;
}

/**
 * @return the numero
 */
public int getNumero() {
	return numero;
}

/**
 * @param numero the numero to set
 */
public void setNumero(int numero) {
	this.numero = numero;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Revista [isbn=");
	builder.append(isbn);
	builder.append(", titulo=");
	builder.append(titulo);
	builder.append(", ano=");
	builder.append(ano);
	builder.append(", paginas=");
	builder.append(paginas);
	builder.append(", autores=");
	builder.append(autores);
	builder.append(", numero=");
	builder.append(numero);
	builder.append("]");
	return builder.toString();
}

}
