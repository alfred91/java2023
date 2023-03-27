package ejemplos.colaspilas;

public class TestProcesos {

	public static void main(String[] args) {
		
		Procesos<String> procesos = new Procesos<>();
		procesos.nuevo("Uno");
		procesos.nuevo("Dos");
		procesos.nuevo("Tres");
		System.out.println(procesos.consultar());
		procesos.nuevo("Cuatro");
		procesos.eliminar();
		procesos.eliminar();
		System.out.println(procesos);
		procesos.nuevo("Cinco");
		System.out.println(procesos.consultar());
		System.out.println(procesos);
		
		

	}

}
