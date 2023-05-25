package com.daw.model;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EstacionMeteorologica implements Comparable<EstacionMeteorologica> {

	private long id;
	private String nombre;
	public enum Comunidad{ANDALUCIA,EXTREMADURA,MADRID,MURCIA,COMUNIDADVALENCIANA,
		CATALUNA,PAISVASCO,NAVARRA,ASTURIAS,GALICIA,CASTILLALAMANCHA,
		CASTILLALEON,ARAGON,LARIOJA,CANTABRIA,CEUTA,MELILLA,BALEARES,CANARIAS}
	public Comunidad comunidad;
	private double latitud;
	private double longitud;
	private TreeSet<RegistroDatosDia> registros;
	
	
	public EstacionMeteorologica() {
		super();
	}

	public EstacionMeteorologica(int id, String nombre, Comunidad comunidad, double latitud, double longitud,
			TreeSet<RegistroDatosDia> registros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.comunidad = comunidad;
		this.latitud = latitud;
		this.longitud = longitud;
		//this.lecturas = new TreeSet<>( (r1,r2) -> r1.getFecha().compareTo(r2.getFecha()) );
		this.registros = new TreeSet<>( Comparator.comparing(RegistroDatosDia::getFecha) );
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
	public Comunidad getComunidad() {
		return comunidad;
	}

	/**
	 * @param comunidad the comunidad to set
	 */
	public void setComunidad(Comunidad comunidad) {
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
	 * @return the registros
	 */
	public TreeSet<RegistroDatosDia> getRegistros() {
		return registros;
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
		builder.append(", registros=");
		builder.append(registros);
		builder.append("]");
		return builder.toString();
	}
	
	
	public void nuevoRegistro(RegistroDatosDia rdd) {
		
		this.registros.add(rdd);
	}
	
	
public void eliminarRegistro(RegistroDatosDia rdd) {
	
		this.registros.remove(rdd);
	}


public List<RegistroDatosDia> buscarRegistro(LocalDate fecha) {
	
	return this.registros.stream()
			.filter(rdd-> rdd.getFecha().isAfter(fecha))
			.collect(Collectors.toList());
	
}
	@Override
	public int compareTo(EstacionMeteorologica o) {
			
	return this.getNombre().compareTo(o.getNombre());
	}

}