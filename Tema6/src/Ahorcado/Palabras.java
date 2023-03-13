package Ahorcado;

public class Palabras {

	private String palabras;

	/**
	 * @param palabras
	 */
	public Palabras(String palabraNueva) {
		super();
		this.palabras = palabraNueva;
	}

	/**
	 * @return the palabras
	 */
	public String getPalabras() {
		return palabras;
	}

	/**
	 * @param palabras the palabras to set
	 */
	public void setPalabras(String palabras) {
		this.palabras = palabras;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(palabras);

		return builder.toString();
	}

}