package Ejercicio3;

public class Puntuacion {

	private int puntos;
	private int PJ;
	private int PG;
	private int PP;
	/**
	 * 
	 */
	Puntuacion() {
		super();
	}
	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}
	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	/**
	 * @return the pJ
	 */
	public int getPJ() {
		return PJ;
	}
	/**
	 * @param pJ the pJ to set
	 */
	public void setPJ(int pJ) {
		PJ = pJ;
	}
	/**
	 * @return the pG
	 */
	public int getPG() {
		return PG;
	}
	/**
	 * @param pG the pG to set
	 */
	public void setPG(int pG) {
		PG = pG;
	}
	/**
	 * @return the pP
	 */
	public int getPP() {
		return PP;
	}
	/**
	 * @param pP the pP to set
	 */
	public void setPP(int pP) {
		PP = pP;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Puntuacion [puntos= 2500");
		builder.append(", PJ= 10");
		builder.append(", PG= 8");
		builder.append(", PP= 2");
		builder.append("]");
		return builder.toString();
	}
	
}
