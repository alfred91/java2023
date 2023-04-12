package Ejercicio2;

import java.util.TreeSet;

abstract class Publicacion implements Prestable, Comparable<Publicacion> {
    private String titulo;
    private int anioPublicacion;
    private boolean prestado;
    private TreeSet<Autor> autores;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
        this.autores = new TreeSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void addAutor(Autor autor) {
        autores.add(autor);
    }

    public void deleteAutor(Autor autor) {
        autores.remove(autor);
    }

    public TreeSet<Autor> getAutores() {
        return autores;
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public int compareTo(Publicacion publicacion) {
        return this.titulo.compareTo(publicacion.titulo);
    }
}
