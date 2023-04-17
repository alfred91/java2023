package Ejercicio4;

public class VehiculoFosil extends Vehiculo {
	
	private TipoFosil tipoF;
	private Integer capacidadDeposito;
	
	public VehiculoFosil(String matricula, String marca, String modelo, String color, Double precio, Integer cv,
			boolean reparado, TipoFosil tipoF, Integer capacidadDeposito) {
		super(matricula, marca, modelo, color, precio, cv, reparado);
		this.tipoF = tipoF;
		this.capacidadDeposito = capacidadDeposito;
	}

	public VehiculoFosil(VehiculoFosil otro) {
		super(otro);
		this.tipoF = otro.tipoF;
		this.capacidadDeposito = otro.capacidadDeposito;
	}

	/**
	 * @return the tipoF
	 */
	public TipoFosil getTipoF() {
		return tipoF;
	}

	/**
	 * @param tipoF the tipoF to set
	 */
	public void setTipoF(TipoFosil tipoF) {
		this.tipoF = tipoF;
	}

	/**
	 * @return the capacidadDeposito
	 */
	public Integer getCapacidadDeposito() {
		return capacidadDeposito;
	}

	/**
	 * @param capacidadDeposito the capacidadDeposito to set
	 */
	public void setCapacidadDeposito(Integer capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoFosil [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", cv=");
		builder.append(cv);
		builder.append(", reparado=");
		builder.append(reparado);
		builder.append(", tipoF=");
		builder.append(tipoF);
		builder.append(", capacidadDeposito=");
		builder.append(capacidadDeposito);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}