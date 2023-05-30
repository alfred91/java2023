package com.daw.application;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.daw.modelos.Hotel;
import com.daw.modelos.Reserva;
import com.daw.service.Buking;
import com.daw.io.ReservasFile;

public class AppBuking {
	
    private static Buking buking;

    public static void main(String[] args) {
    	
        buking = ReservasFile.cargarCSV();
        
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            Menu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    listarHoteles();
                    break;
                case 2:
                    listarReservasOrdenadas();
                    break;
                case 3:
                    mostrarReservasPorPais();
                    break;
                case 4:
                    mostrarReservasActivas();
                    break;
                case 5:
                    mostrarImporteReservasFinalizadasEsteAnio();
                    break;
                case 6:
                    insertarReserva(sc);
                    break;
                case 7:
                    eliminarReserva(sc);
                    break;
                case 8:
                    guardarDatosEnArchivos();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Error. Introduce un número correcto.");
                    break;
            }

            System.out.println();
        } while (opcion != 9);

        sc.close();
    }

    private static void Menu() {
        System.out.println("---- M E N U ----");
        System.out.println();
        System.out.println("1. Listar todos los hoteles");
        System.out.println("2. Listar todas las reservas ordenadas por fecha de entrada");
        System.out.println("3. Mostrar reservas por país");
        System.out.println("4. Mostrar reservas activas por hotel");
        System.out.println("5. Mostrar importe de reservas finalizadas este anio por hotel");
        System.out.println("6. Insertar reserva");
        System.out.println("7. Eliminar reserva");
        System.out.println("8. Guardar datos y salir");
        System.out.println("9. Salir");
        System.out.println();
        System.out.print("Elige una opcion: ");
    }

    private static void listarHoteles() {
        System.out.println("---- Listado de Hoteles ----");
        for (Hotel hotel : buking.getHoteles()) {
            System.out.println(hotel.getNombre());
        }
    }

    private static void listarReservasOrdenadas() {
        System.out.println("---- Listado de Reservas Ordenadas ----");
        buking.getReservas().stream()
                .sorted(Comparator.comparing(Reserva::getFechaEntrada))
                .forEach(System.out::println);
    }

    private static void mostrarReservasPorPais() {
        System.out.println(" Reservas por Pais ");
        buking.getReservas().stream()
                .collect(Collectors.groupingBy(Reserva::getNacionalidad, Collectors.counting()))
                .forEach((pais, cantidad) -> System.out.println(pais + ": " + cantidad + " reservas"));
    }
    
    private static void mostrarReservasActivas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el ID del hotel: ");
        int hotelId = sc.nextInt();
        sc.nextLine();

        Hotel hotel = buking.findHotelById(hotelId);
        if (hotel != null) {
            System.out.println("Reservas Activas para el Hotel " + hotel.getNombre());
            buking.getReservas().stream()
                    .filter(reserva -> reserva.getHotel().equals(hotel) && reserva.getFechaSalida().isBefore(LocalDate.now()))
                    .sorted(Comparator.comparing(Reserva::getFechaSalida))
                    .forEach(System.out::println);
        } else {
            System.out.println("No hemos encontrado ningun hotel con ese ID .");
        }
    }
    
    private static void mostrarImporteReservasFinalizadasEsteAnio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el ID del hotel: ");
        int hotelId = sc.nextInt();
        sc.nextLine();
    
        
        Hotel hotel = buking.findHotelById(hotelId);
        if (hotel != null) {
            System.out.println("---- Reservas Activas para el Hotel " + hotel.getNombre() + " ----");
            buking.getReservas().stream()
                    .filter( reserva -> reserva.getHotel().equals(hotel) && reserva.getFechaSalida().isBefore(LocalDate.now()))
                    .sorted(Comparator.comparing(Reserva::getFechaSalida))
                    .forEach(System.out::println);
        } else {
            System.out.println("No se encontró un hotel con el ID especificado.");
            }
    }
    

    private static void insertarReserva(Scanner sc) {
    	
    }

   	
    	private static void eliminarReserva(Scanner sc) {
    	    System.out.println("---- Eliminar Reserva ----");
    	    System.out.print("ID de la reserva: ");
    	    int reservaId = Integer.parseInt(sc.nextLine());

    	    Reserva reserva = buking.getReservas().stream()
    	            .filter(r -> r.getId() == reservaId)
    	            .findFirst()
    	            .orElse(null);

    	    if (reserva != null) {
    	        buking.deleteReserva(reserva.getId());
    	        System.out.println("Reserva eliminada correctamente.");
    	    } else {
    	        System.out.println("No se encontró una reserva con el ID especificado. No se pudo eliminar la reserva.");
    	    }
    	}
    

    private static void guardarDatosEnArchivos() {
    	
        ReservasFile.grabarCSV(buking);
        System.out.println("Datos grabados en hoteles.csv y reservas.csv.");
    
    }
}