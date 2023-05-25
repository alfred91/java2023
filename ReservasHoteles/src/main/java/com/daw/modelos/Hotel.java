package com.daw.modelos;

public class Hotel implements Comparable<Hotel> {
	
    private static int contador = 0;
    private int id;
    private String nombre;
    private String direccion;
    private String localidad;
    private String provincia;
    private int numHabitaciones;
    private double precioNoche;
    private double calificacion;
    
	
   public Hotel()
   {
	   super();
   }
   
   /**
	 * @param id
	 * @param nombre
	 * @param direccion
	 * @param localidad
	 * @param provincia
	 * @param numHabitaciones
	 * @param precioNoche
	 * @param calificacion
	 */
    public Hotel(String nombre, String direccion, String localidad, String provincia, int numHabitaciones, double precioNoche, double calificacion) {
        this.id = ++contador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.numHabitaciones = numHabitaciones;
        this.precioNoche = precioNoche;
        this.calificacion = calificacion;
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
		Hotel.contador = contador;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/**
	 * @return the numHabitaciones
	 */
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	/**
	 * @param numHabitaciones the numHabitaciones to set
	 */
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	/**
	 * @return the precioNoche
	 */
	public double getPrecioNoche() {
		return precioNoche;
	}
	/**
	 * @param precioNoche the precioNoche to set
	 */
	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}
	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}
	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	@Override
    public String toString() {
        return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad
                + ", provincia=" + provincia + ", numHabitaciones=" + numHabitaciones + ", precioNoche=" + precioNoche
                + ", calificacion=" + calificacion + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hotel other = (Hotel) obj;
        return id == other.id;
    }

    /**
     * Comparador por calificacion
     */
    public int compareTo(Hotel hotel) {
        return Double.compare(hotel.calificacion, this.calificacion);
    }

}