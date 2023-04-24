package Ejercicio7;

import java.util.*;

public class EquipoBasket {
	/**
	 * @param nombreEquipo
	 * @param jugadores
	 */
	EquipoBasket(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;

	}

	private String nombreEquipo;
	
    @Override
	public int hashCode() {
		return Objects.hash(jugadores, nombreEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipoBasket other = (EquipoBasket) obj;
		return Objects.equals(jugadores, other.jugadores) && Objects.equals(nombreEquipo, other.nombreEquipo);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipoBasket [nombreEquipo=");
		builder.append(nombreEquipo);
		builder.append(", jugadores=");
		builder.append(jugadores);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	/**
	 * @param nombreEquipo the nombreEquipo to set
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	/**
	 * @return the jugadores
	 */
	public HashMap<Integer, JugadorBasket> getJugadores() {
		return jugadores;
	}

	/**
	 * @param jugadores the jugadores to set
	 */
	public void setJugadores(HashMap<Integer, JugadorBasket> jugadores) {
		this.jugadores = jugadores;
	}

	protected HashMap<Integer, JugadorBasket> jugadores;

    public EquipoBasket() {
        jugadores = new HashMap<>();
    }

    public void addJugador(JugadorBasket jugador, int dorsal) {
    	
        jugadores.put(dorsal, jugador);
    }

    public JugadorBasket buscarJugador(JugadorBasket jugador) {
    	
        List<JugadorBasket> jugadoresList = new LinkedList<>(jugadores.values());
        Collections.sort(jugadoresList, new Comparator<JugadorBasket>() {
            @Override
            public int compare(JugadorBasket j1, JugadorBasket j2) {
                return j1.getNombre().compareTo(j2.getNombre());
            	}
        	}
        );
        
        int index = Collections.binarySearch(jugadoresList, jugador, new Comparator<JugadorBasket>() {
            @Override
            public int compare(JugadorBasket j1, JugadorBasket j2) {
                return j1.getNombre().compareTo(j2.getNombre());
            	}
        	}
        );
        
        if (index >= 0) {
        	
            return jugadoresList.get(index);
            
        } else {
        	
            return null;
        }
    }

    public JugadorBasket buscarJugador(int dorsal) {
    	
        return jugadores.get(dorsal);
    }

    public void removeJugador(int dorsal) {
    	
        jugadores.remove(dorsal);
    }

    public void mostrarEquipo() {
    	
        System.out.println("EquipoBasket{");
        for (Map.Entry<Integer, JugadorBasket> entry : jugadores.entrySet()) {
            System.out.println("  dorsal=" + entry.getKey() + ", jugador=" + entry.getValue());
        }
        
        System.out.println("}");
    }
}