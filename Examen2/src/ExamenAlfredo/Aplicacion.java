package ExamenAlfredo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
	
    public static void main(String[] args) {
    	
        Tienda tienda = new Tienda();
        tienda.addProducto(new Producto("1", "Adidas Terrex", 60, 1));
        tienda.addProducto(new Producto("2", "Nike air", 60, 2));
        tienda.addProducto(new Producto("3", "Zapatillas DC", 40, 3));
        tienda.addProducto(new Producto("4", "Abrigo Puma", 80, 4));
        tienda.addProducto(new Producto("5", "Gorro Fila", 20, 5));
        tienda.addProducto(new Producto("6", "Pantalones Kelme", 35, 6));

        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do {
        	
            System.out.println(" M E N U ");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Mostrar Compras");
            System.out.println("4. Mostrar Compras por mes");
            System.out.println("5. Hacer Compra");
            System.out.println("6. Salir");
            
            opcion = sc.nextInt();
            
	            switch (opcion) {
	            
	                case 1:
	                    tienda.mostrarInventario();
	                    break;
	                    
	                case 2:
	                    System.out.println("Dime el nombre del producto a buscar:");
	                    String nombre = sc.next();
	                    tienda.buscarProducto(nombre);
	                    break;
	                    
	                case 3:
	                    tienda.mostrarCompras();
	                    break;
	                    
	                case 4:
	                    System.out.println("Dime el mes (1 - 12):");
	                    int mes = sc.nextInt();
	                    tienda.mostrarCompras();
	                    break;
	                    
	                case 5:
	                    Compra compra = new Compra(LocalDate.now());
	                    boolean agregarOtraLinea = true;
	                    
	                    do {
	                        System.out.println("Dime el id del producto:");
	                        int idProducto = sc.nextInt();
	                        System.out.println("Dime la cantidad:");
	                        int cantidad = sc.nextInt();
	                        
	                        ArrayList<Producto> producto = tienda.buscarProducto(idProducto);
	                        if (producto == null) {
	                            System.out.println("No hay productos con ese id.");
	                            
	                        } else { 
	                        	
	                        mes = sc.nextInt();
	                         LineaCompra lineaCompra = new LineaCompra(mes, producto, cantidad);
	                            compra.addLinea(lineaCompra);
	                        }
	                        
	                        System.out.println("¿Desea agregar otra línea de compra? (s/n)");
	                        String respuesta = sc.next();
	                        
	                        agregarOtraLinea = respuesta.equalsIgnoreCase("s");
	                        
	                    } while (agregarOtraLinea);
	                    
	                    tienda.addProducto(compra);
	                    System.out.println(compra);
	                    break;
	                    
	                case 6:
	                    System.out.println("Hasta pronto!");
	                    break;
	                    
	                default:
	                	
	                    System.out.println("Opción inválida.");
	                    break;
	            }
	        } while (opcion != 6);
    }
}