package com.tienda.proyecto.modelos;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	
    private List<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<Producto>();
    }


    public Tienda(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}


	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}


	public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }
}