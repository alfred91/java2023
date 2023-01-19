package ejemploTieneUn;

public class Jugador {

	private String nombre;
	private String clase;
	private int salud;
	
	private Arma armaDerecha;
	private Arma armaIzquierda;
	
	
	public Jugador(String nombre, String clase) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.salud = 500;
		this.armaDerecha = null;
		this.armaIzquierda = null;
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
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}


	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
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


	/**
	 * @return the armaDerecha
	 */
	public Arma getArmaDerecha() {
		return armaDerecha;
	}


	/**
	 * @param armaDerecha the armaDerecha to set
	 */
	public void setArmaDerecha(Arma armaDerecha) {
		this.armaDerecha = armaDerecha;
	}


	/**
	 * @return the armaIzquierda
	 */
	public Arma getArmaIzquierda() {
		return armaIzquierda;
	}


	/**
	 * @param armaIzquierda the armaIzquierda to set
	 */
	public void setArmaIzquierda(Arma armaIzquierda) {
		this.armaIzquierda = armaIzquierda;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador [nombre=");
		builder.append(nombre);
		builder.append(", clase=");
		builder.append(clase);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", armaDerecha=");
		builder.append(armaDerecha);
		builder.append(", armaIzquierda=");
		builder.append(armaIzquierda);
		builder.append("]");
		return builder.toString();
	}
	
	public void quitarVida(int valor) {
		this.salud = this.salud - valor;
		if (this.salud == 0)
			System.out.println("Muerto " + this.nombre);
	}
	
	public void golpearDerecha(Jugador otro) {
		
		if (this.armaDerecha == null) {
			otro.quitarVida(10);
		} else {
			otro.quitarVida(this.armaDerecha.getPotencia());
		}
	}
	
	public void golpearIzquierda(Jugador otro) {
		
		if (this.armaIzquierda == null) {
			otro.quitarVida(10);
		} else {
			otro.quitarVida(this.armaIzquierda.getPotencia());
		}
	}
	
	
	
}
