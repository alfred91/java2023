package Ejercicio3;

public class Juego {

	protected int id;
	protected String nombre;
	protected String Plataforma;
	/**
	 * @param nombre
	 * @param plataforma
	 */
	Juego(String nombre, String plataforma) {
		this.nombre = nombre;
		Plataforma = plataforma;
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
	 * @return the plataforma
	 */
	public String getPlataforma() {
		return Plataforma;
	}
	/**
	 * @param plataforma the plataforma to set
	 */
	public void setPlataforma(String plataforma) {
		Plataforma = plataforma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("- Plataforma=");
		builder.append(Plataforma);
		builder.append("]");
		return builder.toString();
	}
	
}