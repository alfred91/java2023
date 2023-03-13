package ejercicio3;

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
