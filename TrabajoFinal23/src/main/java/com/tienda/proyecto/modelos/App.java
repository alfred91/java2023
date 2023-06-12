package com.tienda.proyecto.modelos;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;

public class App {
	

	public static void main(String[] args) {

	
		Tienda catalogo= new Tienda();
		
		       catalogo.abrirCSV();
		       
		        Scanner sc = new Scanner(System.in);
		        String opcion;

		        do {
		            Menu();
		            opcion = sc.nextLine();

		            switch (opcion) {
		            
		            case "a":
		                List<Producto> productosSuperioresA3000 = catalogo.mostrarProductosConPrecioSuperiorA3000();
		                System.out.println("Productos de mas de 3000 eur");
		                productosSuperioresA3000.stream()
		                    .forEach(System.out::println);
		                break;

		            case "b":
		            	System.out.println("--- Productos por categoría ---");
		            	catalogo.getProductos()
		            	        .stream()
		            	        .collect(Collectors.groupingBy(p -> p.getDetalleProducto().getCategorias()))
		            	        .forEach((categoria, productos) -> {
		            	            System.out.println("Categoría: " + categoria);
		            	            System.out.println("Número de productos: " + productos.size());
		            	            System.out.println("----------------------");
		            	        });
		                break;

		                
		            case "c":
		                System.out.println(" Productos ordenados por precio ");
		                catalogo.getProductos()
		                        .stream()
		                        .sorted(Comparator.comparingDouble(Producto::getPrecioBase))
		                        .forEach(System.out::println);
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
		            	catalogo.crearYAgregarProductoBase("Producto Base 1", 5000, IVA.GENERAL, new DetalleProducto("", "", "", "", null), 0, 0, 0, 0, false);
		                
		                List<Producto> productos = catalogo.getProductos();
		                
		                boolean productoBaseAgregado = productos.stream()
		                        .anyMatch(p -> p instanceof ProductoBase && p.getNombre().equals("Producto Base 1"));
		                
		                if (productoBaseAgregado) {
		                    System.out.println("El producto base ha sido agregado al catálogo.");

		                } else {
		                    System.out.println("No se ha agregado el producto base al catálogo.");
		                }
		                break;
		                		                    
		            case "f":
		                	List<Producto> productosTipoVideo = catalogo.mostrarProductosVirtualesTipoVideo();
		                    System.out.println("Productos virtuales de tipo Video o VideoJuego:");
		                    productosTipoVideo.forEach(System.out::println);
		                    break;
		 		                    
		            case "g":
		                    System.out.println("Saliendo del programa...");
		                    break;
		                    
		            default:
		                    System.out.println("Opción no válida. Por favor, selecciona una opción válida del menú.");
		                    break;
		            }
		        } while (!opcion.equals("g"));

		        sc.close();
		    }

		    public static void Menu() {
		    	
		        System.out.println("	-  MENU  - ");
		        System.out.println("a. Muestra todos los productos cuyo precio sea superior a 3000€");
		        System.out.println("b. Muestra las categorías con el número de productos que hay en cada una");
		        System.out.println("c. Muestra los productos ordenados por precio");
		        System.out.println("d. Obtén los 3 productos más baratos");
		        System.out.println("e. Crea y añade un producto base al catálogo");
		        System.out.println("f. Muestra los productos virtuales que sean de tipo Video o VideoJuego");
		        System.out.println("g. Salir");
		        System.out.print("Seleccione una opción: ");
		    }

}