/**
 * 
 */
package ejemplo2;

/**
 * @author profesor
 *
 */
public class Bicicleta {

	/**
	 * PROPIEDADES: electrica (booleano), marca, frenos, cambio, orquilla, material, precio
	 */
	
	public boolean esElectrica;
	public String marca;
	public String frenos;
	public String cambio;
	public String orquilla;
	public String material;
	public double precio;
	
	
	/**
	 * Constructor con propiedades: para crear objetos de tipo Bicicleta
	 */
	public Bicicleta(boolean esElectrica, String marca, String frenos, String cambio, String orquilla, String material,
			double precio) {
		super();
		this.esElectrica = esElectrica;
		this.marca = marca;
		this.frenos = frenos;
		this.cambio = cambio;
		this.orquilla = orquilla;
		this.material = material;
		this.precio = precio;
	}


	/**
	 * Constructor por defecto: inicializamos nosotros los valores de las propiedades que va a tener el objeto
	 */
	public Bicicleta() {
		super();
		this.esElectrica = false;
		this.marca = "No tiene marca";
		this.precio = 1000;
		this.frenos = "";
		this.cambio = "";
		this.orquilla = "";
		this.material = "Aluminio";
	}
	
	/**
	 * METODOS / Comportamiento
	 */
	
	
	/**
	 * Si la bici es eléctrica se le aplica un 15% de descuento, sino un 5%
	 * @return
	 */
	public double precioConDescuento() {
		double precioDescuento=0;
		
		if (this.esElectrica == true) {
			precioDescuento = this.precio * 0.85;
		} else {
			precioDescuento = this.precio * 0.95;
		}
		
		return precioDescuento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
