package examen2021;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {
	
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<PlazaAparcamiento> plazas;
	
	private int plazasDisponibles;
	private float saldoAcumulado;
	
	static final float PRECIO_MINUTO=0.04f;
	static final float PRECIO_METRO=0.2f;
	
		public Parking() {			
			super();
			
			this.saldoAcumulado = 0;
			
			this.plazas = new ArrayList<PlazaAparcamiento>();
			
				for (int i=1;i <100; i++) {
					plazas.add(new PlazaAparcamiento(i));
				}
					
				this.vehiculos = new ArrayList<>();
				
				this.plazasDisponibles=100;
		}
	
		/**
		 * @return the plazasDisponibles
		 */
		public int getPlazasDisponibles() {
			return plazasDisponibles;
		}
	
		/**
		 * @return the vehiculos
		 */
		public ArrayList<Vehiculo> getVehiculos() {
			return vehiculos;
		}
	
		/**
		 * @return the saldoAcumulado
		 */
		public float getSaldoAcumulado() {
			return saldoAcumulado;
		}
		
		//se recorre todas las plazas y devuelve String con número y estado de las plazas del parking
		
			public String imprimePlazas() {
				
				StringBuilder sb = new StringBuilder();
				for(PlazaAparcamiento p: this.plazas) {
					sb.append(p.getNumPlaza());
					sb.append(" - ");
					sb.append(p.estaLibre());
					sb.append("\n");
				}
				
				return sb.toString();
				
			}
			
			/*- registrarEntradaVehiculo(Vehiculo v): se le asigna al vehículo una plaza libre si la hay, si no el método
			devuelve String indicando que el parking está lleno y termina. Si puede asignar la plaza consiste en indicarle al
			vehículo el objeto de plaza de aparcamiento libre de la lista, asignarle la fecha y hora de entrada, añadir ese
			vehículo a la lista del parking, y marcar en el parking esa plaza como ocupada. Además, se restará uno al
			número de plazas disponibles, y devolverá String indicando que la matrícula que sea está aparcada en la plaza
			con el número asignado.*/
			
			public String registrarEntradaVehiculo(Vehiculo v) {
				
				if (this.plazasDisponibles>0) {
					
					PlazaAparcamiento plazaV = this.getPlazaLibre();
					
					v.setPlaza(plazaV);
					
					v.setFechaEntrada(LocalDateTime.now().minusMinutes(10));
					
					this.vehiculos.add(v);
					
					this.plazasDisponibles--;
					
					return new StringBuilder(v.getMatricula() + " - " + v.getPlaza().getNumPlaza()).toString();
				}
				
					else {
				
					return "El parking esta lleno no puedes entrar";
					
					}	
			}
			
			public String registrarSalidaVehiculo(String matricula) {
				
double precio=0;
Vehiculo v = null;
boolean encontrado=false;
				
		for(Vehiculo veh: this.vehiculos) {
			if (veh.getMatricula().equals(matricula)) {
			 encontrado=true;
			 break;
			}	}
		if (!encontrado) {
			return "No hay ningun vehiculo con esa matricula en el parking";
			
		} else {
			precio=v.calcularImporte();
			
			this.saldoAcumulado+=precio;
			v.getPlaza().setEstaLibre(true);
			this.plazasDisponibles++;
			this.vehiculos.remove(v);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("Vehiculo Matricula ");
			sb.append(v.getMatricula());
			sb.append(" entro ");
			sb.append(v.getFechaEntrada());
			sb.append(" y salio ");
			sb.append(LocalDateTime.now());
			sb.append("Estando ");
			sb.append(v.calcularMinutos());
			sb.append(" Minutos ");
			sb.append(v.calcularImporte());
			
			return sb.toString();
			
		}
				
			
	}
			
			private PlazaAparcamiento getPlazaLibre() {
				
				for(PlazaAparcamiento p: this.plazas) {
					if (p.estaLibre())
						return p;
				}
				
				return null;		
		}
			
}