package cajita;

public class Caja {
	private static int numCajas;
	private int capacidadMaxima;
	private int cantidadActual;
	

	public Caja(){
	this(500, 0);
}

public Caja(int capacidadMax){
	this(capacidadMax,capacidadMax);
}

public Caja(int capacidadMax, int cantidadActual){
	this.capacidadMaxima = capacidadMax;
	this.cantidadActual = cantidadActual;
	if(cantidadActual > capacidadMax){
		this.cantidadActual = capacidadMax;
	}
	numCajas++;
}
/*Devuelve la capacidad maxima*/
public int getCapacidadMaxima() {
	return capacidadMaxima;
}
/*Devuelve la cantidad actual*/
public int getCantidadActual() {
	return cantidadActual;
}
/*Llenar Caja*/
public void llenarCaja(){
	this.cantidadActual = this.capacidadMaxima;
}
/*Sacar monedas*/
public void sacarMonedas(int cantidadMonedas){
	if(cantidadMonedas > this.cantidadActual){
		vaciarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual - cantidadMonedas;
	}

}
/*Vaciar Caja*/
public void vaciarCaja(){
	this.cantidadActual = 0;
}
/*Agregar monedas*/
public void agregarMonedas(int cantidad){
	if (this.cantidadActual + cantidad > this.capacidadMaxima){
		llenarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual + cantidad;
	}
}
/*Devuelve el numero de cajas*/
public static int getNumeroCajas() {
	return numCajas;
}
}
