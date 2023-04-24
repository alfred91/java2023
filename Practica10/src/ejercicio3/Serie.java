package ejercicio3;

<<<<<<< HEAD
public class Serie implements Engregable{

    // Atributos
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
}
=======
import java.util.Objects;

public class Serie implements Entregable {

	enum Genero {DRAMA, THRILLER, COMEDIA, ACCION, SCIFI};
	
	private String titulo;
	private int numTemporadas;
	private String creador;
	private boolean prestado;
	private Genero genero;
	
	
	
	public Serie() {
		super();
		this.titulo = "";
		this.numTemporadas = 3;
		this.creador = "";
		this.prestado = false;
		this.genero = Genero.ACCION;
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.creador = creador;
		this.prestado = false;
		this.genero = Genero.ACCION;
	}

	public Serie(String titulo, int numTemporadas, String creador, Genero genero) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.creador = creador;
		this.genero = genero;
		this.prestado = false;
	}
	
	public Serie(Serie otra) {
		this.titulo = otra.titulo;
		this.numTemporadas = otra.numTemporadas;
		this.creador = otra.creador;
		this.prestado = otra.prestado;
		this.genero = otra.genero;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the numTemporadas
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}

	/**
	 * @param numTemporadas the numTemporadas to set
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [titulo=");
		builder.append(titulo);
		builder.append(", numTemporadas=");
		builder.append(numTemporadas);
		builder.append(", creador=");
		builder.append(creador);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void entregar() {
		this.prestado = true;
		
	}

	@Override
	public void devolver() {
		this.prestado = false;
		
	}

	@Override
	public boolean esPrestado() {		
		return this.prestado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(titulo, other.titulo);
	}
}
>>>>>>> branch 'main' of https://github.com/alfred91/Java2023.git
