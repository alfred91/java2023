package ejercicio1;

public class Operario extends Empleado {
    protected boolean haceHorasExtra;

    public Operario(String nombre, int edad, double salario, boolean haceHorasExtra) {
        super(nombre, edad, salario);
        this.haceHorasExtra = haceHorasExtra;
    }

    public boolean isHaceHorasExtra() {
        return haceHorasExtra;
    }

    public void setHaceHorasExtra(boolean haceHorasExtra) {
        this.haceHorasExtra = haceHorasExtra;
    }

    @Override
    public double plus() {
        return haceHorasExtra ? PLUS : 0;
    }

    @Override
    public String toString() {
        return "Operario [haceHorasExtra=" + haceHorasExtra + ", " + super.toString() + "]";
    }
}
