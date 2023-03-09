package pooCursoJava;

public class PruebasStatic {

	public static void main(String[] args) {
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Morty");
		Empleados trabajador4=new Empleados("Julian");
		
		trabajador1.cambiarSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()+"\n"+
		trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		Empleados trabajador5=new Empleados("Julian");
		System.out.println(Empleados.dameIdSiguiente());

	
}}

class Empleados{
	
	public Empleados (String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		
		id=idSiguiente;
		
		idSiguiente++;
	}
	

	public void cambiarSeccion(String seccion) {	//SETTER
		this.seccion = seccion;
	}
	

	public String devuelveDatos() {		//GETTER
		return "El nombre es "+nombre+" y la seccion es "+seccion+ " y el id: "+id;
	}
	
	
	public static String dameIdSiguiente(){
		return "El id siguiente es: "+idSiguiente;
	}
	
	
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
}




