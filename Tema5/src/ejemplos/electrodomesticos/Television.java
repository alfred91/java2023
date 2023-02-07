package ejemplos.electrodomesticos;

public class Television extends Electrodomestico {
	
	enum TecnologiaLed { QLED, OLED, MICROLED }
	enum ResolucionTV { R_FHD, R_4K, R_8K }
	
	
	private int pulgadas;
	private TecnologiaLed tecnologia;
	private ResolucionTV resolucion;
	

	public Television() {
	}

	public Television(String marca, String modelo, Double precioBase, Double peso, int pulgadas, TecnologiaLed tecnologia, ResolucionTV resolucion) {
		super(marca, modelo, precioBase, peso);
		this.pulgadas = pulgadas;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
	}

	public Television(String marca, String modelo, Double precioBase, Double peso, ConsumoE consumoElectrico,
			ColorE color, int pulgadas, TecnologiaLed tecnologia, ResolucionTV resolucion) {
		super(marca, modelo, precioBase, peso, consumoElectrico, color);
		this.pulgadas = pulgadas;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
	}

	/**
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * @return the tecnologia
	 */
	public TecnologiaLed getTecnologia() {
		return tecnologia;
	}

	/**
	 * @return the resolucion
	 */
	public ResolucionTV getResolucion() {
		return resolucion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Television [");
		//Llama a toString del padre (Electrodomestico) --> super.metodo()
		builder.append(super.toString());
		builder.append(", pulgadas=");
		builder.append(pulgadas);
		builder.append(", tecnologia=");
		builder.append(tecnologia);
		builder.append(", resolucion=");
		builder.append(resolucion);
		builder.append("]");
		return builder.toString();
	}
	
	

}
