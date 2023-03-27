package ejemplos.colaspilas;

public class Mueble {

	private String nombre;
	private String codigo;
	private String peso;
	
	public Mueble(String nombre, String codigo, String peso) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.peso = peso;
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the peso
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mueble [nombre=");
		builder.append(nombre);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append("]");
		return builder.toString();
	}

	
	
}
