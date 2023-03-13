package ExamenAlfredo;

import java.util.ArrayList;
import java.util.Objects;

public class LineaCompra {
    protected int orden;
    protected Producto producto;
    protected int cantidad;

    public LineaCompra(int orden, Producto producto, int cantidad) {
        this.orden = orden;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public LineaCompra(LineaCompra lineaCompra) {
        this.orden = lineaCompra.orden;
        this.producto = lineaCompra.producto;
        this.cantidad = lineaCompra.cantidad;
    }

    public LineaCompra(int mes, ArrayList<Producto> producto2, int cantidad2) {
		// TODO Auto-generated constructor stub
	}

	public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double subtotal() {
        return (producto.getPrecio() * cantidad) * (1 - producto.descuento());
    }

    @Override
    public String toString() {
        return "LineaCompra{" +
                "orden=" + orden +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineaCompra)) return false;
        LineaCompra that = (LineaCompra) o;
        return Objects.equals(producto, that.producto);
    }
}
