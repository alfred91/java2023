package Ejercicio2;

import java.util.ArrayList;

class Biblioteca {
	
    private ArrayList<Publicacion> publicaciones;

    public Biblioteca() {
        publicaciones = new ArrayList<>();
    }

    public void addPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void buscar(String titulo) {
        int left = 0;
        int right = publicaciones.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Publicacion p = publicaciones.get(mid);

            if (p.getTitulo().equals(titulo)) {
                System.out.println("Publicación encontrada: " + p.getTitulo());
                return;
            } else if (p.getTitulo().compareTo(titulo) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Publicación no encontrada.");
    }

    public void buscar(Autor autor) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getAutores().contains(autor)) {
            	System.out.println(publicacion.getTitulo());
            }
        }
    }
            }