package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {

	protected int id;
	protected String nombre;
	protected Continente continente;
	protected double superficie;
	protected long poblacion;
	protected Ciudad capital;
	List<Ciudad> ciudades;

	enum Continente {EUROPA,AMERICA,ASIA,OCEANIA,AFRICA}

	public Pais(int id, String nombre, Continente continente, double superficie, long poblacion, Ciudad capital ) {

		this.id = id;
		this.nombre = nombre;
		this.continente = continente;
		this.superficie = superficie;
		this.poblacion = poblacion;
		this.capital = capital;
		this.ciudades=new ArrayList<Ciudad>();

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
	 * @return the continente
	 */
	public Continente getContinente() {
		return continente;
	}

	/**
	 * @param continente the continente to set
	 */
	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the poblacion
	 */
	public long getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the capital
	 */
	public Ciudad getCapital() {
		return capital;
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(Ciudad capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pais [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", continente=");
		builder.append(continente);
		builder.append(", superficie=");
		builder.append(superficie);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", capital=");
		builder.append(capital);
		builder.append(", ciudades=");
		builder.append(ciudades);
		builder.append("]");
		return builder.toString();
	}
	
	public void addCiudad (Ciudad ciudad) {
		ciudades.add(ciudad);
	}
	
	public void deleteCiudad(Ciudad ciudad) {
		ciudades.remove(ciudad);
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
		Pais other = (Pais) obj;
		return id == other.id;
	}

	public List<Ciudad> getCiudades() {
		// TODO Auto-generated method stub
		return ciudades;
	}

}