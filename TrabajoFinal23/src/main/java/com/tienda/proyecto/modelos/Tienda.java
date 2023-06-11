package com.tienda.proyecto.modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public void abrirCSV() {
        abrirCSV("productosbase.csv");
        abrirCSV("productosvirtual.csv");
    }

    public void abrirCSV(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            productos.addAll(br.lines()
                    .map(linea -> linea.split(","))
                    .map(campos -> {
                        if (archivo.equals("productosbase.csv")) {
                            return crearProductoBase(campos);
                        } else if (archivo.equals("productosvirtual.csv")) {
                            return crearProductoVirtual(campos);
                        }
                        return null;
                    })
                    .filter(producto -> producto != null)
                    .collect(Collectors.toList()));
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo CSV: " + archivo);
        }
    }

    private ProductoBase crearProductoBase(String[] campos) {
        if (campos.length == 8) {
            String nombre = campos[0].trim();
            double precioBase = Double.parseDouble(campos[1].trim());
            IVA iva = IVA.valueOf(campos[2].trim().toUpperCase());
            double largo = Double.parseDouble(campos[3].trim());
            double ancho = Double.parseDouble(campos[4].trim());
            double alto = Double.parseDouble(campos[5].trim());
            double peso = Double.parseDouble(campos[6].trim());
            boolean esRegalo = Boolean.parseBoolean(campos[7].trim());

            DetalleProducto detalleProducto = new DetalleProducto("", "", "", "", LocalDateTime.now());
            return new ProductoBase(nombre, precioBase, iva, detalleProducto, largo, ancho, alto, peso, esRegalo);
        }
        return null;
    }

    private ProductoVirtual crearProductoVirtual(String[] campos) {
        if (campos.length == 9) {
            String nombre = campos[0].trim();
            double precioBase = Double.parseDouble(campos[1].trim());
            IVA iva = IVA.valueOf(campos[2].trim().toUpperCase());
            long pesoBytes = Long.parseLong(campos[3].trim());
            String urlDescarga = campos[4].trim();
            ProductoVirtual.TipoVirtual tipo = ProductoVirtual.TipoVirtual.valueOf(campos[5].trim().toUpperCase());

            DetalleProducto detalleProducto = new DetalleProducto("", "", "", "", LocalDateTime.now());
            return new ProductoVirtual(nombre, precioBase, iva, detalleProducto, pesoBytes, urlDescarga, tipo);
        }
        return null;
    }

    public void grabarCSV() {
        grabarCSV("productosbase.csv", productos.stream().filter(p -> p instanceof ProductoBase).collect(Collectors.toList()));
        grabarCSV("productosvirtual.csv", productos.stream().filter(p -> p instanceof ProductoVirtual).collect(Collectors.toList()));
    }

    public void grabarCSV(String archivo, List<Producto> listaProductos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(listaProductos.stream()
                    .map(Producto::toCSV)
                    .collect(Collectors.joining("\n")));
        } catch (IOException e) {
            System.out.println("Error al grabar el archivo CSV: " + archivo);
        }
    }
}