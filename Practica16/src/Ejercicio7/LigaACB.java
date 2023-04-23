package Ejercicio7;
import java.util.HashMap;

public class LigaACB {
	
	private HashMap<String, EquipoBasket> equipos;

    public LigaACB() {
        equipos = new HashMap<>();
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
