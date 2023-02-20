package ejercicio4;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libros;
    private double ganancias;

    public Libreria() {
        this.libros = new ArrayList<>(1000);
        this.ganancias = 0;
    }

    public void adquirir(Libro libro, double precioCompra) {
        libro.setPrecioCompra(precioCompra);
        libros.add(libro);
    }

    public void vender(Libro libro, double precioVenta) {
        libro.setPrecioVenta(precioVenta);
        ganancias += precioVenta - libro.getPrecioCompra();
    }

    public double calcularGanancias() {
        return ganancias;
    }
}