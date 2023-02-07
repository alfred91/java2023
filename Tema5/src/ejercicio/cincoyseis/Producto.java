package ejercicio.cincoyseis;

import java.util.Objects;

public class Producto {

	private int id;
	private String desc;
	private double precioU;
	private int unidadesDisp;
	private int stockMax;
	private double descuento; //Porcentaje
	
	
	public Producto() {
		this.id = 0;
		this.desc = "Producto prueba";
		this.precioU = 0;
		this.unidadesDisp = 10;
		this.stockMax = 100;
		this.descuento = 0.1;
	}


	public Producto(int id, String desc, double precioU, int unidadesDisp, int stockMax, double descuento) {
		super();
		this.id = id;
		this.desc = desc;
		this.precioU = precioU;
		this.unidadesDisp = unidadesDisp;
		this.stockMax = stockMax;
		this.descuento = descuento;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}


	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}


	/**
	 * @return the precioU
	 */
	public double getPrecioU() {
		return precioU;
	}


	/**
	 * @param precioU the precioU to set
	 */
	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}


	/**
	 * @return the unidadesDisp
	 */
	public int getUnidadesDisp() {
		return unidadesDisp;
	}


	/**
	 * @param unidadesDisp the unidadesDisp to set
	 */
	public void setUnidadesDisp(int unidadesDisp) {
		this.unidadesDisp = unidadesDisp;
	}


	/**
	 * @return the stockMax
	 */
	public int getStockMax() {
		return stockMax;
	}


	/**
	 * @param stockMax the stockMax to set
	 */
	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}


	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}


	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", precioU=");
		builder.append(precioU);
		builder.append(", unidadesDisp=");
		builder.append(unidadesDisp);
		builder.append(", stockMax=");
		builder.append(stockMax);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * Si la cantidad es positiva y menor que las unidades disponibles, se resta de las unidades disponibles
	 * y devuelve true.
	 * En caso contrario devuelve false
	 * @param cantidad
	 * @return
	 */
	public boolean vender(int cantidad) {
		
		if ( (cantidad <= 0) || (this.unidadesDisp < cantidad) ) {
			return false;
		} else {
			this.unidadesDisp -= cantidad;
			return true;
		}
	}
	
	/**
	 * Rellena las unidades disponibles de un producto, igualando al stock máximo. Devuelve la diferencia previa, es decir,
	 * en cuánto hemos aumentado las unidades disponibles
	 * @return
	 */
	public int reponer() {
		int diferencia;
		
		diferencia = this.stockMax - this.unidadesDisp;
		
		this.unidadesDisp = this.stockMax;
		return diferencia;
	}
	

}
