package ejemploTieneUnArray;

public class Empleado {

	private String nombre;
	private String apellidos;
	private String email;
	private String puesto;
	private double salarioMensual;
	
	public Empleado(String nombre, String apellidos, String email, String puesto, double salarioMensual) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.puesto = puesto;
		this.salarioMensual = salarioMensual;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the salarioMensual
	 */
	public double getSalarioMensual() {
		return salarioMensual;
	}

	/**
	 * @param salarioMensual the salarioMensual to set
	 */
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", email=");
		builder.append(email);
		builder.append(", puesto=");
		builder.append(puesto);
		builder.append(", salarioMensual=");
		builder.append(salarioMensual);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
