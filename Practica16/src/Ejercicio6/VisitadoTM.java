package Ejercicio6;

import java.util.*;

public class VisitadoTM {
	
    private TreeMap<String, List<String>> visitados;

    public VisitadoTM() {
        this.visitados = new TreeMap<>(Comparator.reverseOrder());
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
            Collections.sort(ciudades); // ordenar alfabéticamente
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

    public List<String> primeros(String pais) {
        return new ArrayList<>(visitados.headMap(pais).keySet());
    }
    
    public Set<String> primerosSet(String pais) {
        return visitados.headMap(pais).keySet();
    }
}