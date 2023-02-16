package ejemplos.Enumerado;

public class JugadorNBA {
	
	private String nombre;
	private double altura,peso;
	private String posicion;
	private EquipoNBA equipo;

	public JugadorNBA(String nombre, double altura, double peso, String posicion, EquipoNBA equipo) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.equipo = equipo;
	}

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
 * @return the altura
 */
public double getAltura() {
	return altura;
}
/**
 * @param altura the altura to set
 */
public void setAltura(double altura) {
	this.altura = altura;
}
/**
 * @return the peso
 */
public double getPeso() {
	return peso;
}
/**
 * @param peso the peso to set
 */
public void setPeso(double peso) {
	this.peso = peso;
}
/**
 * @return the posicion
 */
public String getPosicion() {
	return posicion;
}
/**
 * @param posicion the posicion to set
 */
public void setPosicion(String posicion) {
	this.posicion = posicion;
}
/**
 * @return the equipo
 */
public EquipoNBA getEquipo() {
	return equipo;
}
/**
 * @param equipo the equipo to set
 */
public void setEquipo(EquipoNBA equipo) {
	this.equipo = equipo;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("JugadorNBA [nombre=");
	builder.append(nombre);
	builder.append(", altura=");
	builder.append(altura);
	builder.append(", peso=");
	builder.append(peso);
	builder.append(", posicion=");
	builder.append(posicion);
	builder.append(", equipo=");
	builder.append(equipo.getNombreCompleto());
	builder.append("]");
	return builder.toString();
}
}
