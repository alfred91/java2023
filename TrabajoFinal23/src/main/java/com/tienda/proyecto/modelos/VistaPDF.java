package com.tienda.proyecto.modelos;
/**
 * 
 * @author Apache
 *Interfaz vistaPDF con el metodo toPDF que implementan las clases Producto, ProductoBase y ProductoVirtual
 *
 */
public interface VistaPDF {
	
/**
 * Imprime el objeto a PDF
 * @return true si se ha impreso 
 */
	boolean toPDF();
}