/**
 * 
 */
package ejemplo3;

/**
 * @author profesor
 *
 */
public class Empleado {

	private String nombre;
	private String apellidos;
	private int edad;
	private String email;
	private double salarioBrutoMensual;
	private double irpf;
	private double seguridadSocial;
	private String departamento;
	
	
	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		super();
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.email = "";
		this.salarioBrutoMensual = 0;
		this.irpf = 0;
		this.seguridadSocial = 0;
		this.departamento = "";
	}
	
	/**
	 * Constructor parametrizado
	 */
	public Empleado(String nombre, String apellidos, int edad, String email, double salarioBrutoMensual, double irpf,
			double seguridadSocial, String departamento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.salarioBrutoMensual = salarioBrutoMensual;
		this.irpf = irpf;
		this.seguridadSocial = seguridadSocial;
		this.departamento = departamento;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
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
	 * @return the salarioBrutoMensual
	 */
	public double getSalarioBrutoMensual() {
		return salarioBrutoMensual;
	}

	/**
	 * @param salarioBrutoMensual the salarioBrutoMensual to set
	 */
	public void setSalarioBrutoMensual(double salarioBrutoMensual) {
		this.salarioBrutoMensual = salarioBrutoMensual;
	}

	/**
	 * @return the irpf
	 */
	public double getIrpf() {
		return irpf;
	}

	/**
	 * @param irpf the irpf to set
	 */
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	/**
	 * @return the seguridadSocial
	 */
	public double getSeguridadSocial() {
		return seguridadSocial;
	}

	/**
	 * @param seguridadSocial the seguridadSocial to set
	 */
	public void setSeguridadSocial(double seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	public double mostrarSalarioActual() {
		double descuento;
		
		descuento = (this.salarioBrutoMensual * this.irpf) + (this.salarioBrutoMensual * this.seguridadSocial);
		
		return (this.salarioBrutoMensual - descuento);
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", email=");
		builder.append(email);
		builder.append(", salarioBrutoMensual=");
		builder.append(salarioBrutoMensual);
		builder.append(", irpf=");
		builder.append(irpf);
		builder.append(", seguridadSocial=");
		builder.append(seguridadSocial);
		builder.append(", departamento=");
		builder.append(departamento);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
