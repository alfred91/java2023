package ejemplos.colaspilas;

import java.util.LinkedList;

public class MueblesIkea<Mueble> {
	
	private LinkedList<Mueble> mueblesApilados;
	private int fila;
	
	
	public MueblesIkea(int fila) {
		super();
		this.fila = fila;
		this.mueblesApilados = new LinkedList<>();
	}


	/**
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}


	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}


	/**
	 * @return the mueblesApilados
	 */
	public LinkedList<Mueble> getMueblesApilados() {
		return mueblesApilados;
	}
	
	
	public void nuevo(Mueble m) {
		this.mueblesApilados.push(m);		
	}
	
	public Mueble eliminar() {
		return this.mueblesApilados.pop();
	}
	
	public Mueble verLoDeArriba() {
		return this.mueblesApilados.peek();
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MueblesIkea [mueblesApilados=");
		builder.append(mueblesApilados);
		builder.append(", fila=");
		builder.append(fila);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
