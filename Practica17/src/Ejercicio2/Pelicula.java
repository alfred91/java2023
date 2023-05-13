package Ejercicio2;

import java.util.*;

public class Pelicula {
	
	private int id;
	private String titulo;
	private int anio;
	private ArrayList<Genero> generos;
	private ArrayList<Director> directores;
	
	/**
	 * @param id
	 * @param titulo
	 * @param anio
	 * @param generos
	 * @param directores
	 */
	Pelicula(int id, String titulo, int anio) {

		this.id = id;
		this.titulo = titulo;
		this.anio = anio;

	}

	public Pelicula (String titulo, int anio) {
		
		this.titulo=titulo;
		this.anio=anio;
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
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the generos
	 */
	public ArrayList<Genero> getGeneros() {
		return generos;
	}

	/**
	 * @return the directores
	 */
	public ArrayList<Director> getDirectores() {
		return directores;
	}

	
	public void addGenero(Genero genero) {
	    if (this.generos == null) {
	        this.generos = new ArrayList<Genero>();
	    }
	    this.generos.add(genero);
	}
	
	public void deleteGenero (Genero g) {
		generos.remove(g);
	}
	
	public void addDirector(Director d) {
		if(this.directores == null) {
			this.directores=new ArrayList<>();
		}
		this.directores.add(d);
	}
	
	
	public void deleteDirector(Director d) {
		directores.remove(d);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(titulo);
		builder.append(", ");
		builder.append(anio);
		builder.append(" ");
		builder.append(generos);
		builder.append(" ");
		builder.append(directores);

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
		Pelicula other = (Pelicula) obj;
		return id == other.id;
	}

}