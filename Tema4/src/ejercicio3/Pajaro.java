package ejercicio3;

public class Pajaro {
	
	public String nombre;
	
	public void setedad(int e) {edad=e;
								}
	public void printedad() {System.out.println(edad);
								}
	public String setcolor(char c) {color=c;
	return "c";}
	
	private int edad;
	
	char color;

	public Pajaro(String nombre, int edad, char color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
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
	 * @return the color
	 */
	public char getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(char color) {
		this.color = color;
	}

}