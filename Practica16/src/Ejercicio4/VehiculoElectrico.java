package Ejercicio4;

public class VehiculoElectrico extends Vehiculo {

	protected Integer kw;
	
	public VehiculoElectrico(String matricula, String marca, String modelo, String color, Double precio, Integer cv,
			boolean reparado, Integer kw) {
		super(matricula, marca, modelo, color, precio, cv, reparado);
		this.kw = kw;
	}

	public VehiculoElectrico(VehiculoElectrico otro) {
		super(otro);
		this.kw = otro.kw;
	}

	/**
	 * @return the kw
	 */
	public Integer getKw() {
		return kw;
	}

	/**
	 * @param kw the kw to set
	 */
	public void setKw(Integer kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoElectrico [matricula=");
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
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}