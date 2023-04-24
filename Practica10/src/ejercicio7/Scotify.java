package ejercicio7;

import java.util.ArrayList;

import ejercicio7.Multimedia.Genero;

public class Scotify {

	private Multimedia[] multimedia;

	public ArrayList<Cancion> buscarPorGenero(Enum genero) {
	    ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	    for (Multimedia m : this.multimedia) {
	        if (m instanceof Cancion) {
	            Cancion cancion = (Cancion) m;
	            if (cancion.getGenero() == genero) {
	                canciones.add(cancion);
	            }
	        }
	    }
	    return canciones;
	}

	public void addMultimedia(Disco disco1) {
		// TODO Auto-generated method stub
		
	}
}
