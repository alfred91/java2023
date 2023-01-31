package ejercicio3;
public class Pajaro {
	
	private int edad;
	private String color;
	
	/**
	 * @param edad
	 * @param color
	 */
	public Pajaro(int edad, String color) {
		super();
		this.edad = edad;
		this.color = color;
	}
	
	public int getedad() {
	return edad;
			}
	public void setedad(int edad) {
		this.edad = edad; }
	
	public void printedad() {System.out.println(edad); }
	
	public void setcolor (String color) {
		this.color=color; }
	
	public String getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = "color";
	}
	public void printPajaro(){
		System.out.println("Edad: "+this.edad);
		System.out.println("Color: "+this.color);

	}
}