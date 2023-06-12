package com.tienda.proyecto.modelos;

/**
 * Esta clase abstracta representa un producto en la tienda.
 * Implementa la interfaz Comparable y la interfaz VistaPDF.
 */
public abstract class Producto implements Comparable<Producto>,VistaPDF {
	
	protected String sku;
	protected String nombre;
	public double precioBase;
	protected IVA iva;
	protected DetalleProducto detalleProducto;
	
	/**
	 * Constructor vacio
	 */
	public Producto(){
	}
	
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param precioBase
	 * @param iva
	 * @param detalleProducto
	 */
	public Producto(String nombre, double precioBase, IVA iva, DetalleProducto detalleProducto) {
		super();
		this.sku=generarSku();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.iva = iva;
		this.detalleProducto = detalleProducto;
		
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
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return the iva
	 */
	public IVA getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(IVA iva) {
		this.iva = iva;
	}

	/**
	 * @return the detalleProducto
	 */
	public DetalleProducto getDetalleProducto() {
		return detalleProducto;
	}

	/**
	 * @param detalleProducto the detalleProducto to set
	 */
	public void setDetalleProducto(DetalleProducto detalleProducto) {
		this.detalleProducto = detalleProducto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append(", sku=");
		builder.append(sku);
		builder.append(", precioBase=");
		builder.append(precioBase);
		builder.append(", iva=");
		builder.append(iva);
		builder.append(", detalleProducto=");
		builder.append(detalleProducto);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Genera un PDF
	 */
	public abstract boolean toPDF();
	
	
	public abstract double getImporte();
	
	
	private static int contador = 0;
	
	protected String generarSku() {
	    contador++;
	    String codigo = "prod-" + String.format("%04d", contador);
	    return codigo;
	}
	
	
	public double calcularIVA() {
	    double precioConIVA = this.precioBase * (1 + this.iva.getValor() / 100.0);
	    return precioConIVA;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
		return result;
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
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		return true;
	}
	
	  public int compareTo(Producto otroProducto) {
	        return this.sku.compareTo(otroProducto.sku);
	    }

}