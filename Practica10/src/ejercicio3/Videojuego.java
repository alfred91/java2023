package ejercicio3;

public class Videojuego {

    // Atributos
    private String titulo;
    private int horasEstimadas;
    private String genero;
    private String desarrollador;
    private boolean prestado;

    // Constructor por defecto
    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 100;
        this.genero = "";
        this.desarrollador = "";
        this.prestado = false;
    }

    // Constructor con título y horas estimadas
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "";
        this.desarrollador = "";
        this.prestado = false;
    }

    // Constructor con todos los atributos excepto prestado
    public Videojuego(String titulo, int horasEstimadas, String genero, String desarrollador) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.desarrollador = desarrollador;
        this.prestado = false;
    }

    // Constructor copia
    public Videojuego(Videojuego videojuego) {
        this.titulo = videojuego.titulo;
        this.horasEstimadas = videojuego.horasEstimadas;
        this.genero = videojuego.genero;
        this.desarrollador = videojuego.desarrollador;
        this.prestado = videojuego.prestado;
    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    // Métodos de la interfaz Entregable
    public void entregar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public boolean isPrestado() {
        return this.prestado;
    }
    // toString
    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", genero='" + genero + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
