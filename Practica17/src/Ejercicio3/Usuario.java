package Ejercicio3;

import java.util.HashMap;

public class Usuario {
    private static int nextId = 1;
    private int id;
    private String nombre;
    private String email;
    private String nick;
    private HashMap<Integer, Puntuacion> puntuaciones;

    public Usuario(String nombre, String email, String nick) {
        this.id =nextId++;
        this.nombre = nombre;
        this.email = email;
        this.nick = nick;
        this.puntuaciones = new HashMap<Integer, Puntuacion>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public HashMap<Integer, Puntuacion> getPuntuaciones() {
        return puntuaciones;
    }

    public void addPuntuacion(int idJuego, boolean haGanado, int puntosObtenidos) {
        Juego juego = Stim.buscarJuego(idJuego);
        if (juego != null) {
            Puntuacion puntuacion = puntuaciones.get(idJuego);
            if (puntuacion == null) {
                puntuacion = new Puntuacion();
                puntuaciones.put(idJuego, puntuacion);
            }
            puntuacion.setPJ(puntuacion.getPJ() + 1);
            puntuacion.setPuntos(puntuacion.getPuntos() + puntosObtenidos);
            if (haGanado) {
                puntuacion.setPG(puntuacion.getPG() + 1);
            } else {
                puntuacion.setPP(puntuacion.getPP() + 1);
            }
        }
    }

    public int getPuntuacion(int idJuego) {
        if (puntuaciones.containsKey(idJuego)) {
            return puntuaciones.get(idJuego).getPuntos();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return nick + " - " + email;
    }
}