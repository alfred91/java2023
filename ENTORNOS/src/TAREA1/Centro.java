package TAREA1;

public class Centro {

	/**
	 * @param idCentro
	 * @param nombreCentro
	 */
	Centro(int idCentro, String nombreCentro) {
		super();
		this.idCentro = idCentro;
		this.nombreCentro = nombreCentro;
	}
	private int idCentro;
	private String nombreCentro;
	/**
	 * @return the idCentro
	 */
	public int getIdCentro() {
		return idCentro;
	}
	/**
	 * @param idCentro the idCentro to set
	 */
	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}
	/**
	 * @return the nombreCentro
	 */
	public String getNombreCentro() {
		return nombreCentro;
	}
	/**
	 * @param nombreCentro the nombreCentro to set
	 */
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	
}
