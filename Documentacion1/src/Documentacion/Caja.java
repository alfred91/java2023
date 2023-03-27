package Documentacion;
/**
 * <h2>Clase Caja</<h2>
 * Se utiliza para comprobar las monedas de una caja y vaciarla
 * Los atirbutos son:
 * <ul>
 * <li>Numero de Cajas</li>
 * <li>Capacidad Maxima</li>
 * <li>Cantidad actual</li>
 * </ul>
 * @author Apache
 *
 */
/**
 * Constructor con 3 parametros
 * @author Apache
 *
 */
public class Caja {
	private static int numCajas;
	private int capacidadMaxima;
	private int cantidadActual;


	public Caja(){
	this(500, 0);
}
/**
 * Capacidad maxima
 * @param capacidadMax
 */
public Caja(int capacidadMax){ 
	this(capacidadMax,capacidadMax);
}
/**
 * Aumentar el numero de cajas
 * @param capacidadMax
 * @param cantidadActual
 */
public Caja(int capacidadMax, int cantidadActual){ 
	this.capacidadMaxima = capacidadMax;
	this.cantidadActual = cantidadActual;
	if(cantidadActual > capacidadMax){
		this.cantidadActual = capacidadMax;
	}
	numCajas++;
}
/**
 * Capacidad maxima
 * @return
 */
public int getCapacidadMaxima() {
	return capacidadMaxima;
}
/**
 * Cantdiad actual
 * @return Capacidad Maxima
 */
public int getCantidadActual() {
	return cantidadActual;
}
/**
 * Llenar caja 
 */
public void llenarCaja(){
	this.cantidadActual = this.capacidadMaxima;
}
/**
 * vaciar caja
 * @param cantidadMonedas
 */
public void sacarMonedas(int cantidadMonedas){
	if(cantidadMonedas > this.cantidadActual){
		
		vaciarCaja();
	}
	else{  
		this.cantidadActual = this.cantidadActual - cantidadMonedas;
	}
}
/**
 * Vaciar caja
 */
public void vaciarCaja(){
	this.cantidadActual = 0;
}
/**
 * Agregar monedas
 * @param cantidad
 */
public void agregarMonedas(int cantidad){
	if (this.cantidadActual + cantidad > this.capacidadMaxima){
		llenarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual + cantidad;
	}
}
/**
 *  Devuelve el numero de cajas
 * @return numCajas
 */
public static int getNumeroCajas() { //
	return numCajas;
}
}
