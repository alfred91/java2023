package com.tienda.proyecto.modelos;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.tienda.proyecto.io.TiendaFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
/**
 * 
 * @author Apache
 *Esta clase contiene el método main y contiene un menu 
 *
 */
public class App {
	/**
	 * Metodo main de la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {

		Tienda catalogo = new Tienda();

	        /**
	         * Cargar los productos desde los archivos CSV
	         */
	        List<Producto> productos = TiendaFile.cargarProductos();
	        catalogo.setProductos(productos);
		        Scanner sc = new Scanner(System.in);
		        String opcion;

		        do {
		            Menu();
		            opcion = sc.nextLine();

		            switch (opcion) {
		            
		            case "a":
		                List<Producto> productosSuperioresA3000 = catalogo.mostrarProductosConPrecioSuperiorA3000();
		                System.out.println("Productos de mas de 3000 eur");
	                    productosSuperioresA3000.forEach(System.out::println);
		                break;

		            case "b":
	                    System.out.println("Productos por categoria:");
	                    catalogo.getProductosPorCategoria().forEach((categoria, productosCategoria) -> {
	                        System.out.println("Categoria: " + categoria);
	                        System.out.println("Numero de productos: " + productosCategoria.size());
	                        System.out.println("---------------------------");
	                    });
	                    break;
	               
		            case "c":
	                    System.out.println("Productos ordenados por precio:");
	                    catalogo.getProductosPrecio().forEach(System.out::println);
	                    break;

		                
		            case "d":
		                List<Producto> tresProductosMasBaratos = catalogo.getProductos()
		                        .stream()
		                        .sorted(Comparator.comparingDouble(Producto::getPrecioBase))
		                        .limit(3)
		                        .collect(Collectors.toList());

		                System.out.println(" Los 3 productos mas baratos ");
		                tresProductosMasBaratos.forEach(System.out::println);
		                break;
		                
		                
		            case "e":
		                System.out.println("Crear y agregar un producto base al catalogo:");

			                System.out.print("Nombre: ");
			                String nombre = sc.nextLine();
	
			                System.out.print("Precio Base: ");
			                double precioBase = sc.nextDouble();
			                sc.nextLine();
	
			                System.out.print("IVA (GENERAL, REDUCIDO, SUPERREDUCIDO): ");
			                IVA iva = IVA.valueOf(sc.nextLine());
	
			                System.out.print("URL: ");
			                String url = sc.nextLine();
	
			                System.out.print("Foto: ");
			                String foto = sc.nextLine();
	
			                System.out.print("Categorias: ");
			                String categorias = sc.nextLine();
	
			                System.out.print("Marca: ");
			                String marca = sc.nextLine();
	
			                System.out.print("Fecha de creacion (M/d/yyyy): ");
			                String fechaCreacionStr = sc.nextLine();
			                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
			                LocalDateTime fechaCreacion = LocalDate.parse(fechaCreacionStr, formatter).atStartOfDay();
	
			                System.out.print("Largo: ");
			                double largo = sc.nextDouble();
	
			                System.out.print("Ancho: ");
			                double ancho = sc.nextDouble();
	
			                System.out.print("Alto: ");
			                double alto = sc.nextDouble();
	
			                System.out.print("Peso: ");
			                double peso = sc.nextDouble();
	
			                System.out.print("Es regalo? (true/false): ");
			                boolean esRegalo = sc.nextBoolean();

		               		                DetalleProducto detalleProducto = new DetalleProducto(url, foto, categorias, marca, fechaCreacion);
		                catalogo.crearYAgregarProductoBase(nombre, precioBase, iva, detalleProducto, largo, ancho, alto, peso, esRegalo);
		                break;
		                		                    
		            case "f":
		                	List<Producto> productosTipoVideo = catalogo.mostrarProductosVirtualesTipoVideo();
		                    System.out.println("Productos virtuales de tipo Video o VideoJuego:");
		                    productosTipoVideo.forEach(System.out::println);
		                    break;
		 		                    
		            case "g":
		                    System.out.println("Saliendo del programa...");
		                    break;     
		                    
		            case "h":
		                System.out.println("Imprimir detalles de un producto en PDF");
		                System.out.print("Ingresa el SKU del producto: ");
		                String sku = sc.nextLine();
		                Producto producto = catalogo.getProducto(sku);
		                if (producto != null && producto instanceof ProductoBase) {
		                    if (((ProductoBase) producto).toPDF()) {
		                        System.out.println("Se generó el archivo PDF con los detalles del producto con éxito");
		                    } else {
		                        System.out.println("Hubo un error al generar el archivo PDF");
		                    }
		                } else {
		                    System.out.println("No se encontró un ProductoBase con el SKU proporcionado");
		                }
		                break;
		            		                    
		            default:
		                    System.out.println("Elige una opcion correcta.");
		                    break;
		            }
		        } while (!opcion.equals("g"));

		        sc.close();
		    }
			
			/**
			 * Esto es un menu para mostrar y agregar productos a la tienda
			 */
		    public static void Menu() {
		    	
		        System.out.println(" -----[ MENU ]----- ");
		        System.out.println();
		        System.out.println("a. Muestra todos los productos cuyo precio sea superior a 3000€");
		        System.out.println("b. Muestra las categorias con el número de productos que hay en cada una");
		        System.out.println("c. Muestra los productos ordenados por precio");
		        System.out.println("d. Mostrar los 3 productos mas baratos");
		        System.out.println("e. Crear y agregar un producto base al catalogo");
		        System.out.println("f. Muestra los productos virtuales que sean de tipo Video o VideoJuego");
		        System.out.println("g. Salir");
		        System.out.println("H Imprimir productoBase a pdf (experimental)");
		        System.out.println();
		        System.out.print("Seleccione una opcion: ");
		    }

}