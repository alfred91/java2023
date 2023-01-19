/**
 * 
 */
package ejemplo5;

/**
 * @author profesor
 *
 */
public class Coche {
	
	private String marca;
	private String matricula;
	
	public static int numCoches = 0; 
	
	public Coche(String marca, String matricula) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		Coche.numCoches++;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [marca=");
		builder.append(marca);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	

}
