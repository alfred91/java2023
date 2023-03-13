package examen2021;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Vehiculo {
	
	protected String matricula;
	protected String marca;
	protected LocalDateTime fechaEntrada;
	protected int minutos;
	protected PlazaAparcamiento plaza;
	

	public Vehiculo() { 	//	DEFECTO
		super(); 		
		this.matricula = "";
		this.marca = "";
		this.fechaEntrada = null;
		this.minutos = 0;
		this.plaza = null;
	}

	public Vehiculo(String matricula, String marca) { 	//	PARAMETRIZADO
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.fechaEntrada = LocalDateTime.now();
		this.minutos = 0;
		this.plaza = null;
	}
	
	public Vehiculo(Vehiculo otro) {	//	COPIA
		this.matricula = otro.matricula;
		this.marca = otro.marca;
		this.fechaEntrada = otro.fechaEntrada;
		this.minutos = otro.minutos;
		this.plaza = otro.plaza;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the fechaEntrada
	 */
	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the plaza
	 */
	public PlazaAparcamiento getPlaza() {
		return plaza;
	}

	/**
	 * @param plaza the plaza to set
	 */
	public void setPlaza(PlazaAparcamiento plaza) {
		this.plaza = plaza;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append("]");
		return builder.toString();
	}
	
	
	public long calcularMinutos() { //Sacar los minutos entre fechaEntrada y ahora
		
		Duration d = Duration.between(fechaEntrada, LocalDateTime.now());
		
		return d.toMinutes();
	}
	
	
	public abstract double calcularImporte();
	
	
	public double descuento() {
		
		long minutos = this.calcularMinutos();
		double descuento=0;
		
		if (minutos > 120) {
			descuento+= 0.05;
			}
		else if (minutos > 3600) {
			descuento+=0.3;
		}
		
		 if ( LocalDate.now().getDayOfWeek().equals(DayOfWeek.SATURDAY) ||
				 LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			 descuento+=0.1;
		 }
		 	return descuento;
	}

}