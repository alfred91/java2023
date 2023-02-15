package pract9ej2;

import java.util.Objects;

public class CuentaBancaria {
	
	protected String numeroCuenta;
	protected double saldo;
	protected boolean tieneTarjetaCredito;
	protected boolean tieneTarjetaDebito;
	protected double comisiones;
	
/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisiones
	 */
	
	CuentaBancaria( double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisiones) {
		super();
		this.numeroCuenta = generarNumeroCuenta();
		this.saldo = saldo;
		this.tieneTarjetaCredito = tieneTarjetaCredito;
		this.tieneTarjetaDebito = tieneTarjetaDebito;
		this.comisiones = comisiones;
	}

	public CuentaBancaria(CuentaBancaria otra) {
		this.numeroCuenta=otra.numeroCuenta;
		this.saldo=otra.saldo;
		this.tieneTarjetaCredito=otra.tieneTarjetaCredito;
		this.tieneTarjetaDebito=otra.tieneTarjetaDebito;
		this.comisiones=otra.comisiones;}
	

			private String generarNumeroCuenta() {
				
				StringBuilder sb = new StringBuilder(20);
				sb.append("ES");
				for (int i=0;i<18;i++) {
					sb.append((int)Math.random()*10);
					}
				return sb.toString();
	}
			
			/**
			 * @return the numeroCuenta
			 */
			public String getNumeroCuenta() {
				return numeroCuenta;
			}

			/**
			 * @param numeroCuenta the numeroCuenta to set
			 */
			public void setNumeroCuenta(String numeroCuenta) {
				this.numeroCuenta = numeroCuenta;
			}

			/**
			 * @return the saldo
			 */
			public double getSaldo() {
				return saldo;
			}

			/**
			 * @param saldo the saldo to set
			 */
			public void setSaldo(double saldo) {
				this.saldo = saldo;
			}

			/**
			 * @return the tieneTarjetaCredito
			 */
			public boolean isTieneTarjetaCredito() {
				return tieneTarjetaCredito;
			}

			/**
			 * @param tieneTarjetaCredito the tieneTarjetaCredito to set
			 */
			public void setTieneTarjetaCredito(boolean tieneTarjetaCredito) {
				this.tieneTarjetaCredito = tieneTarjetaCredito;
			}

			/**
			 * @return the tieneTarjetaDebito
			 */
			public boolean isTieneTarjetaDebito() {
				return tieneTarjetaDebito;
			}

			/**
			 * @param tieneTarjetaDebito the tieneTarjetaDebito to set
			 */
			public void setTieneTarjetaDebito(boolean tieneTarjetaDebito) {
				this.tieneTarjetaDebito = tieneTarjetaDebito;
			}
			
			/**
			 * @return the comisiones
			 */
			public double getComisiones() {
				return comisiones;
			}

			/**
			 * @param comisiones the comisiones to set
			 */
			public void setComisiones(double comisiones) {
				this.comisiones = comisiones;
			}
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("CuentaBancaria [numeroCuenta=");
				builder.append(numeroCuenta);
				builder.append(", saldo=");
				builder.append(saldo);
				builder.append(", tieneTarjetaCredito=");
				builder.append(tieneTarjetaCredito);
				builder.append(", tieneTarjetaDebito=");
				builder.append(tieneTarjetaDebito);
				builder.append(", comisiones=");
				builder.append(comisiones);
				builder.append("]");
				return builder.toString();
						}		
				
			@Override
			public int hashCode() {
				return Objects.hash(numeroCuenta);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				CuentaBancaria other = (CuentaBancaria) obj;
				
				return Objects.equals(numeroCuenta, other.numeroCuenta);
					
			}
			
			public void ingresar(double cantidad) {
				if (cantidad>=0)
					this.saldo+=cantidad;
			}
			
			public boolean retirar(double cantidad) {
				if((this.saldo-cantidad)>=0) {
					return true;
					} else {
						return false;
				}
			}
}
