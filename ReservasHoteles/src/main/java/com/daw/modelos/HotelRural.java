package com.daw.modelos;

public class HotelRural extends Hotel {
	
    private boolean calefaccion;

    public HotelRural(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
                      double precioNoche, int calificacion, boolean calefaccion) {
        super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
        this.calefaccion = calefaccion;
    }
    
    public HotelRural(boolean calefaccion) {
		super();
		this.calefaccion = calefaccion;
	}
    
    public boolean tieneCalefaccion() {
        return this.calefaccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo=Rural, calefaccion=" + calefaccion + "]";
    }

}