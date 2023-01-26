package ejemplos.clases;

import java.util.Objects;

public class Rectangulo implements Cloneable {

	private int alto;
	private int ancho;
	
	public Rectangulo(int alto, int ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}
	
	public Rectangulo incrementarAncho() {
		this.ancho++;
		return this;
	}
	
	public Rectangulo incrementarAlto() {
		this.alto++;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangulo [alto=");
		builder.append(alto);
		builder.append(", ancho=");
		builder.append(ancho);
		builder.append("]");
		return builder.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return alto == other.alto && ancho == other.ancho;
	}

	
	
	
	
	
	
	
	
}
