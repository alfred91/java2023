package com.tienda.proyecto.modelos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.tienda.proyecto.modelos.ProductoVirtual.TipoVirtual;

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
     * Abrir CSV
     */
    public void abrirCSV() {
        abrirProductosBaseCSV();
        abrirProductosVirtualCSV();
    }
    
    /**
     * Carga los productos Base desde el archivo CSV
     */
    private void abrirProductosBaseCSV() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/csv/productosbase.csv")))) {
            String line;
            boolean isFirstLine = true;
            
            /**
             * Ignorar la primera línea
             */
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; 
                }

                String[] data = line.split(",");
                String nombre = data[0];
                double precioBase = Double.parseDouble(data[1]);
                IVA iva = IVA.valueOf(data[2]);
                double largo = Double.parseDouble(data[3]);
                double ancho = Double.parseDouble(data[4]);
                double alto = Double.parseDouble(data[5]);
                double peso = Double.parseDouble(data[6]);
                boolean esRegalo = Boolean.parseBoolean(data[7]);

                DetalleProducto detalleProducto = new DetalleProducto("", "", "", "", null);
                ProductoBase productoBase = new ProductoBase(nombre, precioBase, iva, detalleProducto, largo, ancho, alto, peso, esRegalo);

                /**
                 * Agregar el producto base a la lista de productos
                 */
                productos.add(productoBase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga los productos Virtuales desde el archivo CSV
     */
    private void abrirProductosVirtualCSV() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/csv/productosvirtual.csv")))) {
            String line;
            boolean isFirstLine = true;

            /**
             * Ignorar la primera línea
             */
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                String nombre = data[0];
                double precioBase = Double.parseDouble(data[1]);
                IVA iva = IVA.valueOf(data[2]);
                String url = data[3];
                String foto = data[4];
                String categorias = data[5];
                String marca = data[6];
                LocalDateTime fechaCreacion = LocalDate.parse(data[7], DateTimeFormatter.ofPattern("M/d/yyyy")).atStartOfDay();
                long pesoBytes = Long.parseLong(data[8]);
                String URLDescarga = data[9];
                TipoVirtual tipo = TipoVirtual.valueOf(data[10]);

                DetalleProducto detalleProducto = new DetalleProducto(url, foto, categorias, marca, fechaCreacion);
                ProductoVirtual productoVirtual = new ProductoVirtual(nombre, precioBase, iva, detalleProducto, pesoBytes, URLDescarga, tipo);

                // Agregar el producto virtual a la lista de productos
                productos.add(productoVirtual);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void grabarCSV() {
        grabarProductosBaseCSV();
        grabarProductosVirtualCSV();
    }

    /**
     * Graba el archivo CSV de productos Base
     */
    private void grabarProductosBaseCSV() {
        String productosBaseCSV = "productosbasecopia.csv";
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(getFilePath(productosBaseCSV)))) {
            // Escribir los encabezados en el archivo CSV
            writer.println("nombre,precioBase,iva,largo,ancho,alto,peso,esRegalo");

            // Escribir los productos base en el archivo CSV
            for (Producto producto : productos) {
                if (producto instanceof ProductoBase) {
                    ProductoBase productoBase = (ProductoBase) producto;
                    String line = String.format("%s,%.2f,%s,%.2f,%.2f,%.2f,%.2f,%s",
                            productoBase.getNombre(),
                            productoBase.getPrecioBase(),
                            productoBase.getIva(),
                            productoBase.getLargo(),
                            productoBase.getAncho(),
                            productoBase.getAlto(),
                            productoBase.getPeso(),
                            productoBase.isEsRegalo());
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Graba el archivo CSV de productos Virtuales
     */
    private void grabarProductosVirtualCSV() {
        String productosVirtualCSV = "productosvirtualcopia.csv";
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(getFilePath(productosVirtualCSV)))) {
            /**
             * Escribir los encabezados en el archivo CSV
             */ 	
            writer.println("nombre,precioBase,iva,url,foto,categorias,marca,fechaCreacion,pesoBytes,URLDescarga,tipo");

            /**
             * Grabar los productos virtuales en el archivo CSV
             */
            
            for (Producto producto : productos) {
                if (producto instanceof ProductoVirtual) {
                    ProductoVirtual productoVirtual = (ProductoVirtual) producto;
                    String line = String.format("%s,%.2f,%s,%s,%s,%s,%s,%s,%d,%s,%s",
                            productoVirtual.getNombre(),
                            productoVirtual.getPrecioBase(),
                            productoVirtual.getIva(),
                            productoVirtual.getDetalleProducto().getUrl(),
                            productoVirtual.getDetalleProducto().getFoto(),
                            productoVirtual.getDetalleProducto().getCategorias(),
                            productoVirtual.getDetalleProducto().getMarca(),
                            productoVirtual.getDetalleProducto().getFechaCreacion(),
                            productoVirtual.getPesoBytes(),
                            productoVirtual.getURLDescarga(),
                            productoVirtual.getTipo());
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Obtiene la ruta del archivo dentro del JAR
     * @param filename Nombre del archivo
     * @return Ruta del archivo
     */
    private Path getFilePath(String filename) {
        try {
            return Paths.get(getClass().getResource("/csv/" + filename).toURI());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
   
    
    /**
     * 
     * @return Productos con un precio superior a 3000 euros
     */
    public List<Producto> mostrarProductosConPrecioSuperiorA3000() {
            List<Producto> productosSuperioresA3000 = productos.stream()
                .filter(p -> p.getPrecioBase() >= 3000)
                .collect(Collectors.toList());

            return productosSuperioresA3000;       
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
    public Map<Object, List<Producto>> getProductosPorCategoria() {
        return productos.stream()
                .collect(Collectors.groupingBy(p -> p.getDetalleProducto().getCategorias(),
                        Collectors.toList()));
    }      
    
    /**
     * Crea y agrega un producto base al catálogo
     * @param nombre Nombre del producto
     * @param precioBase Precio base del producto
     * @param iva IVA del producto
     * @param detalleProducto Detalles del producto
     * @param largo Largo del producto
     * @param ancho Ancho del producto
     * @param alto Alto del producto
     * @param peso Peso del producto
     * @param esRegalo Indica si el producto es un regalo
     */
    public void crearYAgregarProductoBase(String nombre, double precioBase, IVA iva, DetalleProducto detalleProducto, double largo, double ancho, double alto, double peso, boolean esRegalo) {
        ProductoBase productoBase = new ProductoBase(nombre, precioBase, iva, detalleProducto, largo, ancho, alto, peso, esRegalo);
        agregarProducto(productoBase);
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
}
