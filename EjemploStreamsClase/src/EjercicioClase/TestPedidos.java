package EjercicioClase;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import EjercicioClase.Producto.Categoria;

public class TestPedidos {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("cliente1", "cliente1@gmail.com", 2);
		Cliente c2 = new Cliente("cliente2", "cliente2@gmail.com", 2);
		Cliente c3 = new Cliente("cliente3", "cliente3@gmail.com", 2);
		
		Producto pr1 = new Producto("Cuadro1", Categoria.CUADRO, 220.0);
		Producto pr2 = new Producto("Escultura1", Categoria.ESCULTURA, 320.0);
		Producto pr3 = new Producto("Cuadro2", Categoria.CUADRO, 590.0);
		Producto pr4 = new Producto("Fotografia1", Categoria.FOTOGRAFIA, 95.0);
		Producto pr5 = new Producto("Fotografia2", Categoria.FOTOGRAFIA, 195.0);
		Producto pr6 = new Producto("Cuadro3", Categoria.CUADRO, 330.0);
		
		Pedido pd1 = new Pedido(LocalDate.now(), null, c1);
		pd1.addProducto(pr1);
		pd1.addProducto(pr2);
		
		Pedido pd2 = new Pedido(LocalDate.now().minusMonths(2), null, c2);
		pd2.addProducto(pr3);
		pd2.addProducto(pr4);
		
		Pedido pd3 = new Pedido(LocalDate.now().minusDays(10), null, c3);
		pd3.addProducto(pr1);
		pd3.addProducto(pr5);
		
		Pedido pd4 = new Pedido(LocalDate.now(), null, c1);
		pd4.addProducto(pr2);
		pd4.addProducto(pr3);
		pd4.addProducto(pr4);
		
		List<Pedido> pedidos = Arrays.asList(pd1,pd2,pd3,pd4);
		List<Producto> productos = Arrays.asList(pr1,pr2,pr3,pr4,pr5,pr6);
		
		//STREAMS -----------------------------------------------------------
		//1. Fotografías cuyo precio sea mayor de 100
		productos.stream()
			.filter( p -> p.getCategoria().equals(Categoria.FOTOGRAFIA))
			.filter(p -> p.getPrecio() > 100)
			.forEach(System.out::println);
		
		//2. Pedidos que tengan algún producto de la categoría CUADRO
		pedidos.stream()
			.filter(ped -> ped.getProductos().stream()
								.anyMatch(prod -> prod.getCategoria().equals(Categoria.CUADRO)))
			.forEach(ped -> System.out.println(ped.getId()));
		
		//3. Modificar los productos que sean CUADRO y hay que rebajar su precio un 10%
		/*
		productos = productos.stream()
			.filter( prod -> prod.getCategoria().equals(Categoria.CUADRO))
			.peek( prod -> prod.setPrecio(prod.getPrecio()* (0.9)))
			.collect(Collectors.toList());
			
		productos.forEach(System.out::println);
		*/
		
		//4.Productos que aparecen en los pedidos realizados entre hoy y hace 11 días, para clientes de nivel 2
		pedidos.stream()
			.filter( ped -> ped.getCliente().getNivel() == 2)
			.filter( ped -> ped.getFechaPedido().isAfter(LocalDate.now().minusDays(11)) )
			.filter( ped -> ped.getFechaPedido().isBefore(LocalDate.now().plusDays(1)) )
			.flatMap( ped -> ped.getProductos().stream() ) //Stream<<Producto>
			.distinct()
			.forEach( System.out::println);
			
		
		//5. Cuadro más caro
		Producto mascaro = productos.stream()
			.filter(prod -> prod.getCategoria().equals(Categoria.ABSTRACTO))
			.max( (prod1, prod2) -> (int) (prod1.getPrecio() - prod2.getPrecio()) )
			.orElse(null);
		
		System.out.println("Ejer5 " + mascaro);
			
			
		//6. Los dos pedidos más recientes
		pedidos.stream()
			.sorted( (ped1,ped2) -> ped2.getFechaPedido().compareTo(ped1.getFechaPedido()) )
			.limit(2)
			.forEach(System.out::println);
			
			
		//7. Todos los pedidos de hoy, que salga el pedido y debajo sus productos
		pedidos.stream()
			.filter( ped -> ped.getFechaPedido().equals(LocalDate.now()))
			.forEach( ped -> {
				System.out.println("Pedido: " + ped.getId() + " " + ped.getEstado() + " " + ped.getFechaPedido());
				ped.getProductos().stream().forEach(System.out::println);
			});
			
			
		//8. Calcula el total de los pedidos de hoy
		Double total = pedidos.stream()
			.filter( ped -> ped.getFechaPedido().equals(LocalDate.now()))
			.flatMap(ped -> ped.getProductos().stream())  //Stream<Producto>
			//.collect(Collectors.summingDouble(Producto::getPrecio));
			.map( prod -> (Double) prod.getPrecio())
			.reduce(0.0 , (pre1, pre2) -> pre1 + pre2 );
			
			
		System.out.println("Total pedidos hoy " + total);
			
			
		//9. Estadísticas de los precios de los CUADROS
		System.out.println(
		productos.stream()
			.filter(prod -> prod.getCategoria().equals(Categoria.CUADRO))
			.collect(Collectors.summarizingDouble(Producto::getPrecio))
		);

		//10. Genera un Map<Long, Integer> con el id de pedido y el total de productos en el pedido, para cada pedido
		Map<Long, Integer> resumenPedidos = (Map<Long, Integer>) pedidos.stream()
				.collect(Collectors.toMap(Pedido::getId, ped -> ped.getProductos().size()));
			
		resumenPedidos.forEach( (k,v) -> System.out.println("Pedido " + k + " - total productos: " + v) );	
		
			
		//11. Genera un Map<Pedido, Double> que lleve como clave cada Pedido, y como valor el total del precio de sus productos.
		Map<Pedido, Double> totalPedidos = pedidos.stream() //Stream<Pedido>
				.collect(Collectors.toMap(ped -> ped ,      //Function.identity() 
										  ped -> ped.getProductos().stream()
										  					.collect(Collectors.summingDouble(Producto::getPrecio))
				));   
			
		totalPedidos.forEach( (k,v) -> System.out.println("Pedido " + k.getId() + " - total productos: " + v) );	
			
		//12. Agrupa los productos por categoría
		Map<Categoria, List<Producto>> productosPorCategoria = productos.stream()
				.collect(Collectors.groupingBy(Producto::getCategoria));
			
		productosPorCategoria.forEach( (k,v) -> System.out.println(k + " - " + v.stream()
																		.map(Producto::getId)
																		.collect(Collectors.toList()) ) );	
		
			
		//13. Agrupa por categoría y de esa categoría muestra el más caro
		Map<Categoria, Optional<Producto>> agrupadoCaro = productos.stream()
				.collect(Collectors.groupingBy(Producto::getCategoria, Collectors.maxBy(Comparator.comparing(Producto::getPrecio))));
			
		agrupadoCaro.forEach( (k,v) -> System.out.println(k + " - " + v.get()));

	}
}