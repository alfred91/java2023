package empleado;

public class Aplicacion {

	public static void main(String[] args) {
Empleado e1 =new Empleado("Manolo","CabezaBolo",33,"holasoyeltomate@gmail.com",2000,0.22,0.06,0, "RRHH");

System.out.println("Salario : "+e1.getSalarioMensualNeto());
System.out.println(e1);

	}

	@Override
	public String toString() {
		return "Aplicacion [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}