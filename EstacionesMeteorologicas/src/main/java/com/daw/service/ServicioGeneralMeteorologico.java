package com.daw.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.daw.model.EstacionMeteorologica;
import com.daw.model.EstacionMeteorologica.Comunidad;
import com.daw.model.RegistroDatosDia;

public class ServicioGeneralMeteorologico {

	private ArrayList<EstacionMeteorologica> estaciones;

	public ServicioGeneralMeteorologico() { //ARRAYLIST NO SE PONE ARRIBA, SE CREA DENTRO
		super();
		this.estaciones = new ArrayList<>();
	}

	/**
	 * @return the estaciones
	 */
	public ArrayList<EstacionMeteorologica> getEstaciones() { //SOLO GET, EL ARRYLIST YA LO CREA EL SET
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
	 *	Crea una estacion nueva si no hay
	 * @param em
	 * @throws Exception Cuando esta grabada
	 */
	public void crearEstacion(EstacionMeteorologica em) throws Exception {
		
		int posicion= this.estaciones.indexOf(em);		
		//no esta		
		if (posicion<0) {
			this.estaciones.add(em);
			
		} else { throw new Exception("Estacion ya esta grabada");
			
		}
	}
	/**
	 *	Borra una estacion
	 * @param em
	 */
	public void eliminarEstacion(EstacionMeteorologica em) {
		
		this.estaciones.remove(em);
	}
	/**
	 * 	Busca una estacion por nombre
	 * @param nombre
	 * @return
	 */
	public EstacionMeteorologica buscar(String nombre) {
		
		return this.estaciones.parallelStream()
				.filter(em-> em.getNombre().equals(nombre))
				.findFirst()
				.orElse(null);
	}
	
	/**
	 * 	Busca estacion por id
	 * @param id
	 * @return
	 */
	
	public EstacionMeteorologica buscar(int id) {
		return this.estaciones.parallelStream()
				.filter(em-> em.getId()==id)
				.findFirst()
				.orElse(null);
	}
	
	
	public List<RegistroDatosDia> getTempPorEstacion(int id){
		EstacionMeteorologica emt=this.estaciones.stream()
				.filter(em->em.getId()==id)
				.findFirst()
				.orElse(null);
		return emt.getRegistros().stream().collect(Collectors.toList());
		/*
		return this.estaciones.stream()
				.filter( em -> em.getId() == id)
				.flatMap( em -> em.getLecturas().stream())
				.collect(Collectors.toList());
		*/
	}
	
	
	public List<RegistroDatosDia> getTempPorAnioEstacion(int id, int anio){
		
		EstacionMeteorologica emt= this.estaciones.stream()
				.filter(em->em.getId()==id)
				.findFirst()
				.orElse(null);
		
		return emt.getRegistros().stream()
				.filter(rdd-> rdd.getFecha().getYear()==anio)
				.collect(Collectors.toList());
		
	}
	
	public List<RegistroDatosDia> getTempPorComunidad(Comunidad comunidad) {
		
	    return this.estaciones.stream()   		
	        .filter(em -> em.getComunidad() == comunidad)
	        .flatMap(em -> em.getRegistros().stream())
	        .collect(Collectors.toList());
	}
	
	public RegistroDatosDia getTempMaxRegistrada() {
		
		return this.estaciones.stream()
				.flatMap(em-> em.getRegistros().stream())
				.collect(Collectors.maxBy(Comparator.comparing(RegistroDatosDia::getTempMax)))
				.orElse(null);
	}
	
	public Map<Comunidad, List<EstacionMeteorologica>> getEstacionesPorComunidad(){
	
		return this.estaciones.stream()
				.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad));
	}
	
	public Boolean isTempMediaAlta() {
		return this.estaciones.stream()
				.flatMap(em-> em.getRegistros().stream())
				.anyMatch(rdd-> rdd.getTempMax()>=30);
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
	public void borrarEstacionesComunidad(Comunidad c) {
		this.estaciones.stream()
			.filter(e -> e.getComunidad().equals(c))
			.forEach( e -> this.eliminarEstacion(e));
	}
	/* SI FUERA STRING
	 * public void borrarEstacionesComunidad(String comunidad) {
		this.estaciones.stream()
			.filter(e -> e.getComunidad().equals(comunidad))
			.forEach( e -> this.eliminarEstacion(e));
	}
	 */
	
	public Map<Comunidad, Long> getNumRegistros() {
		return this.estaciones.stream()
			.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad, Collectors.counting()));
	}
}
