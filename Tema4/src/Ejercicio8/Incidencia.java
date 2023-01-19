package Ejercicio8;

public class Incidencia {

	private String codigo;
	private String estado;
	private String problema;
	private String solucion;
	
	public static int pendientes = 0;

	public Incidencia(String problema, String solucion) {
		super();
		this.estado = "Abierta";
		this.problema = problema;
		this.solucion = solucion;
		this.codigo = generarCodigo();
		Incidencia.pendientes++;
	}
	
	
	private String generarCodigo() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("inc");
		for(int i=0; i<5; i++) {
			sb.append( (int) (Math.random()*10) );
		}
		
		return sb.toString();
	}


	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the problema
	 */
	public String getProblema() {
		return problema;
	}


	/**
	 * @param problema the problema to set
	 */
	public void setProblema(String problema) {
		this.problema = problema;
	}


	/**
	 * @return the solucion
	 */
	public String getSolucion() {
		return solucion;
	}


	/**
	 * @param solucion the solucion to set
	 */
	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Incidencia [codigo=");
		builder.append(codigo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", problema=");
		builder.append(problema);
		builder.append(", solucion=");
		builder.append(solucion);
		builder.append("]");
		return builder.toString();
	}
	
	public void resuelve(String solucion) {
		if (this.estado != "Resuelta") {
			this.estado = "Resuelta";
			this.solucion = solucion;
			Incidencia.pendientes--;
		}
	}
	
	public static int getPendiente() {
		return Incidencia.pendientes;
	}
	
	
}
