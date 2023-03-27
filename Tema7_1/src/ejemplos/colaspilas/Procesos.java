package ejemplos.colaspilas;

import java.util.LinkedList;

public class Procesos<T> {

	private LinkedList<T> colaProcesos;

	public Procesos() {
		super();
		this.colaProcesos = new LinkedList<>();
	}
	
	public boolean nuevo(T elemento) {
		return this.colaProcesos.add(elemento);
	}
	
	public void eliminar() {
		this.colaProcesos.poll();
	}
	
	public T consultar() {
		return this.colaProcesos.peek();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Procesos [colaProcesos=");
		builder.append(colaProcesos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
