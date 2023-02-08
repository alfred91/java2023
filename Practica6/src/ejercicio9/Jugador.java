package ejercicio9;

public class Jugador {
	
String nombre,clase;
private int dañoArma;
int nivel=1;
double salud=200;

public Jugador(String nombre, String clase, int dañoArma, int nivel, int salud) {
	super();
	this.nombre = nombre;
	this.clase = clase;
	this.dañoArma = dañoArma;
	this.nivel=nivel;
	this.salud=salud;
}	

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getClase() {
	return clase;
}
public void setClase(String clase) {
	this.clase = clase;
}
public int getDañoArma() {
	return dañoArma;
}
public void setDañoArma(int dañoArma) {
	this.dañoArma= dañoArma;
}
public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
}
public double getSalud() {
	return salud;
}
public void setSalud(double salud) {
	this.salud = salud;
}
public int subirNivel() {
	this.nivel=nivel+1;
	this.salud=salud+Math.pow(2.5, nivel);
	return nivel;
	}
public double recibirDaño(int daño) {
	salud=salud-daño;
	return salud;
	}

public void golpear(Enemigo enemigo) { 
    enemigo.recibirDaño(this.getDañoArma()); 
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Jugador [nombre=");
	builder.append(nombre);
	builder.append(", clase=");
	builder.append(clase);
	builder.append(", nivel=");
	builder.append(nivel);
	builder.append(", salud=");
	builder.append(salud);
	builder.append(", getNombre()=");
	builder.append(getNombre());
	builder.append(", getClase()=");
	builder.append(getClase());
	builder.append(", getDañoArma()=");
	builder.append(getDañoArma());
	builder.append(", getNivel()=");
	builder.append(getNivel());
	builder.append(", getSalud()=");
	builder.append(getSalud());
	builder.append(", subirNivel()=");
	builder.append(subirNivel());
	builder.append(", getClass()=");
	builder.append(getClass());
	builder.append(", hashCode()=");
	builder.append(hashCode());
	builder.append(", toString()=");
	builder.append(super.toString());
	builder.append("]");
	return builder.toString();
}

}