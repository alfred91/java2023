package Ejercicio4;

public class VehiculoHibrido extends Vehiculo {
	
	protected enum TipoFosil{ GASOLINA, DIESEL}
	protected TipoFosil tipoFosil;
	protected int kw;
	protected int capacidadDeposito;
	
	
	public VehiculoHibrido(String matricula, String marca, String modelo, String color, double precio, int cV,
			boolean reparado, TipoFosil tipoFosil, int kw, int capacidadDeposito) {
		super(matricula, marca, modelo, color, precio, cV, reparado);
		this.tipoFosil = tipoFosil;
		this.kw = kw;
		this.capacidadDeposito = capacidadDeposito;
	}
	
	public VehiculoHibrido(VehiculoHibrido otro) {
		super(otro);
		this.tipoFosil = otro.tipoFosil;
		this.kw = otro.kw;
		this.capacidadDeposito = otro.capacidadDeposito;
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

	/**
	 * @return the kw
	 */
	public int getKw() {
		return kw;
	}

	/**
	 * @param kw the kw to set
	 */
	public void setKw(int kw) {
		this.kw = kw;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoHibrido [matricula=");
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
		builder.append(", capacidadDeposito=");
		builder.append(capacidadDeposito);
		builder.append(", tipoFosil=");
		builder.append(tipoFosil);
		builder.append(", kw=");
		builder.append(kw);
		builder.append("]");
		return builder.toString();
	}
	
}