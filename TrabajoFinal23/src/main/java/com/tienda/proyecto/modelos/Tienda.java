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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}


	public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
    }
}