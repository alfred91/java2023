package practicaClase;

import java.util.Objects;

public class TipoArmadura {
	
	/**
	 * @param nombre
	 * @param zona
	 * @param defensaFisica
	 * @param defensaMagica
	 */
	TipoArmadura(String nombre, Zona zona, double defensaFisica, double defensaMagica) {
		super();
		this.nombre = nombre;
		this.zona = zona;
		this.defensaFisica = defensaFisica;
		this.defensaMagica = defensaMagica;
	}
	public enum Zona {CABEZA, BRAZOIZQ, BRAZODER, TORSO, PIERNAIZQ, PIERNADER};
	
	public String nombre;
	public Zona zona;
	public double defensaFisica;
	public double defensaMagica;
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
	 * @return the zona
	 */
	public Zona getZona() {
		return zona;
	}
	/**
	 * @param zona the zona to set
	 */
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	/**
	 * @return the defensaFisica
	 */
	public double getDefensaFisica() {
		return defensaFisica;
	}
	/**
	 * @param defensaFisica the defensaFisica to set
	 */
	public void setDefensaFisica(double defensaFisica) {
		this.defensaFisica = defensaFisica;
	}
	/**
	 * @return the defensaMagica
	 */
	public double getDefensaMagica() {
		return defensaMagica;
	}
	/**
	 * @param defensaMagica the defensaMagica to set
	 */
	public void setDefensaMagica(double defensaMagica) {
		this.defensaMagica = defensaMagica;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoArmadura [nombre=");
		builder.append(nombre);
		builder.append(", zona=");
		builder.append(zona);
		builder.append(", defensaFisica=");
		builder.append(defensaFisica);
		builder.append(", defensaMagica=");
		builder.append(defensaMagica);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoArmadura other = (TipoArmadura) obj;
		return Objects.equals(nombre, other.nombre);
	}
}