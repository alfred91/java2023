package Ejercicio7;

import java.util.ArrayList;
import java.util.HashMap;

class LigaACBHashMap {
    private HashMap<String, ArrayList<JugadorBasket>> equipos;

    public void LigaACB() {
        equipos = new HashMap<>();
    }

    public void addJugador(String nombreEquipo, JugadorBasket jugador) {
        ArrayList<JugadorBasket> listaJugadores = equipos.getOrDefault(nombreEquipo, new ArrayList<>());
        listaJugadores.add(jugador);
        equipos.put(nombreEquipo, listaJugadores);
    }

    public void removeJugador(String nombreEquipo, JugadorBasket jugador) {
        ArrayList<JugadorBasket> listaJugadores = equipos.get(nombreEquipo);
        if (listaJugadores != null) {
            listaJugadores.remove(jugador);
        }
    }

    public ArrayList<JugadorBasket> buscarJugadoresEquipo(String nombreEquipo) {
        return equipos.get(nombreEquipo);
    }
}
