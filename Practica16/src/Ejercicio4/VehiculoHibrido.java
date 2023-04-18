package Ejercicio4;

public class VehiculoHibrido extends VehiculoElectrico {
	
	private TipoFosil tipoF;
	private Integer capacidadDeposito;
	
	public VehiculoHibrido(String matricula, String marca, String modelo, String color, Double precio, Integer cv,
			boolean reparado, Integer kw, TipoFosil gasolina, Integer capacidadDeposito) {
		super(matricula, marca, modelo, color, precio, cv, reparado, kw);
		this.tipoF = gasolina;
		this.capacidadDeposito = capacidadDeposito;
	}
	
	public VehiculoHibrido(VehiculoHibrido otro) {
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
		builder.append(", cv=");
		builder.append(cv);
		builder.append(", reparado=");
		builder.append(reparado);
		builder.append(", kw=");
		builder.append(kw);
		builder.append(", tipoF=");
		builder.append(tipoF);
		builder.append(", capacidadDeposito=");
		builder.append(capacidadDeposito);
		builder.append("]");
		return builder.toString();
	}

	




}