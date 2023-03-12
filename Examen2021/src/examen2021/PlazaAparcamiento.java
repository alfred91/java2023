package examen2021;

import java.util.Objects;

public class PlazaAparcamiento {
	
	private int numPlaza;
	private boolean estaLibre;
	
	
	public PlazaAparcamiento() {
		this.numPlaza = 0;
		this.estaLibre = true;
	}


	public PlazaAparcamiento(int numPlaza) {
		super();
		this.numPlaza = numPlaza;
		this.estaLibre = true;
	}


	/**
	 * @return the numPlaza
	 */
	public int getNumPlaza() {
		return numPlaza;
	}


	/**
	 * @param numPlaza the numPlaza to set
	 */
	public void setNumPlaza(int numPlaza) {
		this.numPlaza = numPlaza;
	}


	/**
	 * @return the estaLibre
	 */
	public boolean estaLibre() {
		return estaLibre;
	}


	/**
	 * @param estaLibre the estaLibre to set
	 */
	public void setEstaLibre(boolean estaLibre) {
		this.estaLibre = estaLibre;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlazaAparcamiento [numPlaza=");
		builder.append(numPlaza);
		builder.append(", estaLibre=");
		builder.append(estaLibre);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(numPlaza);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlazaAparcamiento other = (PlazaAparcamiento) obj;
		return numPlaza == other.numPlaza;
	}
	
	
	
	
	
}