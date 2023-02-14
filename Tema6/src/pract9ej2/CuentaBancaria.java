package pract9ej2;

import java.util.Objects;

public class CuentaBancaria {
	
/**
	 * @param numeroCuenta
	 * @param saldo
	 * @param tieneTarjetaCredito
	 * @param tieneTarjetaDebito
	 * @param comisiones
	 */
	
	CuentaBancaria(String numeroCuenta, double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisiones) {
		super();
		this.numeroCuenta = numeroCuenta;
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
	
			private String numeroCuenta;
			private double saldo;
			private boolean tieneTarjetaCredito;
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
			private boolean tieneTarjetaDebito;
			private double comisiones;
			
			
			private String generarNumeroCuenta() {
				
				StringBuilder sb = new StringBuilder(20);
				sb.append("ES");
				for (int i=0;i<18;i++) {
					sb.append((int)Math.random()*10);
					}
				return sb.toString();
	}
			@Override
			public int hashCode() {
				return Objects.hash(comisiones, numeroCuenta, saldo, tieneTarjetaCredito, tieneTarjetaDebito);
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
				
				return Double.doubleToLongBits(comisiones) == Double.doubleToLongBits(other.comisiones)
						&& Objects.equals(numeroCuenta, other.numeroCuenta)
						&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
						&& tieneTarjetaCredito == other.tieneTarjetaCredito
						&& tieneTarjetaDebito == other.tieneTarjetaDebito;
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
