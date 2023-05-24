package SetsyArrayList;

import java.util.Objects;

public class TipoArmadura implements Comparable<TipoArmadura> {

	protected String nombre;
	protected enum Zona{ CABEZA,BRAZOIZQ,BRAZODER,TORSO,PIERNAIZQ,PIERNADER};
	protected Zona zona;
	protected int defensaFisica;
	protected int defensaMagica;
	
	public TipoArmadura(String nombre, Zona zona, int defensaFisica, int defensaMagica) {
		super();
		this.nombre = nombre;
		this.zona = zona;
		this.defensaFisica = defensaFisica;
		this.defensaMagica = defensaMagica;
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
	public int getDefensaFisica() {
		return defensaFisica;
	}
	/**
	 * @param defensaFisica the defensaFisica to set
	 */
	public void setDefensaFisica(int defensaFisica) {
		this.defensaFisica = defensaFisica;
	}
	/**
	 * @return the defensaMagica
	 */
	public int getDefensaMagica() {
		return defensaMagica;
	}
	/**
	 * @param defensaMagica the defensaMagica to set
	 */
	public void setDefensaMagica(int defensaMagica) {
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
	
	@Override
	 public int compareTo(TipoArmadura otraArmadura) {
        // Comparar por nombre
        int comparacion = this.nombre.compareTo(otraArmadura.nombre);
        if (comparacion != 0) {
            return comparacion;
        }
        return this.nombre.compareTo(otraArmadura.nombre);
}
	}