package ejercicio7;

import java.time.LocalDate;

public class Podcast extends Multimedia {
	
    private LocalDate fecha;
    private int capitulo;

    public Podcast(String nombre, int duracion, LocalDate fecha, int capitulo) {
        super(nombre, duracion);
        this.fecha = fecha;
        this.capitulo = capitulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + this.getNombre() + " en " + fecha + ", capítulo " + capitulo);
        Cancion.incrementarReproducciones();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Fecha: ").append(fecha);
        sb.append(", Capítulo: ").append(capitulo);
        return sb.toString();
    }
}
