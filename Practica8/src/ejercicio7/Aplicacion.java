package ejercicio7;

import java.util.Scanner;
 
public class Aplicacion {
 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(10);
        int opc;
        
        do {
            System.out.println("---------AGENDA----------");
            System.out.println();
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Busqueda ");
            System.out.println("4. Verificar existencia");
            System.out.println("5. Eliminar");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion (1-7): ");
            opc = sc.nextInt();
            sc.nextLine();
            
	            switch (opc) {
	                case 1:
	                    System.out.print("Ingrese el nombre del contacto: ");
	                    String nombre = sc.nextLine();
	                    System.out.print("Ingrese el número telefónico del contacto: ");
	                    int telefono = sc.nextInt();
	                    Contacto contacto = new Contacto(nombre, telefono);
	                    agenda.añadirContacto(contacto);
	                    break;
	                case 2:
	                    agenda.listarContactos();
	                    break;
	                case 3:
	                    System.out.print("Ingrese el nombre del contacto a buscar: ");
	                    String nombreBuscar = sc.nextLine();
	                    agenda.buscarContacto(nombreBuscar);
	                    break;
	                case 4:
	                    System.out.print("Ingrese el nombre del contacto a verificar: ");
	                    String nombreVerificar = sc.nextLine();
	                    if (agenda.existeContacto(nombreVerificar)) {
	                        System.out.println("El contacto existe en la agenda.");
	                    } else {
	                        System.out.println("El contacto no existe en la agenda.");
	                    }
	                    break;
	                case 5:
	                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
	                    String nombreEliminar = sc.nextLine();
	                    agenda.eliminarContacto(nombreEliminar);
	                    break;
	                case 6:
	                    System.out.println("Hay " + agenda.contactosDisponibles() + " contactos disponibles.");
	                    break;
	                case 7:
	                    System.out.println("Adios");
	                    break;
	                default:
	                    System.out.println("Opcion incorrecta.");
	            }
	        } while (opc != 7);
	  }
}