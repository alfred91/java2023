package pract9ej2;

public class CuentaAhorro extends CuentaBancaria {
	
	private double modifComisiones=0.5;
	private double tipoInteres;
	
	
	public CuentaAhorro(double saldo, double comisiones, double tipoInteres) {
		super(saldo, false, false, comisiones);
		this.tipoInteres = tipoInteres;
		this.comisiones = this.comisiones * this.modifComisiones;
		
	}
	
	public CuentaAhorro(CuentaAhorro otra) {
		super(otra);
		this.tipoInteres = otra.tipoInteres;
	}
	
	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	/**
	 * @return the modifComisiones
	 */
	public double getModifComisiones() {
		return modifComisiones;
	}
	
	/**
	 * @param modifComisiones the modifComisiones to set
	 */
	public void setModifComisiones(double modifComisiones) {
		this.modifComisiones = modifComisiones;
	}
	
}