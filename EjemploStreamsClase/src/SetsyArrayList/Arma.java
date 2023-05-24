package SetsyArrayList;

public class Arma {

	protected enum Tipo{ESPADA,HACHA,MAZO,BASTON,VARITA,ARCO,DAGA};
	protected String nombre;
	protected Tipo tipo;
	protected int danioFisico;
	protected int danioMagico;
	
	public Arma(String nombre, Tipo tipo, int danioFisico, int danioMagico) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.danioFisico = danioFisico;
		this.danioMagico = danioMagico;
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
	public Tipo getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the danioFisico
	 */
	public int getDanioFisico() {
		return danioFisico;
	}
	/**
	 * @param danioFisico the danioFisico to set
	 */
	public void setDanioFisico(int danioFisico) {
		this.danioFisico = danioFisico;
	}
	/**
	 * @return the danioMagico
	 */
	public int getDanioMagico() {
		return danioMagico;
	}
	/**
	 * @param danioMagico the danioMagico to set
	 */
	public void setDanioMagico(int danioMagico) {
		this.danioMagico = danioMagico;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", danioFisico=");
		builder.append(danioFisico);
		builder.append(", danioMagico=");
		builder.append(danioMagico);
		builder.append("]");
		return builder.toString();
	}
		
}