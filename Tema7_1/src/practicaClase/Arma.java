package practicaClase;

import java.util.Objects;

public class Arma {

	/**
	 * @param nombre
	 * @param tipo
	 * @param esMagico
	 * @param danioMagico
	 * @param danioFisico
	 */
	Arma(String nombre, TipoArma tipo, boolean esMagico, double danioMagico, double danioFisico) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.esMagico = esMagico;
		this.danioMagico = danioMagico;
		this.danioFisico = danioFisico;
	}
	public String nombre;
	public enum TipoArma {ESPADA,HACHA,MAZO,BASTON,VARITA,ARCO,DAGA};
	public TipoArma tipo;
	public boolean esMagico;
	public double danioMagico;
	public double danioFisico;
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
	public TipoArma getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoArma tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the esMagico
	 */
	public boolean isEsMagico() {
		return esMagico;
	}
	/**
	 * @param esMagico the esMagico to set
	 */
	public void setEsMagico(boolean esMagico) {
		this.esMagico = esMagico;
	}
	/**
	 * @return the danioMagico
	 */
	public double getDanioMagico() {
		return danioMagico;
	}
	/**
	 * @param danioMagico the danioMagico to set
	 */
	public void setDanioMagico(double danioMagico) {
		this.danioMagico = danioMagico;
	}
	/**
	 * @return the danioFisico
	 */
	public double getDanioFisico() {
		return danioFisico;
	}
	/**
	 * @param danioFisico the danioFisico to set
	 */
	public void setDanioFisico(double danioFisico) {
		this.danioFisico = danioFisico;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", esMagico=");
		builder.append(esMagico);
		builder.append(", danioMagico=");
		builder.append(danioMagico);
		builder.append(", danioFisico=");
		builder.append(danioFisico);
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
		Arma other = (Arma) obj;
		return Objects.equals(nombre, other.nombre);
	}
}