package ejercicio4;

public class Finanzas {

	private String tipo;
	private double cantidad;
	
	public Finanzas(String tipo, int cantidad) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "finanzas [tipo=" + tipo + ", cantidad=" + cantidad + "]";
	}
	
	public String finanzas() {
	
		if (this.tipo == "dolares") {
			return 	this.cantidad * 1.36+" €";
			
		} else { 
			return 	this.cantidad / 1.36+" $";
			}
	 	}
	
}