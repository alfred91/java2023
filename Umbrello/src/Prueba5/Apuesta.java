package Prueba5;

import java.util.List;

public class Apuesta {
    private Sorteo sorteo;
    private Participante participante;
    private int cantidadApostada;
    private List<Integer> numerosApostados;

    public Apuesta(Sorteo sorteo, Participante participante, int cantidadApostada, List<Integer> numerosApostados) {
        this.sorteo = sorteo;
        this.participante = participante;
        this.cantidadApostada = cantidadApostada;
        this.numerosApostados = numerosApostados;
    }

    public Sorteo getSorteo() {
        return sorteo;
    }

    public Participante getParticipante() {
        return participante;
    }

    public int getCantidadApostada() {
        return cantidadApostada;
    }

    public List<Integer> getNumerosApostados() {
        return numerosApostados;
    }
}