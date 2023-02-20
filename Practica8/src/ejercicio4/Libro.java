package ejercicio4;
import java.util.*;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    private double precioCompra;
    private double precioVenta;
    private boolean vendido;

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.vendido = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
        this.vendido = true;
    }

    public boolean isVendido() {
        return vendido;
    }

    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numPaginas + " páginas.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return ISBN.equals(libro.ISBN);
    }
}
