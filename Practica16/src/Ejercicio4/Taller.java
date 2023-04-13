package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Taller {

	protected ArrayList<Vehiculo> vehiculos;
	   public Taller() {
	        vehiculos = new ArrayList<Vehiculo>();
	    }

	    public void ingresarVehiculo(Vehiculo vehiculo) {
	        vehiculos.add(vehiculo);
	    }

	    public void vehiculoReparado(Vehiculo vehiculo) {
	        for (Vehiculo v : vehiculos) {
	            if (v.getMatricula().equals(vehiculo.getMatricula())) {
	                v.setReparado(false);
	                return;
	            }
	        }
	    }

	    public void eliminarVehiculo(Vehiculo vehiculo) {
	        vehiculos.remove(vehiculo);
	    }

	    public Vehiculo buscarVehiculo(String matricula) {
	        for (Vehiculo v : vehiculos) {
	            if (v.getMatricula().equals(matricula)) {
	                return v;
	            }
	        }
	        return null;
	    }

	    public void listarVehiculos() {
	        for (Vehiculo v : vehiculos) {
	            System.out.println(v);
	        }
	    }

	   
	    public void listarVehiculosReparados() {
	        for (Vehiculo v : vehiculos) {
	            if (v.isReparado()) {
	                System.out.println(v);
	            }
	        }
	    }

	    public void ordenarVehiculosPorPrecio() {
	        Collections.sort(vehiculos, new ComparadorVehiculoPorPrecio());
	    }
	}