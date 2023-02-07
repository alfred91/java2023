package ejemplos.arraylist;

import java.util.ArrayList;

public class Curso {

	private String nombre;
	private ArrayList<Alumno> alumnos;
	
	public Curso(String nombre) {
		super();
		this.nombre = nombre;
		
		//Crear el ArrayList
		this.alumnos = new ArrayList<>(35);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nombre=");
		builder.append(nombre);
		builder.append(", alumnos=");
		builder.append(alumnos);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * Añadir un alumno al curso
	 */
	public void addAlumno(Alumno al) {
		alumnos.add(al);
	}
	

	/**
	 * @return the alumnos
	 */
	private ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	/****************************************************************/
	
	/**
	 * Devuelve el alumno en la posición i
	 * @param i
	 * @return
	 */
	private Alumno getAlumno(int i) {
		if (i < alumnos.size() && i >= 0)
			return alumnos.get(i);
		
		return null;
	}
	
	public void pintarCurso() {
		System.out.println("Nombre: " + this.nombre);
		
		for(Alumno al : this.alumnos) {
			System.out.println(al);
		}
	}
	
	/**
	 * Si el Alumno 'al' pasado como parámetro está dentro del ArrayList, lo devuelve, sino null
	 * @param al
	 * @return
	 */
	public Alumno buscar(Alumno al) {
		int posicion = this.alumnos.indexOf(al);
		
		if (posicion >= 0) {
			return this.alumnos.get(posicion);
		} else {
			return null;
		}
	}
	
	public boolean eliminar(Alumno al) {
		int posicion = this.alumnos.indexOf(al);
		
		if (posicion >= 0) {
			this.alumnos.remove(posicion);
			return true;
		} else {
			return false;
		}
	}

	
	
	
	
}
