package com.daw.meteo.servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.daw.meteo.modelos.EstacionMeteorologica;
import com.daw.meteo.modelos.RegistroDatosDia;

public class ServicioGeneralMeteorologico {
	
	private List<EstacionMeteorologica> estaciones;

	public ServicioGeneralMeteorologico() {
		super();
		this.estaciones = new ArrayList<>();
	}

	/**
	 * @return the estaciones
	 */
	public List<EstacionMeteorologica> getEstaciones() {
		return estaciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServicioGeneralMeteorologico [estaciones=");
		builder.append(estaciones);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * Añade una EstacionMeteorologica si no estaba ya en las estaciones guardadas
	 * @param em
	 * @throws Exception cuando intentas grabar una EstacionMeteorologica que ya estaba guardada
	 */
	public void nuevaEstacion(EstacionMeteorologica em) throws Exception {
		
		int posicion = this.estaciones.indexOf(em);
		//No está
		if (posicion < 0) {
			this.estaciones.add(em);
		} else {
			throw new Exception("Estación ya está grabada");
		}		
	}
	
	/**
	 * Elimina una EstacionMeteorologica de la lista de estaciones en caso de que esté, sino no hace nada
	 * @param em
	 */
	public void eliminarEstacion(EstacionMeteorologica em) {
		this.estaciones.remove(em);
	}
	
	/**
	 * Busca una EstacionMeteorologica por nombre en la lista de estaciones
	 * @param nombre
	 * @return La estación si la encuentra, o null si no lo encuentra
	 */
	public EstacionMeteorologica buscar(String nombre) {
		//Esto para que funcione, el equals de EstacionMeteorologica debe ser por nombre
		/*
		Collections.sort(this.estaciones);
		EstacionMeteorologica emt = new EstacionMeteorologica();
		emt.setNombre(nombre);
		int posicion = Collections.binarySearch(this.estaciones, emt);
		 */
		
		return this.estaciones.parallelStream()
			.filter( em -> em.getNombre().equals(nombre))
			.findFirst()
			.orElse(null);
		
	}
	
	
	public EstacionMeteorologica buscarPorId(int id) {
		
		return this.estaciones.parallelStream()
			.filter( em -> em.getId() == id)
			.findFirst()
			.orElse(null);		
	}
	
	
	public List<RegistroDatosDia>  getTempPorEstacion(int id) {
		
		EstacionMeteorologica emt = this.estaciones.stream()
			.filter( em -> em.getId() == id)
			.findFirst()
			.orElse(null);
		
		return emt.getLecturas().stream().collect(Collectors.toList());		
		
		/*
		return this.estaciones.stream()
				.filter( em -> em.getId() == id)
				.flatMap( em -> em.getLecturas().stream())
				.collect(Collectors.toList());
		*/
	}
	
	
	
	public List<RegistroDatosDia>  getTempPorAnioEstacion(int id, int anio) {
		
		EstacionMeteorologica emt = this.estaciones.stream()
			.filter( em -> em.getId() == id)
			.findFirst()
			.orElse(null);
		
		return emt.getLecturas().stream()
				.filter(rdd -> rdd.getFecha().getYear() == anio)
				.collect(Collectors.toList());		
	
	}
	
	
	public List<RegistroDatosDia> getTempPorComunidad(String comunidad) {
		return this.estaciones.stream()
			.filter( em -> em.getComunidad().equals(comunidad))
			.flatMap( em -> em.getLecturas().stream() )			
			.collect(Collectors.toList());
	}
	

	public RegistroDatosDia getTempMaxRegistrada() {
		return this.estaciones.stream()
			.flatMap( em -> em.getLecturas().stream() )
			.collect(Collectors.maxBy( Comparator.comparing(RegistroDatosDia::getTempMax)))
			.orElse(null);			
	}

	
	public Map<String, List<EstacionMeteorologica>> getEstacionesPorComunidad() {
		return this.estaciones.stream()
			.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad));
		
	}
	
	
	public Boolean isTempMediaAlta() {
		return this.estaciones.stream()
				.flatMap( em -> em.getLecturas().stream() )
				.anyMatch( rdd -> rdd.getTempMax() >= 30);
	}
	
	/*
	public Map<String, Double> getTempMaxPorComunidad() {
		return this.estaciones.stream()
				.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad, em -> {
					RegistroDatosDia rddmax = em.getLecturas().stream()
							.collect(Collectors.maxBy( Comparator.comparing(RegistroDatosDia::getTempMax))).orElse(null);
					return rddmax.getTempMax();
				}));
	}
	*/
	
	public void borrarEstacionesComunidad(String comunidad) {
		this.estaciones.stream()
			.filter(e -> e.getComunidad().equals(comunidad))
			.forEach( e -> this.eliminarEstacion(e));
	}
	
	public Map<String, Long> getNumRegistros() {
		return this.estaciones.stream()
			.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad, Collectors.counting()));
	}
	
	

}
