package ejemplos.clases;

public class Prueba {

	
	private String cadena;
	

	public Prueba(String cadena) {
		super();
		this.cadena = cadena;
	}

	/**
	 * @param cadena the cadena to set
	 */
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	/**
	 * @return the cadena
	 */
	public String getCadena() {
		return this.cadena;
	}
	
	
	public void pintarCadena() {
		System.out.println(this.cadena);
	}
	
}
