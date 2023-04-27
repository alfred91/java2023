package Ejercicio3;

import java.util.Comparator;

public class Puntuacion implements Comparable<Puntuacion> {

	private int puntos;
	private int pJugadas;
	private int pGanadas;
	private int pPerdidas;
	


	public Puntuacion(int puntos, int pJugadas, int pGanadas, int pPerdidas)  {
		super();
		this.puntos = puntos;
		this.pJugadas = pJugadas;
		this.pGanadas = pGanadas;
		this.pPerdidas = pPerdidas;
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
	 * @return the pJugadas
	 */
	public int getpJugadas() {
		return pJugadas;
	}

	/**
	 * @param pJugadas the pJugadas to set
	 */
	public void setpJugadas(int pJugadas) {
		this.pJugadas = pJugadas;
	}

	/**
	 * @return the pGanadas
	 */
	public int getpGanadas() {
		return pGanadas;
	}

	/**
	 * @param pGanadas the pGanadas to set
	 */
	public void setpGanadas(int pGanadas) {
		this.pGanadas = pGanadas;
	}

	/**
	 * @return the pPerdidas
	 */
	public int getpPerdidas() {
		return pPerdidas;
	}

	/**
	 * @param pPerdidas the pPerdidas to set
	 */
	public void setpPerdidas(int pPerdidas) {
		this.pPerdidas = pPerdidas;
	}

	@Override
	public String toString() {
		return " Puntos: " + puntos + " PJ: " + pJugadas + " - PG: " + pGanadas + " - PP: " + pPerdidas;
	}

	@Override
	public int compareTo(Puntuacion o) {
		if (this.puntos > o.puntos)
			return -1;
		else if (this.puntos < o.puntos)
			return 1;
		return 0;
	}
}