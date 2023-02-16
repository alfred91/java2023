package BusquedaBinaria;
import java.util.*;
public class Agenda {
private ArrayList<Contacto> agenda;
public Agenda() {
	this.agenda=new ArrayList<>();
}
public Contacto buscarContactoEficiente(Contacto c){
	
	int posicion = Collections.binarySearch(this.agenda, c);
	
	if (posicion >=0) {
		return this.agenda.get(posicion);
	} else 
		return null;
}

public Contacto buscarContacto(Contacto c) {
	
	int posicion=this.agenda.indexOf(c);
	
	if (posicion>=0) {
		return this.agenda.get(posicion);	
		}	else 
				return null;
	}

public Contacto buscarContacto(String telefono) {
	
	int posicion=this.agenda.indexOf(new Contacto(telefono,"",""));
	if (posicion>=0) {
		return this.agenda.get(posicion);
	} else 
		return null;
}
	public void addContacto(Contacto c) {
		int posicion=this.agenda.indexOf(c);
		if (posicion<0) {
			this.agenda.add(c);
		}
	}
	public void pintarAgenda() {
	//Ordenar antes de pintar. Utiliza el Comparable de Contacto
		Collections.sort(this.agenda);
		
		System.out.println("AGENDA");
		System.out.println("------");
		System.out.println();
		
		for (Contacto c: this.agenda) {
			System.out.println(c);
		}
	}
}