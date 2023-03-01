package ejercicio1;

public class Repartidor extends Empleado {
    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        if (getEdad() < 25 && zona.equals("zona 3")) {
            setSalario(getSalario() + PLUS);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Zona: " + zona;
    }
}