package Ejercicio2;

public class Revista extends Publicacion implements Prestable {
	
private int numero;

public Revista(String isbn, int ano, int paginas, String titulo, int numero) {
	
	super(isbn, titulo, ano, paginas);
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
public void presta() {
	// TODO Auto-generated method stub
	
}

@Override
public void devuelve() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean estaPrestado() {
	// TODO Auto-generated method stub
	return false;
}

}
