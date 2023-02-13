package empleado;

public class Empleado {
	private String nombre;
	private String Apellido;
	private int edad;
	private String email;
	private int sueldo;
	private double a,b,c;
	private String dpto;

	
	public Empleado(String nombre, String apellido, int edad, String email, int sueldo, double a, double b, double c,
			String dpto) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.sueldo = sueldo;
		this.a = a;
		this.b = b;
		this.c = c;
		this.dpto = dpto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	public String getDpto() {
		return dpto;
	}


	public void setDpto(String dpto) {
		this.dpto = dpto;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [nombre=");
		builder.append(nombre);
		builder.append(", Apellido=");
		builder.append(Apellido);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", email=");
		builder.append(email);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append(", a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append(", c=");
		builder.append(c);
		builder.append(", dpto=");
		builder.append(dpto);
		builder.append("]");
		return builder.toString();
	}


	public int getSalarioMensualNeto() {
		// TODO Auto-generated method stub
		return sueldo;
	}

}
