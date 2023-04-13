package Ejercicio2;

import java.util.ArrayList;
import java.util.TreeSet;

interface Prestable {

    void prestar();
    void devolver();
    boolean prestado();
}

interface Comparable<T> {
    int compareTo(T obj);
}
class Autor implements Comparable<Autor> {
    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int compareTo(Autor autor) {
        return this.apellido.compareTo(autor.apellido);
    }
}