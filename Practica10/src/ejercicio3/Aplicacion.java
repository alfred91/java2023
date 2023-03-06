package ejercicio3;

import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {
        // Creamos un ArrayList de Series y agregamos algunas instancias
        ArrayList<Serie> listaSeries = new ArrayList<>();
        listaSeries.add(new Serie());
        listaSeries.add(new Serie("Breaking Bad", "Vince Gilligan"));
        listaSeries.add(new Serie("Game of Thrones", 8, "Fantasía", "George R. R. Martin"));

        // Entregamos la serie de índice 1
        listaSeries.get(1).entregar();

        // Creamos un ArrayList de Videojuegos y agregamos algunas instancias
        ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
        listaVideojuegos.add(new Videojuego());
        listaVideojuegos.add(new Videojuego("The Legend of Zelda: Breath of the Wild", 200, "Aventura", "Nintendo"));
        listaVideojuegos.add(new Videojuego("Grand Theft Auto V", 100, "Acción", "Rockstar Games"));

        // Entregamos el videojuego de índice 2
        listaVideojuegos.get(2).entregar();

        // Recorremos la lista de Series y mostramos información de cada objeto
        System.out.println("LISTA DE SERIES:");
        int seriesPrestadas = 0;
        for (Serie serie : listaSeries) {
            System.out.println(serie.toString());
            if (serie.isPrestado()) {
                System.out.println("Estado: Prestado");
                seriesPrestadas++;
            } else {
                System.out.println("Estado: Disponible");
            }
        }

        // Recorremos la lista de Videojuegos y mostramos información de cada objeto
        System.out.println("\nLISTA DE VIDEOJUEGOS:");
        int videojuegosPrestados = 0;
        for (Videojuego videojuego : listaVideojuegos) {
            System.out.println(videojuego.toString());
            if (videojuego.isPrestado()) {
                System.out.println("Estado: Prestado");
                videojuegosPrestados++;
            } else {
                System.out.println("Estado: Disponible");
            }
        }

        // Indicamos cuántas Series y Videojuegos hay prestados
        System.out.println("\nSeries prestadas: " + seriesPrestadas);
        System.out.println("Videojuegos prestados: " + videojuegosPrestados);
    }

}
