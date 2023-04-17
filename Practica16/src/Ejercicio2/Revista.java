package Ejercicio2;

public class Revista extends Publicacion {
private int numero;

public Revista(int isbn, int ano, int paginas, String titulo, int numero) {
	super(isbn, ano, paginas, titulo);
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

}
