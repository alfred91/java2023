package ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Disco extends Multimedia {
    private String titulo;
    private LocalDate fecha;
    private Autor grupo;
    private String discografica;
    private ArrayList<Cancion> canciones;

    public Disco(String titulo, LocalDate fecha, Autor grupo, String discografica) {
        super("", 0); // el nombre y duración se inicializan en el constructor de Multimedia
        this.titulo = titulo;
        this.fecha = fecha;
        this.grupo = grupo;
        this.discografica = discografica;
        this.canciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Autor getGrupo() {
        return grupo;
    }

    public void setGrupo(Autor grupo) {
        this.grupo = grupo;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void addCancion(Cancion cancion) {
        canciones.add(cancion);
        cancion.setDisco(this);
    }

    public void removeCancion(Cancion cancion) {
        canciones.remove(cancion);
        cancion.setDisco(null);
    }

    public int getDuracion() {
        int duracionTotal = 0;
        for (Cancion cancion : canciones) {
            duracionTotal += cancion.getDuracion();
        }
        return duracionTotal;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo disco: " + this.titulo);
        for (Cancion cancion : canciones) {
            cancion.reproducir();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disco: ").append(titulo);
        sb.append(", Fecha: ").append(fecha);
        sb.append(", Grupo: ").append(grupo.getNombre());
        sb.append(", Discográfica: ").append(discografica);
        sb.append(", Duración: ").append(getDuracion()).append(" segundos");
        sb.append(", Canciones: ").append(canciones);
        return sb.toString();
    }
}
