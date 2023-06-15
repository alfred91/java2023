package com.tienda.proyecto.modelos;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
/**
 * 
 * @author Apache
 * Clase ProductoVirtual, hereda de Producto
 */
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
/**
 * Metodo para imprimir un PDF de un ProductoVirtual, sobreescribe al metodo de la clase padre Producto
 */
	@Override
	public boolean toPDF() {
	    try {
	        /**
	         * Crear un nuevo documento PDF
	         */
	        PDDocument document = new PDDocument();
	        
	        /**
	         *  Crear una nueva pagina y agregarla al documento
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
	         * Mueve el cursor a la posicion donde empieza el texto
	         */
	        contentStream.newLineAtOffset(25, 700);

	        /*
	         * Escribir la informacion de Producto
	         */
	        contentStream.showText("Nombre: " + getNombre());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Precio Base: " + getPrecioBase());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("IVA: " + getIva());
	        contentStream.newLineAtOffset(0, -15);
	        
	        /**
	         * Agrega la informacion de ProductoVirtual
	         */
	        contentStream.showText("Peso en Bytes: " + getPesoBytes());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("URL de Descarga: " + getURLDescarga());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("Tipo de Producto Virtual: " + getTipo());
	        contentStream.newLineAtOffset(0, -15);
	        contentStream.showText("SKU: " + getSku());
	        contentStream.newLineAtOffset(0, -15);

	        /**
	         * Finaliza el texto, cierra el flujo de contenido y guarda el documento
	         * Cierra el documento
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
	 * Metodo para calcular el importe con IVA
	 * @return calcularIVA
	 */
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