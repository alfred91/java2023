package com.daw.meteo.modelos;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EstacionMeteorologica implements Comparable<EstacionMeteorologica> {

	private long id;
	private String nombre;
	private String comunidad; //enum
	private double latitud;
	private double longitud;
	private Set<RegistroDatosDia> lecturas;
	
	
	public EstacionMeteorologica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstacionMeteorologica(long id, String nombre, String comunidad, double latitud, double longitud) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.comunidad = comunidad;
		this.latitud = latitud;
		this.longitud = longitud;
		//this.lecturas = new TreeSet<>( (r1,r2) -> r1.getFecha().compareTo(r2.getFecha()) );
		this.lecturas = new TreeSet<>( Comparator.comparing(RegistroDatosDia::getFecha) );
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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
	 * @return the comunidad
	 */
	public String getComunidad() {
		return comunidad;
	}

	/**
	 * @param comunidad the comunidad to set
	 */
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the lecturas
	 */
	public Set<RegistroDatosDia> getLecturas() {
		return lecturas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstacionMeteorologica [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", comunidad=");
		builder.append(comunidad);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append(", lecturas=");
		builder.append(lecturas);
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
		EstacionMeteorologica other = (EstacionMeteorologica) obj;
		return id == other.id;
	}
	
	
	/**
	 * Añade un RegistroDatosDia a las lecturas de esta Estación Meteorológica
	 * @param rdd
	 */
	public void nuevoRegistro(RegistroDatosDia rdd) {
		this.lecturas.add(rdd);
	}
	
	/**
	 * Elimina un RegistroDatosDia de las lecturas de esta Estación Meteorológica
	 * @param rdd
	 */
	public void eliminarRegistro(RegistroDatosDia rdd) {
		this.lecturas.remove(rdd);
	}
	
	/**
	 * Devuelve todos los registros de esta Estación Meteorológica que se tomaron a partir del día indicado
	 * @param fecha
	 * @return
	 */
	public List<RegistroDatosDia> buscarRegistro(LocalDate fecha) {
		
		return this.lecturas.stream()
			.filter( rdd -> rdd.getFecha().isAfter(fecha))
			.collect(Collectors.toList());
	}

	@Override
	public int compareTo(EstacionMeteorologica arg0) {
		return this.getNombre().compareTo(arg0.getNombre());
	}

	
	
	
	
	
	
}
