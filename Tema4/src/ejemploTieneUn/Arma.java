package ejemploTieneUn;

public class Arma {

	public String nombre;
	public int potencia;
	
	public Arma(String nombre, int potencia) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
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
	 * @return the potencia
	 */
	public int getPotencia() {
		return potencia;
	}
	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
