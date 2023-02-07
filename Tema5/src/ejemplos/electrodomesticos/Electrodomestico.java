package ejemplos.electrodomesticos;

public class Electrodomestico {

	enum ConsumoE {A, B, C, D, E, F};
	enum ColorE {BLANCO, NEGRO, ROJO, AZUL, GRIS}
	
	//protected --> privado para todos, público para las clases hijas
	protected String marca;
	protected String modelo;
	protected Double precioBase;
	protected Double peso;
	protected ConsumoE consumoElectrico;
	protected ColorE color;
	
	
	public Electrodomestico() {
		super();
		this.precioBase = 100d;
		this.peso = 5.0;
		this.consumoElectrico = ConsumoE.F;
		this.color = ColorE.BLANCO;
	}

	public Electrodomestico(String marca, String modelo, Double precioBase, Double peso) {
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoElectrico = ConsumoE.F;
		this.color = ColorE.BLANCO;
	}

	public Electrodomestico(String marca, String modelo, Double precioBase, Double peso, ConsumoE consumoElectrico,
			ColorE color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumoElectrico = consumoElectrico;
		this.color = color;
	}

	/**
	 * @return the marca
	 */// TODO Auto-generated constructor stub
	public String getMarca() {
		return marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @return the precioBase
	 */
	public Double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}

	/**
	 * @return the consumoElectrico
	 */
	public ConsumoE getConsumoElectrico() {
		return consumoElectrico;
	}

	/**
	 * @return the color
	 */
	public ColorE getColor() {
		return color;
	}
	// TODO Auto-generated constructor stub
	
	/**
	 * Devuelve el precioBase más un plus según el consumo eléctrico, y otro plus según el peso
	 * @return
	 */
	public double precioFinal() {
		
		double precioFinal = this.precioBase;
		
		//Plus consumo eléctrico
		switch (this.consumoElectrico) {
		case A:
			precioFinal += 100;
			break;
		case B:
			precioFinal += 80;
			break;
		case C:
			precioFinal += 65;
			break;
		case D:
			precioFinal += 50;
			break;
		case E:
			precioFinal += 30;
			break;
		case F:
			precioFinal += 10;
			break;

		default:
			break;
		}
		
		
		//Plus peso
		if (this.peso >= 0 && this.peso <= 19) {
			precioFinal += 10;
		} else if (this.peso > 19 && this.peso <= 49) {
			precioFinal += 50;
		} else if (this.peso > 49 && this.peso <= 79) {
			precioFinal += 80;
		} else if (this.peso > 79 ) {
			precioFinal += 100;
		}
		
		
		return precioFinal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electrodomestico [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precioBase=");
		builder.append(precioBase);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", consumoElectrico=");
		builder.append(consumoElectrico);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
