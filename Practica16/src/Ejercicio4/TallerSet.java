package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TallerSet {

	private String nombre;
	private TreeSet<Vehiculo> coches;
	
	public TallerSet(String nombre) {
		this.nombre = nombre;
		this.coches = new TreeSet<>();
	}
	
	public void ingresarVehiculo(Vehiculo coche) {
		this.coches.add(coche);
	}
	
	public void vehiculoReparado(Vehiculo coche) {
		//Buscar el coche en el ArrayList
		for(Vehiculo v: this.coches) {
			if (v.equals(coche)) {
				//Ponerlo a reparado
				v.setReparado(true);
				break;
			}
		}		
	}
	
	public void eliminarVehiculo(Vehiculo coche) {
		if (! this.coches.remove(coche)) {
			System.out.println("El coche no está en el taller");
		} else {
			System.out.println("Coche eliminado correctamente");
		}
	}
	
	public Vehiculo buscarVehiculo(String matricula) {
		
		//2. Hacer una búsqueda binaria
		ArrayList<Vehiculo> cochesA = new ArrayList(this.coches);
		int posicion = Collections.binarySearch(cochesA, new VehiculoElectrico(matricula, "", "", "", 0.0, 0,	false, 0));
		return cochesA.get(posicion);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taller [nombre=");
		builder.append(nombre);
		builder.append(", coches=");
		builder.append(coches);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}