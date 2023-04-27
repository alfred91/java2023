package EjemploStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploGrouping {

	public static void main(String[] args) {
		List<Empleado> empleados = Arrays.asList(
				new Empleado("Pepe", 30000, "Ventas"),
				new Empleado("Juan", 31000, "Ventas"),				
				new Empleado("Javier", 35000, "Compras"),
				new Empleado("Manuela", 34000, "Ejecutivo"),
				new Empleado("Antonio", 30000, "Compras"),
				new Empleado("María", 30000, "Compras")
				);
		
		
		Map<String, List<Empleado>> empleadosPorDepartamento = empleados.stream()
			.collect(Collectors.groupingBy(Empleado::getDepartamento));
		
		System.out.println(empleadosPorDepartamento);
		
		
		Map<String, Long> porDepartamentoCantidad = 
				empleados
					.stream()
						.collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.counting()));
		
		System.out.println("NÚMERO DE EMPLEADOS POR DEPARTAMENTO");
		porDepartamentoCantidad.forEach((k, v) -> System.out.println(k + " (" + v + " empleados)"));
		System.out.println();
		
		
		
		
		Map<String, List<Empleado>> porDepartamento = 
				empleados
					.stream()
					.collect(Collectors.groupingBy(Empleado::getDepartamento));
		
		System.out.println("EMPLEADOS AGRUPADOS POR DEPARTAMENTO");
		porDepartamento.forEach((k, v) -> {
			String strEmpleados = v.stream().map(e -> e.getNombre()).collect(Collectors.joining(", "));
			System.out.printf("Departamento: %s | Empleados: %s %n", k, strEmpleados );
		});
		System.out.println("");
		
		
		
		
	}

}