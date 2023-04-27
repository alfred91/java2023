package EjercicioClase;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pedido {

	public enum EstadoPedido { RECIBIDO, PROCESADO, ENVIADO };
	
	private static long contador=1;
	
	private long id;
	private LocalDate fechaPedido;
	private LocalDate fechaEnvio;
	private EstadoPedido estado;
	private Cliente cliente;
	private Set<Producto> productos;
	
	public Pedido(LocalDate fechaPedido, LocalDate fechaEnvio, Cliente cliente) {
		super();
		this.id = Pedido.contador++;
		this.fechaPedido = fechaPedido;
		this.fechaEnvio = fechaEnvio;
		this.estado = EstadoPedido.RECIBIDO;
		this.cliente = cliente;
		this.productos = new HashSet<>();
	}

	/**
	 * @return the fechaPedido
	 */
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	/**
	 * @param fechaPedido the fechaPedido to set
	 */
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	/**
	 * @return the fechaEnvio
	 */
	public LocalDate getFechaEnvio() {
		return fechaEnvio;
	}

	/**
	 * @param fechaEnvio the fechaEnvio to set
	 */
	public void setFechaEnvio(LocalDate fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	/**
	 * @return the estado
	 */
	public EstadoPedido getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the productos
	 */
	public Set<Producto> getProductos() {
		return productos;
	}
	
	
	public void addProducto(Producto p) {
		this.productos.add(p);
	}
	
	public void deleteProducto(Producto p) {
		this.productos.remove(p);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [id=");
		builder.append(id);
		builder.append(", fechaPedido=");
		builder.append(fechaPedido);
		builder.append(", fechaEnvio=");
		builder.append(fechaEnvio);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return id == other.id;
	}
}