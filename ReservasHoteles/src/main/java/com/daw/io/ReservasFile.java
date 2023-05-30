package com.daw.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.stream.Collectors;
import com.daw.modelos.Hotel;
import com.daw.modelos.HotelPlaya;
import com.daw.modelos.HotelRural;
import com.daw.modelos.Reserva;
import com.daw.service.Buking;

public class ReservasFile {
	
    private static final String HOTELES = "hoteles.csv";
    private static final String RESERVAS = "reservas.csv";

    public static Buking cargarCSV() {
        Buking buking = new Buking();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(HOTELES), StandardCharsets.UTF_8))) {
            buking.setHoteles(
                    br.lines()
                            .map(line -> {
                                String[] fields = line.split(",");
                                String nombre = fields[0].trim();
                                String direccion = fields[1].trim();
                                String ciudad = fields[2].trim();
                                String provincia = fields[3].trim();
                                int habitaciones = Integer.parseInt(fields[4].trim());
                                int calificacion = Integer.parseInt(fields[5].trim());
                                int playa = Integer.parseInt(fields[6].trim());                               
                                int calefaccion = Integer.parseInt(fields[7].trim());
                                int aireacondicionado = Integer.parseInt(fields[8].trim());

                                Hotel hotel;
                                if (playa == 1) {
                                    hotel = new HotelPlaya();
                                } else {
                                    hotel = new HotelRural(false);
                                }

                                return hotel;
                            })
                            .collect(Collectors.toList())
            );
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al cargar el fichero");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(RESERVAS))) {
        	buking.setReservas(
        			br.lines()
            	                .map(line -> {
                                String[] fields = line.split(",");
                                String fechaEntrada = fields[0].trim();
                                String fechaSalida = fields[1].trim();
                                int habitaciones = Integer.parseInt(fields[2].trim());
                                int personas = Integer.parseInt(fields[3].trim());
                                String dni = fields[4].trim();
                                String pais = fields[5].trim();
                                int hotel = Integer.parseInt(fields[6].trim());
                                return new Reserva(LocalDate.parse(fechaEntrada), LocalDate.parse(fechaSalida), habitaciones,personas, dni, pais, buking.findHotelById(hotel));
                                
                            })
            	            .peek(System.out::println)
                            .collect(Collectors.toSet()));
            ;
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo");
        }

        return buking;
    }

    public static void grabarCSV(Buking buking) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(HOTELES))) {
            buking.getHoteles().forEach(hotel -> {
                String line = hotel.getNombre() + "," + hotel.getDireccion() + "," + hotel.getLocalidad() + ","
                        + hotel.getProvincia() + "," + hotel.getNumHabitaciones() + "," + (hotel instanceof HotelPlaya ? 1 : 0);
            
                try {
                    bw.write(line);
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar los datos de hoteles");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RESERVAS))) {
            buking.getReservas().forEach(reserva -> {
                String line = reserva.getFechaEntrada() + "," + reserva.getFechaSalida() + ","
                        + reserva.getCantidadHabitaciones() + "," + reserva.getId() + ","
                        + reserva.getDni() + "," + reserva.getNacionalidad();
                try {
                    bw.write(line);
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar los datos de reservas");
        }
    }
}