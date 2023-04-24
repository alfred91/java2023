package Ejercicio8;

import java.util.HashSet;

public class Expediente {
	
    private Estudiante estudiante;
    private HashSet<NotasCurso> notas;
    private boolean activo;

    public Expediente(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.notas = new HashSet<>();
        this.activo = true;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public HashSet<NotasCurso> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<NotasCurso> notas) {
        this.notas = notas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void addNotas(NotasCurso nc) {
        notas.add(nc);
    }

    public void mostrarNotas(int curso, String etapa) {
        System.out.println("Notas de " + estudiante.getNombre() + " " + estudiante.getApellidos() + " en " + etapa + " curso " + curso + ":");
        for (NotasCurso nc : notas) {
            if (nc.getEtapaEducativa().equals(etapa) && nc.getCurso() == curso) {
                nc.pintar();
            }
        }
    }

    @Override
    public String toString() {
        return "Expediente de " + estudiante.getNombre() + " " + estudiante.getApellidos() + " (" + estudiante.getDni() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Expediente) {
            Expediente e = (Expediente) obj;
            return estudiante.equals(e.getEstudiante());
        }
        return false;
    }
}