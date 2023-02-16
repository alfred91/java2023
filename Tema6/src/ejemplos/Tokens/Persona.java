package ejemplos.Tokens;

public class Persona {
	
private String nombre;
private String apellidos;
private String profesion;
private String localidad;
private int edad;

public Persona(String nombre, String apellidos, String profesion, String localidad, int edad) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.profesion = profesion;
	this.localidad = localidad;
	this.edad = edad;
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
 * @return the apellidos
 */
public String getApellidos() {
	return apellidos;
}

/**
 * @param apellidos the apellidos to set
 */
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

/**
 * @return the profesion
 */
public String getProfesion() {
	return profesion;
}

/**
 * @param profesion the profesion to set
 */
public void setProfesion(String profesion) {
	this.profesion = profesion;
}

/**
 * @return the localidad
 */
public String getLocalidad() {
	return localidad;
}

/**
 * @param localidad the localidad to set
 */
public void setLocalidad(String localidad) {
	this.localidad = localidad;
}

/**
 * @return the edad
 */
public int getEdad() {
	return edad;
}

/**
 * @param edad the edad to set
 */
public void setEdad(int edad) {
	this.edad = edad;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Persona [nombre=");
	builder.append(nombre);
	builder.append(", apellidos=");
	builder.append(apellidos);
	builder.append(", profesion=");
	builder.append(profesion);
	builder.append(", localidad=");
	builder.append(localidad);
	builder.append(", edad=");
	builder.append(edad);
	builder.append("]");
	return builder.toString();
	}
}