package TAREA1;

public class Profesorado {

		/**
	 * @param idProfesorado
	 * @param nombreProfesorado
	 */
	Profesorado(int idProfesorado, String nombreProfesorado) {
		super();
		this.idProfesorado = idProfesorado;
		this.nombreProfesorado = nombreProfesorado;
	}
		private int idProfesorado;
		private String nombreProfesorado;
		/**
		 * @return the idProfesorado
		 */
		public int getIdProfesorado() {
			return idProfesorado;
		}
		/**
		 * @param idProfesorado the idProfesorado to set
		 */
		public void setIdProfesorado(int idProfesorado) {
			this.idProfesorado = idProfesorado;
		}
		/**
		 * @return the nombreProfesorado
		 */
		public String getNombreProfesorado() {
			return nombreProfesorado;
		}
		/**
		 * @param nombreProfesorado the nombreProfesorado to set
		 */
		public void setNombreProfesorado(String nombreProfesorado) {
			this.nombreProfesorado = nombreProfesorado;
		}
}
