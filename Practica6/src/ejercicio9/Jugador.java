package ejercicio9;

public class Jugador {
	
String nombre,clase;
private int dañoArma;
private int nivel;
double salud;

public Jugador(String nombre, String clase, int dañoArma, int nivel, int salud) {
	super();
	this.nombre = nombre;
	this.clase = clase;
	this.dañoArma = dañoArma;
	this.nivel=1;
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
public void subirNivel() {
	this.nivel=nivel+1;
	this.salud=this.salud+Math.pow(2.5, this.nivel);
	System.out.println("Has subido de nivel!! Ahora eres nivel "+this.nivel+" . Tu salud se ha incrementado en: "+Math.pow(2.5, this.nivel)+" puntos");
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
	return "Jugador [Nombre=" + nombre + ", Clase =" + clase + ", Lvl=" + nivel + ", Salud=" + salud
			+ ", Dmg=" + dañoArma + "]";}
}