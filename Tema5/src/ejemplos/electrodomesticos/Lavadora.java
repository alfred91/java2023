package ejemplos.electrodomesticos;

public class Lavadora extends Electrodomestico {
	
	private int carga;

	public Lavadora(String marca, String modelo, Double precioBase, Double peso, ConsumoE consumoElectrico,
			ColorE color, int carga) {
		//super --> llama al método con el mismo nombre en la clase padre 
		super(marca, modelo, precioBase, peso, consumoElectrico, color);
		this.carga = carga;
	}

	public Lavadora(String marca, String modelo, Double precioBase, Double peso, int carga) {
		super(marca, modelo, precioBase, peso);
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lavadora [");
		builder.append("color=");
		builder.append(color);
		builder.append(", consumoElectrico=");
		builder.append(consumoElectrico);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", precioBase=");
		builder.append(precioBase);
		builder.append(", carga=");
		builder.append(carga);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * El precio final de una lavadora, lleva el plus del consumo, el plus del peso, y 50€ extra si la carga es de más de 8kg
	 */
	@Override
	public double precioFinal() {
		double extra = 50;
		
		if (this.carga >= 8)
			return super.precioFinal() + extra;
		else
			return super.precioFinal();
	}

	
	
	

}
