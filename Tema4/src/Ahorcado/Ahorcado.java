package Ahorcado;

public class Ahorcado {

	private static String[] palabras = {"casa", "perro", "coche"};
	private String palabraAdivinar;
	private String palabraActual;
	private int numFallos;
	
	public Ahorcado() {
		//Elegir una palabra al azar de 'palabras' y ponerla en 'palabrasAAdivinar'
		//Rellenar con guiones (tantos como 'palabraAAdiviniar') el string 'palabraActual'
		//Iniciar numFallos a cero
	}
	
	/**
	 * Busca la letra en 'palabraAAdivinar', y si aparece la coloca en la misma posición en 'palabraActual'
	 * Si la encuentra (al menos una), devuelve true, sino incrementa el número de fallos y devuelve false
	 * @param letra
	 * @return
	 */
	public boolean intentar(char letra) {
		
		return false;
	}
	
	/**
	 * Comprobar que 'palabra' es igual a 'palabraAAdivinar', si son igual devuelve true (has ganado), sino false (has perdido)
	 * @param palabra
	 * @return
	 */
	public boolean resolver(String palabra) {
		
		return false;
	}
	
	public String getPalabraActual() {
		return this.palabraActual;
	}
	
	public int getNumFallos() {
		return this.numFallos;
	}
	
}
