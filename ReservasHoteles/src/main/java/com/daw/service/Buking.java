package com.daw.service;
import java.time.LocalDate;
import java.util.*;
import com.daw.modelos.Hotel;
import com.daw.modelos.HotelPlaya;
import com.daw.modelos.HotelRural;
import com.daw.modelos.Reserva;


public class Buking {
	
    private List<Hotel> hoteles;
    private Set<Reserva> reservas;

    /**
	 * @return the hoteles
	 */
	public List<Hotel> getHoteles() {
		return hoteles;
	}

	/**
	 * @return the reservas
	 */
	public Set<Reserva> getReservas() {
		return reservas;
	}

	public Buking() {
        this.hoteles = new ArrayList<>();
        this.reservas = new HashSet<>();
    }

    /**
	 * @param hoteles the hoteles to set
	 */
	public void setHoteles(List<Hotel> hoteles) {
		this.hoteles = hoteles;
	}

	/**
	 * @param reservas the reservas to set
	 */
	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

/**
 * Añadir hotel
 * @param hotel
 */
	public void addHotel(Hotel hotel) {
        hoteles.add(hotel);
        }

	/*
	 * Borrar hotel
	 */
    public void deleteHotel(int id) {
        hoteles.removeIf(hotel -> hotel.getId() == id);
    }

