package pooCursoJava;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Morty");
		
		trabajador1.cambiarSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());

}}

/** class Empleados{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
	
	public Empleados (String nom) {
		
		nombre=nom;
		seccion="Administracion";
		id=idSiguiente;
		idSiguiente++;
	}
	

	public void cambiarSeccion(String seccion) {
		this.seccion = seccion;
	}
	

	public String devuelveDatos() {
		return "El nombre es "+nombre+" y la seccion es "+seccion+ " y el id: "+id;
	}
}




































