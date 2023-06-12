package com.tienda.proyecto.modelos;

public class ProductoBase extends Producto {

    private double largo;
    private double ancho;
    private double alto;
    private double peso;
    private boolean esRegalo;
    

    public ProductoBase() {
		super();
	}

	public ProductoBase(String nombre, double precioBase, IVA iva, DetalleProducto detalleProducto, double largo, double ancho, double alto, double peso, boolean esRegalo) {
		super(nombre, precioBase, iva, detalleProducto);
		
		this.largo=largo;
		this.ancho=ancho;
		this.alto=alto;
		this.peso=peso;
		this.esRegalo=esRegalo;
	}

	/**
	 * @return the largo
	 */
	public double getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(double largo) {
		this.largo = largo;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the esRegalo
	 */
	public boolean isEsRegalo() {
		return esRegalo;
	}

	/**
	 * @param esRegalo the esRegalo to set
	 */
	public void setEsRegalo(boolean esRegalo) {
		this.esRegalo = esRegalo;
	}
/**
 * Si esRegalo es true, se suma dos euros al precioBase
 * @return
 */
	public double calcularTotal() {
	    if (esRegalo) {
	        return precioBase + 2;
	    } else {
	        return precioBase;
	    }
	}
	
	  @Override
	    public boolean toPDF() {
	 
	        System.out.println("Generando PDF para el producto " + getSku() + "...");
			return true;
	    }
	  
	  /**
	   * Suma una determinada cantidad al precio del producto dependiendo del peso del mismo
	   * @param costeFlete
	   * @param pesoFlete
	   * @return
	   */
	  public double gastoTransporte(double costeFlete, double pesoFlete) {
		    double costeTransporte = 0;
		    if (pesoFlete < 10) {
		        costeTransporte = costeFlete + 5;
		    } else if (pesoFlete >= 10 && pesoFlete <= 50) {
		        costeTransporte = costeFlete + 10;
		    } else if (pesoFlete > 50) {
		        costeTransporte = costeFlete + 20;
		    }
		    return costeTransporte;
		}

		/**
		 * Calcula el importe
		 */
		@Override
		public double getImporte() {
		    double importe = getPrecioBase() + gastoTransporte(0, getPeso()) + calcularTotal() + calcularIVA();
		    return importe;
		}

}