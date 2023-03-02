package ejemploEditorial;

import java.util.ArrayList;

public class Biblioteca {

private ArrayList<Publicacion> publicaciones;

public Biblioteca() {
	this.publicaciones=new ArrayList<>();
}

public void addPublicacion(Publicacion p) {
	
	if (this.publicaciones.indexOf(p)<0) {
		this.publicaciones.add(p);
	}
}


}
