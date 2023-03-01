package ejercicio1;

public class Comercial extends Empleado {
    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public boolean plus() {
        if (getEdad() > 30 && getComision() > 200) {
            setSalario(getSalario() + PLUS);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Comisión: " + comision;
    }
}