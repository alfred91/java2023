package Ejercicio7;

import java.util.TreeMap;

public class LigaACBTreeMap {

	    private TreeMap<String, EquipoBasket> equipos;

	    public void LigaACB() {
	        equipos = new TreeMap<>();
	    }

	    public void addEquipo(String nombreEquipo, EquipoBasket equipo) {
	        equipos.put(nombreEquipo, equipo);
	    }

	    public void removeEquipo(String nombreEquipo) {
	        equipos.remove(nombreEquipo);
	    }

	    public EquipoBasket buscarEquipo(String nombreEquipo) {
	        return equipos.get(nombreEquipo);
	    }
	}