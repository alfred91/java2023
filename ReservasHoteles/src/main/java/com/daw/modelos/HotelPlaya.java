package com.daw.modelos;

public class HotelPlaya extends Hotel {
	
    private boolean aireAcondicionado;

    
    public HotelPlaya(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
            double precioNoche, int calificacion, boolean calefaccion, boolean aireAcondicionado) {
super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
this.aireAcondicionado = aireAcondicionado;}
    
public HotelPlaya() {
	
}
	/**
	 * @param aireAcondicionado
	 */
	HotelPlaya(boolean aireAcondicionado) {
		super();
		this.aireAcondicionado = aireAcondicionado;
	}
	
	/**
	 * @return the aireAcondicionado
	 */
    
	public boolean tieneAireAcondicionado() {
		return this.aireAcondicionado;
	}

	/**
	 * @param aireAcondicionado the aireAcondicionado to set
	 */
	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
}