    /*
     * Añadir reserva
     */
    public void addReserva(LocalDate fechaEntrada, LocalDate fechaSalida, int cantidadHabitaciones, int numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {
        if (hoteles.contains(hotel)) {
            Reserva reserva = new Reserva(fechaEntrada, fechaSalida, cantidadHabitaciones, numPersonasPorHabitacion, dni, nacionalidad, hotel);
            reservas.add(reserva);
        }
    }
    /*
     * Borrar reserva
     */
    public void deleteReserva(int id) {
        reservas.removeIf(reserva -> reserva.getId() == id);
    }

    /*
     * Buscar hotel por id
     */
    public Hotel findHotelById(int id) {
        for (Hotel hotel : hoteles) {
            if (hotel.getId() == id) {
                return hotel;
            }
        }
        return null;
    }   
    /**
     * Buscar hoteles por provincia 
     * @param provincia
     * @return
     */
    public List<Hotel> findHotelByProvincia(String provincia) {
        List<Hotel> foundHotels = new ArrayList<>();
        for (Hotel hotel : hoteles) {
            if (hotel.getProvincia().equalsIgnoreCase(provincia)) {
                foundHotels.add(hotel);
            }
        }
        return foundHotels;
    }
   
    /**
     * Obtener los hoteles mas pequeños
     * @return
     */
    
    public List<Hotel> getHotelesPequeños() {
        List<Hotel> smallHotels = new ArrayList<>();
        for (Hotel hotel : hoteles) {
            if (hotel.getNumHabitaciones() < 20) {
                smallHotels.add(hotel);
            }
        }
        smallHotels.sort((h1, h2) -> Double.compare(h2.getPrecioNoche(), h1.getPrecioNoche()));
        return smallHotels;
    }

    /*
     * Hoteles mas caros
     */
    public List<Hotel> getHotelesCaros() {
        List<Hotel> expensiveHotels = new ArrayList<>(hoteles);
        expensiveHotels.sort((h1, h2) -> Double.compare(h2.getPrecioNoche(), h1.getPrecioNoche()));
        return expensiveHotels.subList(0, Math.min(expensiveHotels.size(), 2));
    }

    /*
     * Obtener Hoteles por Localidad
     */
    public HashMap<String, List<Hotel>> getHotelesLocalidad() {
        HashMap<String, List<Hotel>> hotelByLocalidad = new HashMap<>();
        for (Hotel hotel : hoteles) {
            String localidad = hotel.getLocalidad();
            if (hotelByLocalidad.containsKey(localidad)) {
                hotelByLocalidad.get(localidad).add(hotel);
            } else {
                List<Hotel> localidadHotels = new ArrayList<>();
                localidadHotels.add(hotel);
                hotelByLocalidad.put(localidad, localidadHotels);
            }
        }
        for (List<Hotel> localidadHotels : hotelByLocalidad.values()) {
            localidadHotels.sort((h1, h2) -> Double.compare(h2.getPrecioNoche(), h1.getPrecioNoche()));
        }
        return hotelByLocalidad;
    }

    /**
     * Mostrar los hoteles de la playa
     * @return
     */
    public Set<Hotel> getHotelesPlaya() {
        Set<Hotel> playaHotels = new HashSet<>();
        for (Hotel hotel : hoteles) {
            if (hotel instanceof HotelPlaya) {
                playaHotels.add(hotel);
            }
        }
        return playaHotels;
    }

    /*
     * Mostrar los hoteles que son rurales
     */
    public Set<Hotel> getHotelesRurales() {
        Set<Hotel> HotelRural = new HashSet<>();
        for (Hotel hotel : hoteles) {
            if (hotel instanceof HotelRural) {
            	HotelRural.add(hotel);
            }
        }
        return HotelRural;
    }

    /*
     * Buscar reserva por ID
     */
    public Reserva findReservaById(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null;
    }

    	/*
    	 * Buscar reserva por DNI
    	 */
    public List<Reserva> findReservaByDNI(String dni) {
        List<Reserva> foundReservas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getDni().equalsIgnoreCase(dni)) {
                foundReservas.add(reserva);
            }
        }
        return foundReservas;
    }

    /*
     * Obtener las reservas de un pais
     */
    public HashMap<String, Long> getReservasPais() {
        HashMap<String, Long> reservasByPais = new HashMap<>();
        for (Reserva reserva : reservas) {
            String pais = reserva.getNacionalidad();
            reservasByPais.put(pais, reservasByPais.getOrDefault(pais, 0L) + 1);
        }
        return reservasByPais;
    }

    /*
     * Obtener las reservas Grandes (2+ HAB)
     */
    public List<Reserva> getReservasGrandes() {
        List<Reserva> largeReservas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getCantidadHabitaciones() > 2) {
                largeReservas.add(reserva);
            }
        }
        return largeReservas;
    }

    
    /*
     * Lista de reservas ordenadas por fecha
     */
    public List<Reserva> getReservasOrdenadas() {
        List<Reserva> orderedReservas = new ArrayList<>(reservas);
        orderedReservas.sort((r1, r2) -> r1.getFechaEntrada().compareTo(r2.getFechaEntrada()));
        return orderedReservas;
    }
    
    

    /*
     * Obtener el importe de una reserva por su ID
     */
    public double getImporteReserva(int idReserva) {
        Reserva reserva = findReservaById(idReserva);
        if (reserva != null) {
            long numDias = reserva.getFechaSalida().toEpochDay() - reserva.getFechaEntrada().toEpochDay();
            return reserva.getHotel().getPrecioNoche() * reserva.getCantidadHabitaciones() * numDias;
        }
        return 0.0;
    }

    
    /*
     * Listar reservas activas por ID Hotel
     */
    public List<Reserva> getReservasActivas(int idHotel) {
        List<Reserva> activeReservas = new ArrayList<>();
        Hotel hotel = findHotelById(idHotel);
        if (hotel != null) {
            LocalDate today = LocalDate.now();
            for (Reserva reserva : reservas) {
                if (reserva.getHotel().equals(hotel) && reserva.getFechaEntrada().isBefore(today.plusDays(1)) && reserva.getFechaSalida().isAfter(today.minusDays(1))) {
                    activeReservas.add(reserva);
                }
            }
        }
        return activeReservas;
    }

    /*
     * Obtener el importe Total de las reservas ya finalizadas, por ID Hotel
     */
    public double getImporteReservasFinalizadas(int idHotel) {
        double totalImporte = 0.0;
        Hotel hotel = findHotelById(idHotel);
        if (hotel != null) {
            LocalDate today = LocalDate.now();
            for (Reserva reserva : reservas) {
                if (reserva.getHotel().equals(hotel) && reserva.getFechaSalida().isBefore(today)) {
                    totalImporte += getImporteReserva(reserva.getId());
                }
            }
        }
        return totalImporte;
    }
}