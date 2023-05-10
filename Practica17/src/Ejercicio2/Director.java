package Ejercicio2;

import java.util.ArrayList;
import java.util.Objects;

public class Director {
	
	private int id;
	private String nombre;
	private ArrayList<Pelicula> peliculas;
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param paliculas
	 */

	Director(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.peliculas = new ArrayList<>();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the peliculas
	 */
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public void addPelicula(Pelicula p) {
		peliculas.add(p);
	}
	
	public void deletePelicula(Pelicula p) {
		peliculas.remove(p);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Director [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", peliculas=");
		builder.append(peliculas);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Director other = (Director) obj;
		return id == other.id;
	}
}