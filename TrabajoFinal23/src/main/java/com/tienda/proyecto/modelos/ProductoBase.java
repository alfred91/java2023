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
	  
	  
	    public double gastoTransporte(double costeFlete, double pesoFlete) {
	        double costeTransporte = 0;
	        if (this.peso < 10) {
	            costeTransporte = this.precioBase + 5;
	        } else if (this.peso >= 10 && this.peso <= 50) {
	            costeTransporte = this.precioBase + 10;
	        } else if (this.peso > 50) {
	            costeTransporte = this.precioBase + 20;
	        }
	        return costeTransporte;
	    }
	  
	  
	@Override
	public double getImporte() {
        double importe = getPrecioBase() + gastoTransporte(0,0) + calcularTotal() + calcularIVA();
        return importe;
    }
}