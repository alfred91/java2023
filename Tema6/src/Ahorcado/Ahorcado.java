package Ahorcado;

import java.util.ArrayList;

public class Ahorcado {

	// ATRIBUTOS
	public static ArrayList<Palabras> palabras;
	public String palabraAdivinar;
	public StringBuffer palabraActual;

	// CONSTRUCTOR
	/**
	 * @param palabraAdivinar
	 * @param palabraActual
	 */
	public Ahorcado() {
		super();
		palabraActual = new StringBuffer();
		// A�adimos el arraylist al constructor
		palabras = new ArrayList<>();
	}

	// GETTERS Y SETTERS
	/**
	 * @return the palabraAdivinar
	 */
	public String getPalabraAdivinar() {
		return palabraAdivinar;
	}

	/**
	 * @param palabraAdivinar the palabraAdivinar to set
	 */
	public void setPalabraAdivinar() {
		this.palabraAdivinar = (palabras.get((int) (Math.random() * (palabras.size() - 0) + 0))).toString();
	}

	/**
	 * @return the palabraActual
	 */
	public StringBuffer getPalabraActual() {
		return this.palabraActual;
	}

	/**
	 * @param palabraActual the palabraActual to set
	 */
	public void setPalabraActual() {

		for (int i = 0; i < this.palabraAdivinar.length(); i++) {

			this.palabraActual.append("*");
		}

	}

	// M�TODOS
	public boolean intentar(char letra) {
		boolean senal = false;
		for (int i = 0; i < this.palabraAdivinar.length(); i++) {

			if (this.palabraAdivinar.charAt(i) == letra) {
				this.palabraActual.insert(i, letra);
				this.palabraActual.deleteCharAt(i + 1);
				senal = true;
			}

		}
		return senal;

	}

	// Metodo introducir palabra al arraylist
	public void addPalabra(Palabras palabra) {
		palabras.add(palabra);
	}

	public boolean resolver(String palabra) {
		if (this.palabraAdivinar.equals(palabra))
			return true;
		else
			return false;
	}



}