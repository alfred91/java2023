package Ejercicio1;

public class Proceso {
    private int pid;
    private String nombre;
    private int cpu;
    private int ram;
    private int prioridad;

    public Proceso(int pid, String nombre, int cpu, int ram, int prioridad) {
        this.pid = pid;
        this.nombre = nombre;
        this.cpu = cpu;
        this.ram = ram;
        this.prioridad = prioridad;
    }

    public int getPid() {
        return pid;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Proceso [pid=" + pid + ", nombre=" + nombre + ", cpu=" + cpu + ", ram=" + ram + ", prioridad="
                + prioridad + "]";
    }
}