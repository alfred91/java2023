package PracticaCopia;

import java.util.Scanner;

import PracticaCopia.Gamer.Nivel;


public class TestGamer {
    public static void main(String[] args) {
        Discord discord = new Discord();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println(" =={=========- MENU -==========}==");
            System.out.println();
            System.out.println("  1- Crear Jugador");
            System.out.println("  2- Eliminar Jugador");
            System.out.println("  3- Buscar por Nick");
            System.out.println("  4- Listar Jugadores");
            System.out.println("  5- Guardar y Salir");
            System.out.println();

            System.out.print(" Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Introduce el nick: ");
                    String nick = scanner.nextLine();
                    System.out.print("Introduce el email: ");
                    String email = scanner.nextLine();
                    System.out.print("Introduce el juego: ");
                    String juego = scanner.nextLine();
                    System.out.print("Introduce el nivel del jugador (DIOS, MÁQUINA, BUENO, NORMAL, REGULAR, MALILLO, PAQUETE): ");
                    String nivelStr = scanner.nextLine();
                    Nivel nivel = Nivel.valueOf(nivelStr);
                    Gamer gamer = new Gamer(nick, email, juego, nivel);
                    discord.addGamer(gamer);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Introduce el nick del Jugador a eliminar: ");
                    String nickEliminar = scanner.nextLine();
                    Gamer gamerEliminar = discord.findGamer(nickEliminar);
                    if (gamerEliminar != null) {
                        discord.removeGamer(gamerEliminar);
                    } else {
                        System.out.println("No se ha encontrado el Jugador con el nick especificado.");
                    }
                    break;
                case 3:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Introduce el nick del Jugador a buscar: ");
                    String nickBuscar = scanner.nextLine();
                    Gamer gamerBuscar = discord.findGamer(nickBuscar);
                    if (gamerBuscar != null) {
                        System.out.println("Jugador encontrado:");
                        System.out.println(gamerBuscar);
                    } else {
                        System.out.println("No se ha encontrado el jugador con el nick '"+nickBuscar+"'");
                    }
                    break;
                case 4:
                    discord.listGamers();
                    break;
                case 5:
                    discord.saveGamers();
                    System.out.println("HASTA PRONTO");
                    break;
                default:
                    System.out.println("Error. Elige una de las opciones disponibles");
            }
            System.out.println();
        }

        scanner.close();
    }
}
