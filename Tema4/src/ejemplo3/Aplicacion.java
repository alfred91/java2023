package ejemplo3;

public class Aplicacion {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("Manuel", "Díaz Sánchez", 40, "manudiaz@gmail.com", 2100, 0.22, 0.06, "Recursos Humanos");
		Empleado emp2 = new Empleado("Elena", "Gómez Becerril", 35, "elenuchi@gmail.com", 2250, 0.25, 0.065, "Recursos Humanos");
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println(emp1.getNombre() + " gana " + emp1.mostrarSalarioActual());
		System.out.println(emp2.getNombre() + " gana " + emp2.mostrarSalarioActual());

	}

}
