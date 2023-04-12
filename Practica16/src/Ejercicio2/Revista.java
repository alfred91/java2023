package Ejercicio2;

class Revista extends Publicacion {
	
    private int numero;

    public Revista(String titulo, int anioPublicacion, int numero) {
        super(titulo, anioPublicacion);
        this.numero = numero;
    }
}