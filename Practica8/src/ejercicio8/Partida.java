package ejercicio8;

import java.util.ArrayList;

public class  Partida {
    private Jugador jugador;
    private ArrayList<Enemigo> enemigos;
    
    public Partida(Jugador jugador) {
        this.jugador = jugador;
        enemigos = new ArrayList<Enemigo>();
        iniciarPartida();
    }
}