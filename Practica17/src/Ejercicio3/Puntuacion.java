package Ejercicio3;

public class Puntuacion implements Comparable<Puntuacion> {

	protected int puntos;
	protected int PJ;
	protected int PG;
	protected int PP;

	/**
	 * @param pJ
	 * @param pG
	 * @param pP
	 */
	Puntuacion() {
		this.puntos = 0;
		PJ = 0;
		PG = 0;
		PP = 0;
	}
	

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPJ() {
		return PJ;
	}

	public void setPJ(int PJ) {
		this.PJ = PJ;
	}

	public int getPG() {
		return PG;
	}

	public void setPG(int PG) {
		this.PG = PG;
	}

	public int getPP() {
		return PP;
	}

	public void setPP(int PP) {
		this.PP = PP;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Puntuacion [puntos=");
		builder.append(puntos);
		builder.append(", Partidas Jugadas=");
		builder.append(PJ);
		builder.append(", Partidas Ganadas=");
		builder.append(PG);
		builder.append(", Partidas Perdidas=");
		builder.append(PP);
		builder.append("]");
		return builder.toString();
	}

    public int compareTo(Puntuacion otro) {
        return otro.getPuntos() - puntos;
    }
	
}
