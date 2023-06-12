package com.tienda.proyecto.modelos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.tienda.proyecto.modelos.ProductoVirtual.TipoVirtual;

	/**
	 * La clase Tienda representa una tienda virtual que gestiona una lista de productos.
	 */
public class Tienda {
	
    private List<Producto> productos;
    
	/**
	 * Constructor
	 */
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor de la clase Tienda que permite inicializar la lista de productos con una lista existente.
     *
     * @param productos La lista de productos a asignar a la tienda.
     */
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

	/**
	 * Agregar un producto
	 * @param p
	 */
	public void agregarProducto(Producto p) {
        productos.add(p);
    }

	/**
	 * Eliminar un producto
	 * @param p
	 */
    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    /**
     * 
     * @return Productos con un precio superior a 3000 euros
     */
    public List<Producto> mostrarProductosConPrecioSuperiorA3000() {
        return productos.stream()
                .filter(p -> p.getPrecioBase() > 3000)
                .collect(Collectors.toList());
    }
    
    /**
     * Buscar productos según un criterio
     * @param criterio Predicado para el filtro
     */
    public void buscar(Predicate<Producto> criterio) {
        productos.stream()
                .filter(criterio)
                .forEach(System.out::println);
    }
  
    /**
     * Obtener un producto por su SKU
     * @param sku SKU del producto
     * @return Producto encontrado o null si no existe
     */
    public Producto getProducto(String sku) {
        return productos.stream()
                .filter(p -> p.getSku().equals(sku))
                .findFirst()
                .orElse(null);
    }

    /**
     * Obtener la lista de productos virtuales
     * @return Lista de productos virtuales
     */
    public List<Producto> getProductosVirtuales() {
        return productos.stream()
                .filter(p -> p instanceof ProductoVirtual)
                .collect(Collectors.toList());
    }

    /**
     * Obtener los productos ordenados por precio
     * @return Conjunto de productos ordenados por precio
     */
    public Set<Producto> getProductosPrecio() {
        return productos.stream()
                .sorted(Comparator.comparingDouble(Producto::getPrecioBase))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Obtener los productos agrupados por categoría
     * @return Mapa de productos agrupados por categoría
     */
    public Map<String, List<Producto>> getProductosPorCategoria() {
        return productos.stream()
                .collect(Collectors.groupingBy(p -> p.getDetalleProducto().getCategorias()));
    }     
    
    /**
     * Crea y agrega un productoBase al catlogo, por ultimpo comprueba si el producto se ha agredado o no
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
    public void crearYAgregarProductoBase(String nombre, double precioBase, IVA iva, DetalleProducto detalleProducto, double largo, double ancho, double alto, double peso, boolean esRegalo) {
        ProductoBase productoBase = new ProductoBase(nombre, precioBase, iva, detalleProducto, largo, ancho, alto, peso, esRegalo);
        agregarProducto(productoBase);

        boolean productoBaseAgregado = getProductos().stream()
                .filter(p -> p instanceof ProductoBase)
                .anyMatch(p -> p.getNombre().equals(nombre));

        if (productoBaseAgregado) {
            System.out.println("El producto ha sido agregado correctamente.");
        } else {
            System.out.println("No ha sido posible agregar el producto.");
        }
    }

    /**
     * Muestra los productos virtuales de tipo videojuego
     * @return Lista de productos virtuales de tipo videojuego
     */
    public List<Producto> mostrarProductosVirtualesTipoVideo() {
        return productos.stream()
                .filter(p -> p instanceof ProductoVirtual)
                .filter(p -> ((ProductoVirtual) p).getTipo() == TipoVirtual.VIDEO || ((ProductoVirtual) p).getTipo() == TipoVirtual.VIDEOJUEGO)
                .collect(Collectors.toList());
    }   

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}

}