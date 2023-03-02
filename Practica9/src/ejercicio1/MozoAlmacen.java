package ejercicio1;

public class MozoAlmacen extends Operario {
    private static int peligrosidad;

    public MozoAlmacen(String nombre, int edad, double salario, boolean haceHorasExtra, int peligrosidad) {
        super(nombre, edad, salario, haceHorasExtra);
        this.peligrosidad = peligrosidad;
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    @Override
    public double plus() {
    	
        double plus = 0;
        
        if (super.haceHorasExtra) {
            plus += super.PLUS * 2;
        }
        if (peligrosidad == 3 || (peligrosidad == 2 && super.edad > 30) || (peligrosidad == 1 && super.edad < 30)) {
            super.salario += super.PLUS + plus;
         }
		return plus;
       
    }

    @Override
    public String toString() {
        return super.toString() + " PELIGROSIDAD: " + peligrosidad;
    }
}