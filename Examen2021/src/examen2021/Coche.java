package examen2021;

public class Coche extends Vehiculo implements Descontable {
	
enum Combustible {ELECTRICO, HIDROGENO, HIBRIDOENCHUFABLE, HIBRIDO, GASOLINA, DIESEL};
	
	private Combustible combustible;
	
	
	public Coche() {
		super();
		this.combustible = Combustible.ELECTRICO;
	}

	public Coche(String matricula, String marca, Combustible combustible) {
		super(matricula, marca);
		this.combustible = combustible;
	}

	public Coche(Coche otro) {
		super(otro);
		this.combustible = otro.combustible;
	}
	
	
	/**
	 * @return the combustible
	 */
	public Combustible getCombustible() {
		return combustible;
	}

	/**
	 * @param combustible the combustible to set
	 */
	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append(", combustible=");
		builder.append(combustible);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double descuento() {
		
		double descuento = super.descuento();
		
		if ( this.combustible.equals(Combustible.DIESEL) || this.combustible.equals(Combustible.GASOLINA) ) {
			descuento -= 0.1;
		} else {
			descuento += 0.1;
		}
		
		return descuento;
	}

	@Override
	public double calcularImporte() {
		
		return (1 - this.descuento()) * Parking.PRECIO_MINUTO * this.calcularMinutos();
		
	}

}