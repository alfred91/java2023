package com.tienda.proyecto.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import com.tienda.proyecto.modelos.DetalleProducto;
import com.tienda.proyecto.modelos.IVA;
import com.tienda.proyecto.modelos.Producto;
import com.tienda.proyecto.modelos.ProductoBase;
import com.tienda.proyecto.modelos.ProductoVirtual;
import com.tienda.proyecto.modelos.ProductoVirtual.TipoVirtual;
/**
 * @author Apache
 * 
 *	Clase TiendaFile
 *	Contiene los metodos para cargar poductosBase y productosVirtuales, tambien para grabarlos
 *
 */
public class TiendaFile {
    private static final String PRODUCTOS_BASE_CSV = "productosbase.csv";
    private static final String PRODUCTOS_VIRTUAL_CSV = "productosvirtual.csv";

    /**
     * Carga los productos desde los archivos CSV
     *
     * @return La lista de productos cargada desde los archivos CSV
     */
    public static List<Producto> cargarProductos() {
        List<Producto> productos = cargarProductosBaseCSV();
        productos.addAll(cargarProductosVirtualCSV());
        return productos;
    }

    /**
     * Carga los productos base desde el archivo CSV
     *
     * @return La lista de productos base cargada desde el archivo CSV
     */
    private static List<Producto> cargarProductosBaseCSV() {
        try {
            InputStream inputStream = TiendaFile.class.getResourceAsStream("/csv/" + PRODUCTOS_BASE_CSV);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            /**
             * Ignorar la primera línea
             */
            reader.readLine();

            return reader.lines()
                    .map(line -> {
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
                        return new ProductoBase(nombre, precioBase, iva, detalleProducto, largo, ancho, alto, peso, esRegalo);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * Carga los productos virtuales desde el CSV
     *
     * @return La lista de productos virtuales cargada desde el archivo CSV
     */
    private static List<Producto> cargarProductosVirtualCSV() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        try {
            InputStream inputStream = TiendaFile.class.getResourceAsStream("/csv/" + PRODUCTOS_VIRTUAL_CSV);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            /**
             * Ignorar la primera línea
             */
            reader.readLine();

            return reader.lines()
                    .map(line -> {
                        String[] data = line.split(",");
                        String nombre = data[0];
                        double precioBase = Double.parseDouble(data[1]);
                        IVA iva = IVA.valueOf(data[2]);
                        String url = data[3];
                        String foto = data[4];
                        String categorias = data[5];
                        String marca = data[6];
                        LocalDateTime fechaCreacion = LocalDate.parse(data[7], formatter).atStartOfDay();
                        long pesoBytes = Long.parseLong(data[8]);
                        String URLDescarga = data[9];
                        TipoVirtual tipo = TipoVirtual.valueOf(data[10]);

                        DetalleProducto detalleProducto = new DetalleProducto(url, foto, categorias, marca, fechaCreacion);
                        return new ProductoVirtual(nombre, precioBase, iva, detalleProducto, pesoBytes, URLDescarga, tipo);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Graba los productos en los archivos CSV
     *
     * @param productos La lista de productos a grabar en los archivos CSV
     */
    public static void grabarProductos(List<Producto> productos) {
        grabarProductosBaseCSV(productos);
        grabarProductosVirtualCSV(productos);
    }

    /**
     * Graba los productos base en el archivo CSV
     *
     * @param productos La lista de productos a grabar en el archivo CSV
     */
    private static void grabarProductosBaseCSV(List<Producto> productos) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(getFilePath(PRODUCTOS_BASE_CSV)))) {
            writer.println("nombre,precioBase,iva,largo,ancho,alto,peso,esRegalo");

            productos.stream()
                    .filter(producto -> producto instanceof ProductoBase)
                    .map(producto -> (ProductoBase) producto)
                    .forEach(productoBase -> {
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
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Graba los productos virtuales en el archivo CSV
     *
     * @param productos La lista de productos a grabar en el archivo CSV
     */
    private static void grabarProductosVirtualCSV(List<Producto> productos) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(getFilePath(PRODUCTOS_VIRTUAL_CSV)))) {
            writer.println("nombre,precioBase,iva,url,foto,categorias,marca,fechaCreacion,pesoBytes,URLDescarga,tipo");

            productos.stream()
                    .filter(producto -> producto instanceof ProductoVirtual)
                    .map(producto -> (ProductoVirtual) producto)
                    .forEach(productoVirtual -> {
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
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Obtiene la ruta del archivo dentro del JAR
     *
     * @param filename Nombre del archivo
     * @return Ruta del archivo
     */
    private static Path getFilePath(String filename) {
        try {
            ClassLoader classLoader = TiendaFile.class.getClassLoader();
            return Paths.get(classLoader.getResource("csv/" + filename).toURI());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}