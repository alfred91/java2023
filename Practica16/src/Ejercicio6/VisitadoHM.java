package Ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisitadoHM {
    private Map<String, List<String>> visitados;

    public VisitadoHM() {
        this.visitados = new HashMap<>();
    }

    public void addPais(String nombre) {
        if (!visitados.containsKey(nombre)) {
            visitados.put(nombre, new ArrayList<>());
        }
    }

    public void addCiudad(String nombrePais, String nombreCiudad) {
        List<String> ciudades = visitados.get(nombrePais);
        if (ciudades != null) {
            ciudades.add(nombreCiudad);
            ciudades.sort(null);
        }
    }

    public void mostrarVisitados() {
        for (Map.Entry<String, List<String>> entry : visitados.entrySet()) {
            System.out.println("País: " + entry.getKey());
            System.out.println("Ciudades visitadas: " + entry.getValue().toString());
        }
    }

    public boolean heVisitado(String pais, String ciudad) {
        List<String> ciudades = visitados.get(pais);
        return ciudades != null && ciudades.contains(ciudad);
    }
}
