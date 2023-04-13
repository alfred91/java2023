package Ejercicio4;

public class VehiculoElectrico extends Vehiculo {
	
	protected int kw;
	
	
	public VehiculoElectrico(String matricula, String marca, String modelo, String color, double precio, int cV,
			boolean reparado, int kw) {
		super(matricula, marca, modelo, color, precio, cV, reparado);

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
		builder.append(", CV=");
		builder.append(CV);
		builder.append(", reparado=");
		builder.append(reparado);
		builder.append(", kw=");
		builder.append(kw);
		builder.append("]");
		return builder.toString();
	}
	
}