package pruebaEnemigos;

public class Enemigo implements Cloneable {

	private String nombre;
	private int salud;
	
	public Enemigo(String nombre, int salud) {
		super();
		this.nombre = nombre;
		this.salud = salud;
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
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enemigo [nombre=");
		builder.append(nombre);
		builder.append(", salud=");
		builder.append(salud);
		builder.append("]");
		return builder.toString();
	}
	
	
	public int restarVida(int valor) {
		this.salud -= valor;
		if (this.salud <= 0) {
			return 0; //Muerto
		} else {
			return 1; //Vivo
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Enemigo e = new Enemigo(this.nombre, this.salud);
		return e;
	}
	
	
	
}
