package Ejercicio8;

import java.util.*;

public class NotasCurso {
	
    protected String etapaEducativa;
    protected String nombreCiclo;
    protected int curso;
    protected Map<String, Double> notas;
    protected int anio;

    public NotasCurso(String etapaEducativa, String nombreCiclo, int curso, int anio) {
    	
        this.etapaEducativa = etapaEducativa;
        this.nombreCiclo = nombreCiclo;
        this.curso = curso;
        this.notas = new HashMap<>();
        this.anio = anio;
    }


    public NotasCurso(NotasCurso otro) {
    	
        this.etapaEducativa = otro.etapaEducativa;
        this.nombreCiclo = otro.nombreCiclo;
        this.curso = otro.curso;
        this.notas = otro.notas;
        this.anio = otro.anio;
    }

    public String getEtapaEducativa() {
        return etapaEducativa;
    }

    public void setEtapaEducativa(String etapaEducativa) {
        this.etapaEducativa = etapaEducativa;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void addNota(String asignatura, double nota) {
        notas.put(asignatura, nota);
    }

    public void deleteNota(String asignatura) {
        notas.remove(asignatura);
    }

    public Double buscar(String asignatura) {
        return notas.get(asignatura);
    }

    public void pintar() {
        System.out.println("Notas de " + etapaEducativa + " - " + nombreCiclo + " - Curso " + curso + " - Año " + anio);
        System.out.println("----------------------------------------------");
        List<String> asignaturas = new ArrayList<>(notas.keySet());
        Collections.sort(asignaturas);
        for (String asignatura : asignaturas) {
            System.out.println(asignatura + ": " + notas.get(asignatura));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return curso == that.curso && Objects.equals(etapaEducativa, that.etapaEducativa) && Objects.equals(nombreCiclo, that.nombreCiclo) && anio == that.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(etapaEducativa, nombreCiclo, curso, anio);
    }

    @Override
    public String toString() {
        return "NotasCurso{" +
                "etapaEducativa='" + etapaEducativa + '\'' +
                ", nombreCiclo='" + nombreCiclo + '\'' +
                ", curso=" + curso +
                ", notas=" + notas +
                ", anio=" + anio +
                '}';
    }
}