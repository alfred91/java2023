package Ejercicio11;

import java.util.Objects;

public class Robot {

	//0,0 1,0 2,0          0,2 1,2 2,2
	//0,1 1,1 2,1		   0,1 1,1 2,1	
	//0,2 1,2 2,2          0,0 1,0 2,0
	
	private int posicionX;
	private int posicionY;
	private boolean haLlegado;
	private int numPasos;
	
	public static int contadorRobots = 0;
	private static int FILASTABLERO = 10;
	private static int COLUMNASTABLERO = 10;
	
	public Robot() {
		this.posicionX = 0;
		this.posicionY = 0;
		this.haLlegado = false;
		this.numPasos = 0;
		Robot.contadorRobots++;
	}

	public Robot(int posicionX, int posicionY) throws Exception {
		super();
		
		if (posicionX < 0  || posicionX > Robot.COLUMNASTABLERO) {
			throw new Exception("Coordenada X fuera de rango");
		}
		if (posicionY < 0  || posicionY > Robot.FILASTABLERO) {
			throw new Exception("Coordenada Y fuera de rango");
		} 
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.haLlegado = false;
		this.numPasos = 0;
		Robot.contadorRobots++;
	}

	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}

	/**
	 * @param posicionX the posicionX to set
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	/**
	 * @return the posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}

	/**
	 * @param posicionY the posicionY to set
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	/**
	 * @return the haLlegado
	 */
	public boolean isHaLlegado() {
		return haLlegado;
	}

	/**
	 * @param haLlegado the haLlegado to set
	 */
	public void setHaLlegado(boolean haLlegado) {
		this.haLlegado = haLlegado;
	}

	/**
	 * @return the numPasos
	 */
	public int getNumPasos() {
		return numPasos;
	}

	/**
	 * @param numPasos the numPasos to set
	 */
	public void setNumPasos(int numPasos) {
		this.numPasos = numPasos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [posicionX=");
		builder.append(posicionX);
		builder.append(", posicionY=");
		builder.append(posicionY);
		builder.append(", haLlegado=");
		builder.append(haLlegado);
		builder.append(", numPasos=");
		builder.append(numPasos);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(haLlegado, numPasos, posicionX, posicionY);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return haLlegado == other.haLlegado && numPasos == other.numPasos && posicionX == other.posicionX
				&& posicionY == other.posicionY;
	}
	
	
	public boolean irArriba() {
		if (this.posicionY < Robot.FILASTABLERO) {   
			this.posicionY++;
			this.numPasos++;
			return true;
		} else 
			return false;
	}
	
	public boolean irAbajo() {
		if (this.posicionY > 0) {   
			this.posicionY--;
			this.numPasos++;
			return true;
		} else 
			return false;
	}
	
	public boolean irDerecha() {
		if (this.posicionX < Robot.COLUMNASTABLERO) {
			this.posicionX++;
			this.numPasos++;
			return true;
		} else 
			return false;
		
	}
	
	public boolean irIzquierda() {
		if (this.posicionX > 0) {
			this.posicionX++;
			this.numPasos++;
			return true;
		} else 
			return false;

	}
	
	
	
	
	
	
	
	
	
}
