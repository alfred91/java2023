package Ejercicio2;

class Libro extends Publicacion {
	
    private int numeroPaginas;

    public Libro(String titulo, int anioPublicacion, int numeroPaginas) {
        super(titulo, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
