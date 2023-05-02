package Ejercicio3;

public class Juego {

	private int id;
	private String nombre;
	private String Plataforma;
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
	/**
	 * @param nombre
	 * @param plataforma
	 */
	Juego(String nombre, String plataforma) {
		super();
		this.nombre = nombre;
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
