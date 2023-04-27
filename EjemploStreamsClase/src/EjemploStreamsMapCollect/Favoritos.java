package EjemploStreamsMapCollect;

import java.util.ArrayList;
import java.util.List;

public class Favoritos {

	private String nombrePersona;
	private List<Libro> favoritos;
	
	public Favoritos(String nombrePersona) {
		super();
		this.nombrePersona = nombrePersona;
		this.favoritos = new ArrayList<>();
	}

	/**
	 * @return the nombrePersona
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}

	/**
	 * @param nombrePersona the nombrePersona to set
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	/**
	 * @return the favoritos
	 */
	public List<Libro> getFavoritos() {
		return favoritos;
	}
	
	public void addFavorito(Libro l) {
		this.favoritos.add(l);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Favoritos [nombrePersona=");
		builder.append(nombrePersona);
		builder.append(", favoritos=");
		builder.append(favoritos);
		builder.append("]");
		return builder.toString();
	}

}