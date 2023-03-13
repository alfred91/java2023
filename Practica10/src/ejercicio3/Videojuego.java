package ejercicio3;

import java.util.Objects;

public class Videojuego implements Entregable {

	enum GeneroV { ACCION, DEPORTES, ROL, ESTRATEGIA, SIMULACION, SHOOTER, MMORPG };
	
	private String titulo;
	private int horasEstimadas;
	private GeneroV genero;
	private String desarrollador;
	private boolean prestado;
	
	public Videojuego() {
		super();
		this.titulo = "";
		this.horasEstimadas = 100;
		this.genero = GeneroV.ACCION;
		this.desarrollador = "";
		this.prestado = false;
	}

	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = GeneroV.ACCION;
		this.desarrollador = "";
		this.prestado = false;
	}

	public Videojuego(String titulo, int horasEstimadas, GeneroV genero, String desarrollador) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
		this.prestado = false;
	}
	
	public Videojuego(Videojuego otro) {
		super();
		this.titulo = otro.titulo;
		this.horasEstimadas =  otro.horasEstimadas;
		this.genero =  otro.genero;
		this.desarrollador =  otro.desarrollador;
		this.prestado = otro.prestado;
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
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	/**
	 * @return the genero
	 */
	public GeneroV getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(GeneroV genero) {
		this.genero = genero;
	}

	/**
	 * @return the desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * @param desarrollador the desarrollador to set
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Videojuego [titulo=");
		builder.append(titulo);
		builder.append(", horasEstimadas=");
		builder.append(horasEstimadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", desarrollador=");
		builder.append(desarrollador);
		builder.append(", prestado=");
		builder.append(prestado);
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
		Videojuego other = (Videojuego) obj;
		return Objects.equals(titulo, other.titulo);
	}
}