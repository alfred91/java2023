package com.tienda.proyecto.modelos;

import java.util.Scanner;
import java.util.List;

public class App {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
		Tienda catalogo= new Tienda();
		
		       abrirCSV("productosbase.csv");
		       
		       abrirCSV("productosvirtual.csv");

		        Scanner scanner = new Scanner(System.in);
		        String opcion;

		        do {
		            mostrarMenu();
		            opcion = scanner.nextLine();

		            switch (opcion) {
		                case "a":
		                    mostrarProductosSuperioresA3000(catalogo);
		                    break;
		                case "b":
		                    mostrarCategoriasConCantidadProductos(catalogo);
		                    break;
		                case "c":
		                    mostrarProductosOrdenadosPorPrecio(catalogo);
		                    break;
		                case "d":
		                    mostrarTresProductosMasBaratos(catalogo);
		                    break;
		                case "e":
		                    agregarProductoBaseAlCatalogo(catalogo);
		                    break;
		                case "f":
		                    mostrarProductosVirtualesVideoVideoJuego(catalogo);
		                    break;
		                case "g":
		                    System.out.println("Saliendo del programa...");
		                    break;
		                default:
		                    System.out.println("Opción no válida. Por favor, selecciona una opción válida del menú.");
		                    break;
		            }
		        } while (!opcion.equals("g"));

		        scanner.close();
		    }

		    public static void mostrarMenu() {
		        System.out.println("--- MENÚ ---");
		        System.out.println("a. Muestra todos los productos cuyo precio sea superior a 3000€");
		        System.out.println("b. Muestra las categorías con el número de productos que hay en cada una");
		        System.out.println("c. Muestra los productos ordenados por precio");
		        System.out.println("d. Obtén los 3 productos más baratos");
		        System.out.println("e. Crea y añade un producto base al catálogo");
		        System.out.println("f. Muestra los productos virtuales que sean de tipo Video o VideoJuego");
		        System.out.println("g. Salir");
		        System.out.print("Seleccione una opción: ");
		    }

		    public static void mostrarProductosSuperioresA3000(Tienda catalogo) {
		        List<Producto> productosSuperioresA3000 = catalogo.obtenerProductosSuperioresA(3000);
		        System.out.println("--- Productos con precio superior a 3000€ ---");
		        for (Producto producto : productosSuperioresA3000) {
		            System.out.println(producto);
		        }
		        System.out.println();
		    }

		    public static void mostrarCategoriasConCantidadProductos(Tienda catalogo) {
		        System.out.println("--- Categorías y cantidad de productos ---");
		        catalogo.mostrarCantidadProductosPorCategoria();
		        System.out.println();
		    }

		    public static void mostrarProductosOrdenadosPorPrecio(Tienda catalogo) {
		        List<Producto> productosOrdenadosPorPrecio = catalogo.obtenerProductosOrdenadosPorPrecio();
		        System.out.println("--- Productos ordenados por precio ---");
		        for (Producto producto : productosOrdenadosPorPrecio) {
		            System.out.println(producto);
		        }
		        System.out.println();
		    }

		    public static void mostrarTresProductosMasBaratos(Tienda catalogo) {
		        List<Producto> tresProductosMasBaratos = catalogo.obtenerTresProductosMasBaratos();
		        System.out.println("--- Tres productos más baratos ---");
		        for (Producto producto : tresProductosMasBaratos) {
		            System.out.println(producto);
		        }
		        System.out.println();
		    }

		    public static void agregarProductoBaseAlCatalogo(Tienda catalogo) {
		        // Aquí debes crear y agregar un nuevo ProductoBase al catálogo utilizando los valores deseados
		        // Ejemplo:
		        ProductoBase productoBase = new ProductoBase("Nuevo Producto", 100, IVA.IVA_21, new DetalleProducto("url", "foto", "categorias", "marca", LocalDateTime.now()));
		        catalogo.agregarProducto(productoBase);
		        System.out.println("Producto base agregado al catálogo.");
		        System.out.println();
		    }

		    public static void mostrarProductosVirtualesVideoVideoJuego(Tienda catalogo) {
		        List<Producto> productosVirtualesVideoVideoJuego = catalogo.obtenerProductosVirtualesTipo(TipoVirtual.VIDEO, TipoVirtual.VIDEOJUEGO);
		        System.out.println("--- Productos virtuales de tipo Video o VideoJuego ---");
		        for (Producto producto : productosVirtualesVideoVideoJuego) {
		            System.out.println(producto);
		        }
		        System.out.println();
		    }
		

	
		

		
	
	private static void abrirCSV(Object string) {
	}}
	
