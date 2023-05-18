package Ejercicio3;

import java.util.Objects;

public class Finca {
	
	  	private int id;
	    private String nombre;
	    private double longitud;
		private double latitud;
	    private double superficie;
	    private String localidad;
	    private String provincia;
	    
	    
		public Finca(int id, String nombre, double longitud, double latitud, double superficie, String localidad,
				String provincia) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.longitud = longitud;
			this.latitud = latitud;
			this.superficie = superficie;
			this.localidad = localidad;
			this.provincia = provincia;
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
		 * @return the longitud
		 */
		public double getLongitud() {
			return longitud;
		}


		/**
		 * @param longitud the longitud to set
		 */
		public void setLongitud(double longitud) {
			this.longitud = longitud;
		}


		/**
		 * @return the latitud
		 */
		public double getLatitud() {
			return latitud;
		}


		/**
		 * @param latitud the latitud to set
		 */
		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}


		/**
		 * @return the superficie
		 */
		public double getSuperficie() {
			return superficie;
		}


		/**
		 * @param superficie the superficie to set
		 */
		public void setSuperficie(double superficie) {
			this.superficie = superficie;
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


		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Finca [id=");
			builder.append(id);
			builder.append(", nombre=");
			builder.append(nombre);
			builder.append(", longitud=");
			builder.append(longitud);
			builder.append(", latitud=");
			builder.append(latitud);
			builder.append(", superficie=");
			builder.append(superficie);
			builder.append(", localidad=");
			builder.append(localidad);
			builder.append(", provincia=");
			builder.append(provincia);
			builder.append("]");
			return builder.toString();
		}


		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Finca other = (Finca) obj;
			return id == other.id;
		}
    
}