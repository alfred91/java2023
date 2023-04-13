package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Taller {

	/**
	 * @param vehiculos
	 */
	Taller(ArrayList<Vehiculo> vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}

	protected ArrayList<Vehiculo> vehiculos;
	   public Taller() {
	        vehiculos = new ArrayList<Vehiculo>();
	    }

	    public void ingresarVehiculo(Vehiculo vehiculo) {
	        vehiculos.add(vehiculo);
	        ordenarVehiculosPorMatricula();
	    }

	    private void ordenarVehiculosPorMatricula() {
	    	
	    	Collections.sort(vehiculos, new Comparator<Vehiculo>() {
	            @Override
	            public int compare(Vehiculo v1, Vehiculo v2) {
	                return v1.getMatricula().compareTo(v2.getMatricula());
	            }
	        });
			
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

		public ArrayList<Vehiculo> getVehiculos() {
			// TODO Auto-generated method stub
			return null;
		}
	  }