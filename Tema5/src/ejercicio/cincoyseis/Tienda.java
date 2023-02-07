package ejercicio.cincoyseis;

import java.util.ArrayList;

public class Tienda {

	private ArrayList<Producto> productos;
	private double ventasTotales; //€
	
	
	public Tienda() {
		this.productos = new ArrayList<>();
		this.ventasTotales = 0;
	}


	/**
	 * @return the ventasTotales
	 */
	public double getVentasTotales() {
		return ventasTotales;
	}


	/**
	 * @param ventasTotales the ventasTotales to set
	 */
	public void setVentasTotales(double ventasTotales) {
		this.ventasTotales = ventasTotales;
	}
	
	
	public void adquirirProducto(Producto prod) {
		//Si no existe el producto en la tienda lo añado
		//indexOf -> Negativo si no lo encuentra, positivo (o 0) si sí lo encuentra
		if (this.productos.indexOf(prod) < 0)
			this.productos.add(prod);

	}
	
	
	public void venderProducto(int identificador, int cantidad) {
		//Me creo un objeto Producto 'pelao' con el identificador a localizar
		//Así podré buscarlo con "indexOf"
		Producto aBuscar = new Producto();
		aBuscar.setId(identificador);
		
		//Si está el producto
		int posicion = this.productos.indexOf(aBuscar);
		if ( posicion >= 0) {
			
			Producto pr = this.productos.get(posicion);
			
			if (pr.getUnidadesDisp() >= cantidad) {
				pr.vender(cantidad);
				
				//Actualizar ventas
				this.ventasTotales += (pr.getPrecioU() - pr.getPrecioU()*pr.getDescuento()) * cantidad;
			}
		}
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [ventasTotales=");
		builder.append(ventasTotales);
		builder.append(", productos=");
		builder.append(productos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	

}
