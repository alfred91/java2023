/**
 * 
 */
package ejemplo2;

/**
 * @author FreeD
 *
 */
public class Bicicleta {
	/**
	 *Propiedades	Electrica	Frenos	Cambio	Orquilla	Material 	Precio
	 */
	
	public boolean esElectrica;
	public String marca;
	public String frenos;
	public String cambio;
	public String orquilla;
	public String material;
	public double precio;
	//private double precio NO MOSTRARIA EL PRECIO A UN TERCERO.

/**
 * CONSTRUCTOR; ESTO SIRVE PARA CREAR OBJETOS DE TIPO BICICLETA
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
	 * Constructor por defecto: inicializamos nosotros los valores que va a tener el objeto
	 */
			public Bicicleta() {
				super();
				this.esElectrica= false;
				this.marca="Mondraker";
				this.precio=2000;
				this.frenos="";
				this.orquilla="";
				this.material="Aluminio";
			}

/**
 * METODOS / COMPORTAMIENTO
/**
 * SI LA BICI ES ELECTRICA SE LE APLICA UN DCTO DEL 15, SI NO UN 5.
 */
public double precioConDescuento() {
	double precioDescuento=0;
	if (this.esElectrica==true) {
		precioDescuento=this.precio*0.85;
	} else {
		precioDescuento=this.precio*0.95;
	}
	return precioDescuento;
}}