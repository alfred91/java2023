package Ejercicio7;

import java.util.*;

public class EquipoBasket {
	
    private Map<Integer, JugadorBasket> jugadores;

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