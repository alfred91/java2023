package ejemploTieneUnArray;

public class Empresa {

	private String nombre;
	private Empleado[] empleados;
	
	private static int total = 0;
	
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		this.empleados = new Empleado[500];
	}
	
	public void contratar(Empleado emple) {
		
		this.empleados[Empresa.total] = emple;
		Empresa.total++;
	}
	
	
	public void pintar() {
		System.out.println(this.nombre);
		for(int i=0; i<this.empleados.length-1; i++) {
			System.out.println(this.empleados[i]);
		}
	}
	
}
