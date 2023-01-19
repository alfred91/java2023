package ejemploPizza;

public class Pizza {

	private String tamanio;
	private String estado;
	private String tipo;
	
	public static int numPizzas = 0;
	public static int numPizzasServidas = 0;
	
	
	public Pizza(String tamanio, String tipo) {
		super();
		this.tamanio = tamanio;
		this.tipo = tipo;
		this.estado = "Pedida";
		Pizza.numPizzas++;
	}


	/**
	 * @return the tamanio
	 */
	public String getTamanio() {
		return tamanio;
	}


	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}


	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public static int totalPedidas() {
		return Pizza.numPizzas;
	}
	
	public static int totalServidas() {
		return Pizza.numPizzasServidas;
	}
	
	public void servir() {
		
		System.out.println("Ha salido la pizza " + this.tipo + this.tamanio);
		Pizza.numPizzasServidas++;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [tamanio=");
		builder.append(tamanio);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
