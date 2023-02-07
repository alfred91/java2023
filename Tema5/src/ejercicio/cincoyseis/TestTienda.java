package ejercicio.cincoyseis;

public class TestTienda {

	public static void main(String[] args) {
		
		Tienda miTienda = new Tienda();
		miTienda.adquirirProducto(new Producto(1, "Teclado Logitech", 45, 5, 20, 0.25));
		miTienda.adquirirProducto(new Producto(2, "Teclado", 25, 15, 20, 0.15));
		
		System.out.println(miTienda);
		
		miTienda.venderProducto(1, 3);
		miTienda.venderProducto(2, 5);
		System.out.println(miTienda);
		
	}

}
