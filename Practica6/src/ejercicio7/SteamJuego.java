package ejercicio7;

public class SteamJuego {
	
String nombre,descripcionCorta,imagen,freeToPlay;
int mediaJugadoresDiarios,diasDeSalida,precio,puestoMasVendidos;

public SteamJuego(String nombre, String descripcionCorta,String imagen, int mediaJugadoresDiarios, int diasDeSalida,
		int precio, String freeToPlay, int puestoMasVendidos) {
	super();
	this.nombre = nombre;
	this.descripcionCorta = descripcionCorta;
	this.imagen = imagen;
	this.mediaJugadoresDiarios = mediaJugadoresDiarios;
	this.diasDeSalida = diasDeSalida;
	this.precio = precio;
	this.puestoMasVendidos = puestoMasVendidos;
	this.freeToPlay=freeToPlay;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcionCorta() {
	return descripcionCorta;
}
public void setDescripcionCorta(String descripcionCorta) {
	this.descripcionCorta = descripcionCorta;
}
public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
public int getMediaJugadoresDiarios() {
	for (int i=0;i<=this.mediaJugadoresDiarios;i++) {
				}
	return mediaJugadoresDiarios;
}
public void setMediaJugadoresDiarios(int mediaJugadoresDiarios) {
	this.mediaJugadoresDiarios = mediaJugadoresDiarios;
}
public int getDiasDeSalida() {
	return diasDeSalida;
}
public void setDiasDeSalida(int diasDeSalida) {
	this.diasDeSalida = diasDeSalida;
}
public String freeToPlay() {
	if (this.precio==0) { return "Free to play!";} else {return "€";} 
}
public void freeToPlay(String freeToPlay) {
	this.freeToPlay = freeToPlay;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public int getPuestoMasVendidos() {
	return puestoMasVendidos;
}
public void setPuestoMasVendidos(int puestoMasVendidos) {
	this.puestoMasVendidos = puestoMasVendidos;
}
public int jugadoresDia(int jugadoresHoy) {
	return ((this.jugadoresDia(jugadoresHoy)*this.diasDeSalida)+this.jugadoresDia(jugadoresHoy)/(this.diasDeSalida));
	}
}