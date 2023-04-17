package Ejercicio3;

import java.util.ArrayList;
import java.util.TreeMap;

public class Agenda {

	private TreeMap<String, String> contactos;

	public Agenda() {
		super();
		this.contactos = new TreeMap<>();
	}
	
	
	public boolean existeContacto(String nombre) {
		return this.contactos.containsKey(nombre);
	}
	
	public boolean nuevoContacto(String nombre, String telefono) {
		//Si lo podemos añadir devolvemos true, sino false
		if (this.contactos.put(nombre, telefono) == null) {
			return true;
		} else
			return false;
	}
	
	public String listarContactos() {
		StringBuilder sb = new StringBuilder();
		
		for(String key: this.contactos.keySet()) {
			sb.append(key);
			sb.append(": ");
			sb.append(this.contactos.get(key));
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public void eliminarContacto(String nombre) {
		this.contactos.remove(nombre);
	}
	
	/**
	 * No es una búsqueda eficiente puesto que buscamos por substring
	 * @param nombresub
	 * @return
	 */
	public ArrayList<String> buscarContacto(String nombresub) {
		ArrayList<String> resultado = new ArrayList<>();
		
		for(String key: this.contactos.keySet()) {
			if (key.contains(nombresub)) {
				resultado.add(key + ": " + this.contactos.get(key));
			}			
		}
		
		return resultado;
	}
	
}