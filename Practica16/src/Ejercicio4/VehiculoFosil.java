package Ejercicio4;


public class VehiculoFosil extends Vehiculo {
	
	protected int capacidadDeposito;
	protected enum TipoFosil{ GASOLINA, DIESEL}
	protected TipoFosil tipoFosil;
	
	public VehiculoFosil(String matricula, String marca, String modelo, String color, double precio, int CV,
			boolean reparado, int capacidadDeposito, TipoFosil tipoFosil) {
		
		super(matricula, marca, modelo, color, precio, CV, reparado);
		this.capacidadDeposito = capacidadDeposito;
		this.tipoFosil = tipoFosil;
	}
	
	public VehiculoFosil(VehiculoFosil otro) {
		
		super(otro);
		this.capacidadDeposito = otro.capacidadDeposito;
		this.tipoFosil = otro.tipoFosil;
	}

	/**
	 * @return the capacidadDeposito
	 */
	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	/**
	 * @param capacidadDeposito the capacidadDeposito to set
	 */
	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	/**
	 * @return the tipoFosil
	 */
	public TipoFosil getTipoFosil() {
		return tipoFosil;
	}

	/**
	 * @param tipoFosil the tipoFosil to set
	 */
	public void setTipoFosil(TipoFosil tipoFosil) {
		this.tipoFosil = tipoFosil;
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
		builder.append(", CV=");
		builder.append(CV);
		builder.append(", reparado=");
		builder.append(reparado);
		builder.append(", tipoFosil=");
		builder.append(tipoFosil);
		builder.append(", capacidadDeposito=");
		builder.append(capacidadDeposito);
		builder.append("]");
		return builder.toString();
		
	}
}