package ejercicio7;

import java.util.ArrayList;

public class Multimedia implements Reproducible {
    private String nombre;
    private int duracion;
    private int ano;
    private ArrayList<Autor> autores;
    private int reproducciones;
    public enum Genero {
        ROCK, POP, DISCO, SOUL, JAZZ, ELECTRONICA, METAL, CLASICA, LATINO, RAP}

    public Multimedia(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autores = new ArrayList<>();
        this.reproducciones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void removeAutor(Autor autor) {
        this.autores.remove(autor);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + nombre);
        this.reproducciones++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multimedia that = (Multimedia) o;

        if (duracion != that.duracion) return false;
        return nombre != null ? nombre.equals(that.nombre) : that.nombre == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + duracion;
        return result;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", autores=" + autores +
                '}';
    }
}