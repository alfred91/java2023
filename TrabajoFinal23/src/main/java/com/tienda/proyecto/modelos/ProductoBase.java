package com.tienda.proyecto.modelos;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 * 
 * @author Apache
 * Clase ProductoBase, hereda de Producto
 */
public class ProductoBase extends Producto {

    private double largo;
    private double ancho;
    private double alto;
    private double peso;
    private boolean esRegalo;    
/**
 * Constructor vacio.
 */
    public ProductoBase() {
    	
	}

    /**
     * Constructor parametrizado
     * 
     * @param nombre
     * @param precioBase
     * @param iva
     * @param detalleProducto
     * @param largo
     * @param ancho
     * @param alto
     * @param peso
     * @param esRegalo
     */
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
 * Si esRegalo = true, se suman dos euros al precioBase
 * @return
 */
	public double calcularTotal() {
	    if (esRegalo) {
	        return precioBase + 2;
	    } else {
	        return precioBase;
	    }
	}
	
	/**
	 * Metodo para imprimir un PDF de un ProductoBase con sus detalles, sobreescribe al metodo de la clase padre Producto
	 */
	@Override
	public boolean toPDF() {
	    try {
	        /**
	         * Crear un nuevo documento PDF
	         */
	        PDDocument document = new PDDocument();
	        
	        /**
	         * Crear una nueva página y agregarla al documento
	         */
	        PDPage page = new PDPage();
	        document.addPage(page);

	        /**
	         * Crear un nuevo flujo de contenido para agregar contenido a la pagina
	         */
	        PDPageContentStream contentStream = new PDPageContentStream(document, page);

	        /**
	         * Iniciar un nuevo bloque de texto
	         */
	        contentStream.beginText();
	        
	        /**
	         * Establece la fuente y el tamaño del texto
	         */
	        contentStream.setFont(PDType1Font.HELVETICA, 12);
	        
	        /**
	         *  Mover el cursor a la posicion donde comineza el texto
	         */
	        contentStream.newLineAtOffset(25, 700);

	        /**
	         *  Escribir la informacion del producto
	         */
	        contentStream.showText("Nombre: " + getNombre());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Precio Base: " + getPrecioBase());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("IVA: " + getIva());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Largo: " + getLargo());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Ancho: " + getAncho());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Alto: " + getAlto());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Peso: " + getPeso());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Es regalo: " + (isEsRegalo() ? "Si" : "No"));
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("SKU: " + getSku());
	        contentStream.newLineAtOffset(0, -15);
	        
	        /**
	         *  Finaliza el texto y cierra el flujo de contenido, guarda el documento y lo cierra
	         */
	        contentStream.endText();
	        contentStream.close();
	        document.save(getSku() + ".pdf");
	        document.close();

	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	  /**
	   * Suma una determinada cantidad al precio del producto dependiendo del peso del mismo
	   * @param costeFlete
	   * @param pesoFlete
	   * @return costeTransporte
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
		 * Calcula el importe total
		 * @return importe
		 */
		@Override
		public double getImporte() {
		    double importe = getPrecioBase() + gastoTransporte(0, getPeso()) + calcularTotal() + calcularIVA();
		    return importe;
		}

}
