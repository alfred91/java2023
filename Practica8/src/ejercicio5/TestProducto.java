package ejercicio5;
public class TestProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Leche", 1.5, 10, 20, 0.1);
        Producto p2 = new Producto(2, "Pan", 0.5, 5, 10, 0.0);
        Producto p3 = new Producto(3, "Huevos", 3.0, 20, 30, 0.2);

        System.out.println(p1);
        System.out.println(p2);

        // Vendemos 5 unidades del producto
        if (p1.vender(5)) {
            System.out.println("Se vendieron 5 unidades del producto");
        } else {
            System.out.println("No se pudo vender el producto");
        }

        // Mostramos los datos del producto actualizados
        System.out.println(p1);
}
}