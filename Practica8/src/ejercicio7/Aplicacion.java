package ejercicio7;

import java.util.*;
 
public class Aplicacion {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        Agenda agendaTelefonica = new Agenda(3);
        String nombre;
        int telefono;
 
        Contacto c;
 
        while (!salir) {
 
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Existe contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Agenda llena");
            System.out.println("8. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:

                        System.out.println("Escribe un nombre");
                        nombre = sc.nextLine();
 
                        System.out.println("Escribe un telefono");
                        telefono = sc.nextInt();

                        c = new Contacto(nombre, telefono);
 
                        agendaTelefonica.aniadirContacto(c);
 
                        break;
                    case 2:
 
                        agendaTelefonica.listarContactos();
 
                        break;
                    case 3:

                        System.out.println("Escribe un nombre");
                        nombre = sc.nextLine();
 
                        agendaTelefonica.buscarPorNombre(nombre);
 
                        break;
                    case 4:

                        System.out.println("Escribe un nombre");
                        nombre = sc.next();

                        c = new Contacto(nombre, 0);
 
                        if (agendaTelefonica.existeContacto(c)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No existe contacto");
                        }
 
                        break;
                    case 5:

                        System.out.println("Escribe un nombre");
                        nombre = sc.nextLine();
 
                        //Creo el contacto auxiliar
                        c = new Contacto(nombre, 0);
 
                        agendaTelefonica.eliminarContacto(c);
 
                        break;
                    case 6:
 
                        System.out.println("Hay " + agendaTelefonica.huecosLibre() + " contactos libre");
 
                        break;
                    case 7:
 
                        //como devuelve un booleano, lo meto en un if
                        if (agendaTelefonica.agendaLlena()) {
                            System.out.println("La agenda esta llena");
                        } else {
                            System.out.println("Aun puedes meter contactos");
                        }
 
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
 
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.nextLine();
            }
        }
    }
}