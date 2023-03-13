package ExamenAlfredo;

import java.util.EnumSet;

public class Zapatillas extends Producto {

	protected numero Numero;
	protected categoria Categoria;
	
	public enum categoria{RUNNING, WALKING, FUTBOL, GIMNASIO, CHANCLAS, TRAIL, BALONCESTO, GOLF};
	 
	public enum numero {TREINCINCO,TREINSEIS,TREINSIETE,TREINOCHO,TREINUEVE,CUARENTA,CUARENTUNO,CUARENTDOS,
		 CUARENTRES,CUARENTCUATRO,CUARENTCINCO,CUARENTSEIS,CUARENTSIETE,CUARENTOCHO,CUARENTNUEVE,CINCUENTA};
	/**
	 * @param codigo
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param unidadesStock
	 * @param numero
	 */

	Zapatillas(String codigo, String nombre, String descripcion, double precio, int unidadesStock, numero numero,
			categoria categoria) {
		super(codigo, nombre, precio, unidadesStock);
		Numero = numero;
		Categoria = categoria;
	}
	
	Zapatillas(Zapatillas otro) {
		
		super(otro);
		this.Numero = otro.Numero;
		this.Categoria = otro.Categoria;
	}
	
    @Override
    
    public double descuento() {
        double descuento;
        if (EnumSet.of(numero.TREINCINCO, numero.CUARENTSIETE,numero.CUARENTOCHO,
        		numero.CUARENTNUEVE,numero.CINCUENTA).contains(Numero)) {
            descuento = getPrecio()*0.05;
        } else {
            descuento = getPrecio()*0.03;
        }
        return descuento;
    }
}