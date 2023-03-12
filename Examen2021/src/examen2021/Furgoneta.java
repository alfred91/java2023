package examen2021;

public class Furgoneta extends Vehiculo implements Descontable {

	private float longitud;
	
	public Furgoneta() {	
		super();
		this.longitud=0;
	}

	public Furgoneta(String matricula, String marca, float longitud) {
		super(matricula,marca);
		this.longitud = longitud;
	}
	
	public Furgoneta(Furgoneta otro) {
		super(otro);
		this.longitud = otro.longitud;
	}
	

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public Furgoneta(String matricula, String marca) {
		super(matricula, marca);
		// TODO Auto-generated constructor stub
	}

	public Furgoneta(Vehiculo otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImporte() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
;
		builder.append("Furgoneta [ matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}
	
public double calcularInmporte() {
	
	return (1 - this.descuento()) * 
			( Parking.PRECIO_MINUTO * this.calcularMinutos() + Parking.PRECIO_METRO * this.longitud); 
	
	}
}
