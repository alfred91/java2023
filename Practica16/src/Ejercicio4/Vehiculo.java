package Ejercicio4;

import java.util.Objects;

public abstract class Vehiculo implements Comparable<Vehiculo>{

	enum TipoFosil {DIESEL, GASOLINA}
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected Double precio;
	protected Integer cv;
	protected boolean reparado;
	
	public Vehiculo(String matricula, String marca, String modelo, String color, Double precio, Integer cv,
			boolean reparado) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cv = cv;
		this.reparado = reparado;
	}
	
	public Vehiculo(Vehiculo otro) {
		super();
		this.matricula =otro.matricula;
		this.marca = otro.marca;
		this.modelo = otro.modelo;
		this.color = otro.color;
		this.precio = otro.precio;
		cv = otro.cv;
		this.reparado = otro.reparado;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the cV
	 */
	public Integer getCv() {
		return cv;
	}

	/**
	 * @param cV the cV to set
	 */
	public void setCv(Integer cv) {
		this.cv = cv;
	}

	/**
	 * @return the reparado
	 */
	public boolean isReparado() {
		return reparado;
	}

	/**
	 * @param reparado the reparado to set
	 */
	public void setReparado(boolean reparado) {
		this.reparado = reparado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", CV=");
		builder.append(cv);
		builder.append(", reparado=");
		builder.append(reparado);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
}
