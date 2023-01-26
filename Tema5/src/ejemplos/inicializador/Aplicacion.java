package ejemplos.inicializador;

public class Aplicacion {

	public static void main(String[] args) {
		BBDD miConsulta = new BBDD("Select * from empleados where departamento=RRHH;");
		BBDD miConsulta2 = new BBDD("Select * from empleados where salario > 30000;");
		System.out.println(miConsulta);
		System.out.println(miConsulta2);

	}

}
