package ejemplos.herencia;

abstract public class Figura {

	protected String color;
	protected String id;
	
	
	public Figura(String color, String id) {
		super();
		this.color = color;
		this.id = id;
	}
	

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Figura [color=");
		builder.append(color);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	public abstract double getArea(); 
	
	
}
