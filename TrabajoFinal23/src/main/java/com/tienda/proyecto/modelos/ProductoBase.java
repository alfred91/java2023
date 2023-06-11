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


	public ProductoBase(String nombre, double precioBase, IVA iva, DetalleProducto detalleProducto) {
		super(nombre, precioBase, iva, detalleProducto);
		
		this.largo=largo;
		this.ancho=ancho;
		this.alto=alto;
		this.peso=peso;
		this.esRegalo=esRegalo;
	}


	public double calcularTotal() {
		double precioregalo=precioBase;
		
           if (esRegalo) {
           precioregalo=precioBase+2;
        }
        return precioregalo;
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