package Ejercicio4;

import java.util.Objects;

public class Vehiculo {

		protected String matricula;
		protected String marca;
		protected String modelo;
		protected String color;
		protected double precio;
		protected int CV;
		protected boolean reparado;
		
		public Vehiculo(String matricula, String marca, String modelo, String color, double precio, int cV,
				boolean reparado) {
			super();
			this.matricula = matricula;
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.precio = precio;
			CV = cV;
			this.reparado = reparado;
		}

		public Vehiculo(Vehiculo otro) {
			super();
			this.matricula = otro.matricula;
			this.marca = otro.marca;
			this.modelo = otro.modelo;
			this.color = otro.color;
			this.precio = otro.precio;
			CV = otro.CV;
			this.reparado = otro.reparado;
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
		 * @return the modelo
		 */
		public String getModelo() {
			return modelo;
		}

		/**
		 * @param modelo the modelo to set
		 */
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		/**
		 * @return the color
		 */
		public String getColor() {
			return color;
		}

		/**
		 * @param color the color to set
		 */
		public void setColor(String color) {
			this.color = color;
		}

		/**
		 * @return the precio
		 */
		public double getPrecio() {
			return precio;
		}

		/**
		 * @param precio the precio to set
		 */
		public void setPrecio(double precio) {
			this.precio = precio;
		}

		/**
		 * @return the cV
		 */
		public int getCV() {
			return CV;
		}

		/**
		 * @param cV the cV to set
		 */
		public void setCV(int cV) {
			CV = cV;
		}

		/**
		 * @return the reparado
		 */
		public boolean isReparado() {
			return reparado;
		}

		/**
		 * @param reparado the reparado to set
		 */
		public void setReparado(boolean reparado) {
			this.reparado = reparado;
		}

		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Vehiculo [matricula=");
			builder.append(matricula);
			builder.append(", marca=");
			builder.append(marca);
			builder.append(", modelo=");
			builder.append(modelo);
			builder.append(", color=");
			builder.append(color);
			builder.append(", precio=");
			builder.append(precio);
			builder.append(", CV=");
			builder.append(CV);
			builder.append(", reparado=");
			builder.append(reparado);
			builder.append("]");
			return builder.toString();
		}

}