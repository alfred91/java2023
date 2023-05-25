package com.daw.modelos;

import java.time.LocalDate;

	public class Reserva implements Comparable<Reserva> {
    private static int contador = 0;
    private int id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int cantidadHabitaciones;
    private int numPersonasPorHabitacion;
    private String dni;
    private String nacionalidad;
    private Hotel hotel;

    
    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, int cantidadHabitaciones, int numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {
        this.id = ++contador;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numPersonasPorHabitacion = numPersonasPorHabitacion;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.hotel = hotel;
    }
    public Reserva() {
    	super();
    }

    /**
  	 * @return the contador
  	 */
  	public static int getContador() {
  		return contador;
  	}

  	/**
  	 * @param contador the contador to set
  	 */
  	public static void setContador(int contador) {
  		Reserva.contador = contador;
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
  	 * @return the fechaEntrada
  	 */
  	public LocalDate getFechaEntrada() {
  		return fechaEntrada;
  	}

  	/**
  	 * @param fechaEntrada the fechaEntrada to set
  	 */
  	public void setFechaEntrada(LocalDate fechaEntrada) {
  		this.fechaEntrada = fechaEntrada;
  	}

  	/**
  	 * @return the fechaSalida
  	 */
  	public LocalDate getFechaSalida() {
  		return fechaSalida;
  	}

  	/**
  	 * @param fechaSalida the fechaSalida to set
  	 */
  	public void setFechaSalida(LocalDate fechaSalida) {
  		this.fechaSalida = fechaSalida;
  	}

  	/**
  	 * @return the cantidadHabitaciones
  	 */
  	public int getCantidadHabitaciones() {
  		return cantidadHabitaciones;
  	}

  	/**
  	 * @param cantidadHabitaciones the cantidadHabitaciones to set
  	 */
  	public void setCantidadHabitaciones(int cantidadHabitaciones) {
  		this.cantidadHabitaciones = cantidadHabitaciones;
  	}

  	/**
  	 * @return the numPersonasPorHabitacion
  	 */
  	public int getNumPersonasPorHabitacion() {
  		return numPersonasPorHabitacion;
  	}

  	/**
  	 * @param numPersonasPorHabitacion the numPersonasPorHabitacion to set
  	 */
  	public void setNumPersonasPorHabitacion(int numPersonasPorHabitacion) {
  		this.numPersonasPorHabitacion = numPersonasPorHabitacion;
  	}

  	/**
  	 * @return the dni
  	 */
  	public String getDni() {
  		return dni;
  	}

  	/**
  	 * @param dni the dni to set
  	 */
  	public void setDni(String dni) {
  		this.dni = dni;
  	}

  	/**
  	 * @return the nacionalidad
  	 */
  	public String getNacionalidad() {
  		return nacionalidad;
  	}

  	/**
  	 * @param nacionalidad the nacionalidad to set
  	 */
  	public void setNacionalidad(String nacionalidad) {
  		this.nacionalidad = nacionalidad;
  	}

  	/**
  	 * @return the hotel
  	 */
  	public Hotel getHotel() {
  		return hotel;
  	}

  	/**
  	 * @param hotel the hotel to set
  	 */
  	public void setHotel(Hotel hotel) {
  		this.hotel = hotel;
  	}

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida
                + ", cantidadHabitaciones=" + cantidadHabitaciones + ", numPersonasPorHabitacion="
                + numPersonasPorHabitacion + ", dni=" + dni + ", nacionalidad=" + nacionalidad + ", hotel=" + hotel + "]";
    }

	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Reserva other = (Reserva) obj;
        return id == other.id;
    }

    public int compareTo(Reserva reserva) {
        return fechaEntrada.compareTo(reserva.fechaEntrada);
    }
}