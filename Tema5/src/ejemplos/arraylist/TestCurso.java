package ejemplos.arraylist;

public class TestCurso {

	public static void main(String[] args) {
		
		Curso daw1 = new Curso("1DAW");
		daw1.addAlumno(new Alumno("Manuel", "García", 22, "Vera"));
		daw1.addAlumno(new Alumno("Isabel", "Gómez", 20, "Cuevas"));
		daw1.pintarCurso();
		
		Alumno buscado = daw1.buscar(new Alumno("Manuel", "García", 22, "Vera"));
		System.out.println(buscado);
		
		System.out.println("----------------------------------");
		daw1.eliminar(buscado);
		daw1.pintarCurso();
		

	}

}
