package Ejercicio10;

public class Consumo {
	
	private double kms;
	private double litros;
	private double vmed;
	private double precioGas;
	
	public Consumo(double kms, double litros, double vmed, double precioGas) {
		super();
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.precioGas = precioGas;
	}
	
	//v = e / t --> t = e / v
	public double getTiempo() {
		return this.kms / this.vmed;
	}
	
	
	// kms - litros entonces en 100kms - x  => consumoMedio = litros * 100 / kms
	public double consumoMedio() {
		return this.litros * 100 / this.kms;
	}
	
	public double consumoEuros() {
		return this.consumoMedio() * this.precioGas;
	}

	/**
	 * @param kms the kms to set
	 */
	public void setKms(double kms) {
		this.kms = kms;
	}

	/**
	 * @param litros the litros to set
	 */
	public void setLitros(double litros) {
		this.litros = litros;
	}

	/**
	 * @param vmed the vmed to set
	 */
	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	/**
	 * @param precioGas the precioGas to set
	 */
	public void setPrecioGas(double precioGas) {
		this.precioGas = precioGas;
	}
	
	
	
}
