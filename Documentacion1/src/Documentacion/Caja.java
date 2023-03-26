package Documentacion;
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

public int getCapacidadMaxima() { //Capacidad maxima
	return capacidadMaxima;
}

public int getCantidadActual() { //Cantiad actual
	return cantidadActual;
}

public void llenarCaja(){ //Llenar caja 
	this.cantidadActual = this.capacidadMaxima;
}

public void sacarMonedas(int cantidadMonedas){
	if(cantidadMonedas > this.cantidadActual){
		// Si hay mas monedas se vacia la caja
		vaciarCaja();
	}
	else{ // Si no, se establece la cantidad 
		this.cantidadActual = this.cantidadActual - cantidadMonedas;
	}

}

public void vaciarCaja(){ // Vaciar caja
	this.cantidadActual = 0;
}

public void agregarMonedas(int cantidad){ //Agregar monedas
	if (this.cantidadActual + cantidad > this.capacidadMaxima){
		llenarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual + cantidad;
	}
}

public static int getNumeroCajas() { // Devuelve el numero de cajas
	return numCajas;
}
}
