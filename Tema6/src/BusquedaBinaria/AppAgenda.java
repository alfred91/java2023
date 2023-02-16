package BusquedaBinaria;

public class AppAgenda {

	public static void main(String[] args) {
		
		Agenda ag = new Agenda();
		ag.addContacto(new Contacto("666555111", "Luis", "García"));
		ag.addContacto(new Contacto("666555233", "Manuel", "Simón"));
		ag.addContacto(new Contacto("625336655", "Nerea", "Martínez"));
		ag.addContacto(new Contacto("646589999", "Isabel", "Noriega"));
		ag.pintarAgenda();
	}

}