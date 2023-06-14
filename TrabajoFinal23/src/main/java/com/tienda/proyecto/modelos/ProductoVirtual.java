package com.tienda.proyecto.modelos;

public class ProductoVirtual extends Producto {

	public enum TipoVirtual {MUSICA,VIDEO,IMAGEN,VIDEOJUEGO,PROGRAMA}
	
	long pesoBytes;
	String URLDescarga;
	TipoVirtual tipo;
	
	public ProductoVirtual(String nombre, double precioBase, IVA iva, DetalleProducto detalleProducto, long pesoBytes, String uRLDescarga, TipoVirtual tipo) {
		
		super(nombre,precioBase,iva,detalleProducto);
		this.pesoBytes = pesoBytes;
		URLDescarga = uRLDescarga;
		this.tipo = tipo;
	}

	/**
	 * @return the pesoBytes
	 */
	public long getPesoBytes() {
		return pesoBytes;
	}

	/**
	 * @param pesoBytes the pesoBytes to set
	 */
	public void setPesoBytes(long pesoBytes) {
		this.pesoBytes = pesoBytes;
	}

	/**
	 * @return the uRLDescarga
	 */
	public String getURLDescarga() {
		return URLDescarga;
	}

	/**
	 * @param uRLDescarga the uRLDescarga to set
	 */
	public void setURLDescarga(String uRLDescarga) {
		URLDescarga = uRLDescarga;
	}

	/**
	 * @return the tipo
	 */
	public TipoVirtual getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoVirtual tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean toPDF() {
	    System.out.println("---------------------------------------------------");
	    System.out.println("              PRODUCTO  VIRTUAL                   ");
	    System.out.println("---------------------------------------------------");
	    System.out.println("Factura de Producto:");
	    System.out.println("  SKU: " + getSku());
	    System.out.println("  Nombre: " + getNombre());
	    System.out.println("  Precio Base: " + getPrecioBase());
	    System.out.println("  IVA: " + getIva());
	    System.out.println("  Detalles Producto: " + getDetalleProducto().toString());
	    System.out.println("  Peso en Bytes: " + getPesoBytes());
	    System.out.println("  URL de Descarga: " + getURLDescarga());
	    System.out.println("  Tipo de Producto Virtual: " + getTipo());
	    System.out.println("---------------------------------------------------");
	    System.out.println("  Precio Total con IVA: " + calcularIVA());
	    System.out.println("---------------------------------------------------");

	    return true;
	}


	public double getImporte() {
		
		return this.calcularIVA();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductoVirtual [sku=");
		builder.append(sku);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precioBase);
		builder.append(", iva=");
		builder.append(iva);
		builder.append(", detalle=");
		builder.append(detalleProducto);
		builder.append("ProductoVirtual [pesoBytes=");
		builder.append(pesoBytes);
		builder.append(", URLDescarga=");
		builder.append(URLDescarga);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
}
