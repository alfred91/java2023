package Prueba5;

import java.time.LocalDate;
import java.util.*;

public class Sorteo {
    private String nombre;
    private String descripcion;
    private LocalDate fechaSorteo;
    private int numCifras;
    private List<Integer> numerosGanadores;
    private List<Apuesta> apuestas;

    public Sorteo(String nombre, String descripcion, LocalDate fechaSorteo, int numCifras) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaSorteo = fechaSorteo;
        this.numCifras = numCifras;
        this.numerosGanadores = new ArrayList<>();
        this.apuestas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaSorteo() {
        return fechaSorteo;
    }

    public int getNumCifras() {
        return numCifras;
    }

    public List<Integer> getNumerosGanadores() {
        return numerosGanadores;
    }

    public List<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setNumerosGanadores(List<Integer> numerosGanadores) {
        this.numerosGanadores = numerosGanadores;
    }

    public void setApuestas(List<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public void addApuesta(Apuesta apuesta) {
        apuestas.add(apuesta);
    }

    public void addNumeroGanador(int numero) {
        numerosGanadores.add(numero);
    }

    public boolean isGanador(Apuesta apuesta) {
        return numerosGanadores.containsAll(apuesta.getNumerosApostados());
    }

    public double getPremio(Apuesta apuesta) {
        double premio = 0;
        if (apuesta.getNumerosApostados().size() == 1) {
            premio = apuesta.getCantidadApostada() * 5;
        } else if (apuesta.getNumerosApostados().size() == 2) {
            premio = apuesta.getCantidadApostada() * 20;
        } else if (apuesta.getNumerosApostados().size() == 3) {
            premio = apuesta.getCantidadApostada() * 50;
        }
        return premio;
    }
}