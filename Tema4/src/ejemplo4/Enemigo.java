/**
 * 
 */
package ejemplo4;

/**
 * @author profesor
 *
 */
public class Enemigo {

	private String nombre;
	private String tipo;
	private int salud;
	private int nivel;
	private int danio;
	
	public static int NumEnemigos;
	
	public Enemigo(String nombre, String tipo, int danio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.danio = danio;
		this.nivel = 1;
		this.salud = 100;
		Enemigo.NumEnemigos++;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the danio
	 */
	public int getDanio() {
		return danio;
	}

	/**
	 * @param danio the danio to set
	 */
	public void setDanio(int danio) {
		this.danio = danio;
	}
	
	public void subirNivel() {
		this.nivel = this.nivel + 1;
		this.salud = this.salud + (int) (Math.pow(2, this.nivel));
	}
	
	public void recibirDanio(int danio) {
		this.salud = this.salud - danio;
		
		if(this.salud <= 0) {
			System.out.println(this.nombre + " muerto!!!");
			Enemigo.NumEnemigos--;
		}
		
	}
	
	public static void incrementarNumEnemigos() {
		Enemigo.NumEnemigos++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enemigo [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append(", danio=");
		builder.append(danio);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
