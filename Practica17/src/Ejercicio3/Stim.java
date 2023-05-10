package Ejercicio3;

import java.util.*;

public class Stim {
    private ArrayList<Juego> juegos;
    private LinkedList<Usuario> jugadores;
    

    public Stim() {
        juegos = new ArrayList<>();
        jugadores = new LinkedList<>();
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public LinkedList<Usuario> getJugadores() {
        return jugadores;
    }

    public void addJuego(Juego juego) {
        juegos.add(juego);
    }

    public void delJuego(Juego juego) {
        juegos.remove(juego);
    }

    public void addJugador(Usuario jugador) {
        jugadores.add(jugador);
    }

    public void listarJugadores() {
        System.out.println("Lista de jugadores:");
        for (Usuario jugador : jugadores) {
            System.out.println(jugador.toString());
        }
    }

    public void listarJuegos() {
        System.out.println("Lista de juegos:");
        for (Juego juego : juegos) {
            System.out.println(juego.toString());
        }
    }

    public TreeSet<Puntuacion> obtenerPuntuaciones(int idJuego) {
        TreeSet<Puntuacion> puntuaciones = new TreeSet<>();
        for (Usuario jugador : jugadores) {
            Puntuacion puntuacion = jugador.getPuntuaciones().get(idJuego);

            if (puntuacion != null) {
                puntuaciones.add(puntuacion);
            }
        }
        return puntuaciones;
    }

    public Puntuacion buscarPuntuacion(int idJuego, int idUsuario) {
        for (Usuario jugador : jugadores) {
            if (jugador.getId() == idUsuario) {
                Puntuacion puntuacion = jugador.getPuntuaciones().get(idJuego);
                if (puntuacion != null) {
                    System.out.println("Puntuación de " + jugador.getNick() + " en el juego " + idJuego + ": " +
                            "puntos: " + puntuacion.getPuntos() + " - partidas jugadas: " + puntuacion.getPJ() +
                            " - partidas ganadas: " + puntuacion.getPG());
                } else {
                    System.out.println("El usuario no ha jugado a ese juego.");
                }
                return puntuacion;
            }
        }
        System.out.println("No se encontró el usuario con id " + idUsuario);
		return null;
    }

    public void pintarRankingJuegos() {
        System.out.println("Ranking de juegos:");
        for (Juego juego : juegos) {
            System.out.println(juego.getNombre() + " - " + juego.getPlataforma());
            ArrayList<Usuario> usuariosQueJuegan = new ArrayList<>();
            for (Usuario jugador : jugadores) {
                if (jugador.getPuntuaciones().containsKey(juego.getId())) {
                    usuariosQueJuegan.add(jugador);
                }
            }
            usuariosQueJuegan.sort(Comparator.comparingInt
            		(u -> -u.getPuntuacion(juego.getId()).getPuntos()));
            System.out.println("Nick\t\tPuntos");
            for (Usuario jugador : usuariosQueJuegan) {
                Puntuacion puntuacion = jugador.getPuntuacion(juego.getId());
                System.out.printf("%-15s %d\n", jugador.getNick(), puntuacion.getPuntos());
            }
            System.out.println();
        }
    }

	public static Juego buscarJuego(int idJuego) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


