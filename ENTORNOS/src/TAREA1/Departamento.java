package TAREA1;

public class Departamento {

		/**
	 * @param idDepartamento
	 * @param nombreDepartamento
	 */
	Departamento(int idDepartamento, String nombreDepartamento) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombreDepartamento = nombreDepartamento;
	}
		private int idDepartamento;
		private String nombreDepartamento;
		/**
		 * @return the idDepartamento
		 */
		public int getIdDepartamento() {
			return idDepartamento;
		}
		/**
		 * @param idDepartamento the idDepartamento to set
		 */
		public void setIdDepartamento(int idDepartamento) {
			this.idDepartamento = idDepartamento;
		}
		/**
		 * @return the nombreDepartamento
		 */
		public String getNombreDepartamento() {
			return nombreDepartamento;
		}
		/**
		 * @param nombreDepartamento the nombreDepartamento to set
		 */
		public void setNombreDepartamento(String nombreDepartamento) {
			this.nombreDepartamento = nombreDepartamento;
		}		
}