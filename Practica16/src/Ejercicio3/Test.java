package Ejercicio3;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.nuevoContacto("Cati Flores", "636666987");
		agenda.nuevoContacto("Javi Guillén", "622552992");
		agenda.nuevoContacto("Ana", "636666987");
		
		System.out.println(agenda.listarContactos());
		System.out.println(agenda.buscarContacto(""));

	}

}