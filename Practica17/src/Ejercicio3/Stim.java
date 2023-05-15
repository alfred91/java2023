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
        System.out.println("No se ha encontrado la id de usuario: " + idUsuario);
		return null;
    }

    public void pintarRankingJuegos() {
        for (Juego juego : this.juegos) {
            System.out.printf("Ranking de %s - %s\n", juego.getNombre(), juego.getPlataforma());
            System.out.println("Nick \t\t Puntos");

            TreeSet<Usuario> usuariosOrdenados = new TreeSet<>((u1, u2) -> {
                Puntuacion p1 = u1.getPuntuaciones().get(juego.getId());
                Puntuacion p2 = u2.getPuntuaciones().get(juego.getId());

                if (p1 == null && p2 == null) {
                    return 0;
                } else if (p1 == null) {
                    return -1;
                } else if (p2 == null) {
                    return 1;
                }

                return p2.getPuntos() - p1.getPuntos();
            });

            for (Usuario jugador : this.jugadores) {
                Puntuacion puntuacion = jugador.getPuntuaciones().get(juego.getId());
                if (puntuacion != null) {
                    usuariosOrdenados.add(jugador);
                }
            }

            for (Usuario usuario : usuariosOrdenados) {
                Puntuacion puntuacion = usuario.getPuntuaciones().get(juego.getId());
                System.out.printf("%s \t\t %d\n", usuario.getNick(), puntuacion.getPuntos());
            }

            System.out.println();
            }
        }

	public static Juego buscarJuego(int idJuego) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


