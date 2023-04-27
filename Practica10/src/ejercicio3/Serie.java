package ejercicio3;

public class Serie implements Entregable{

    private String titulo;
    private int numTemporadas;
    private String genero;
    private String creador;
    private boolean prestado;

    // Constructor por defecto
    public Serie() {
        this.titulo = "";
        this.numTemporadas = 3;
        this.genero = "";
        this.creador = "";
        this.prestado = false;
    }

    // Constructor con título y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numTemporadas = 3;
        this.genero = "";
        this.creador = creador;
        this.prestado = false;
    }

    // Constructor con todos los atributos excepto prestado
    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.prestado = false;
    }

    // Constructor copia
    public Serie(Serie serie) {
        this.titulo = serie.titulo;
        this.numTemporadas = serie.numTemporadas;
        this.genero = serie.genero;
        this.creador = serie.creador;
        this.prestado = serie.prestado;
    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    // toString
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", prestado=" + prestado +
                '}';
    }

	public boolean isPrestado() {
		// TODO Auto-generated method stub
		return false;
	}

	public void entregar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean esPrestado() {
		// TODO Auto-generated method stub
		return false;
	}
}