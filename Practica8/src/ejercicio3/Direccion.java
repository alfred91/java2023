package ejercicio3;

import java.util.Objects;

public class Direccion {
	
	private String tipoVia,nombreVia,poblacion,provincia,pais;
	private int numero,cp;
	private double latitud,longitud;
	public Direccion(String tipoVia, String nombreVia, String poblacion, String provincia, String pais, int numero, int cp,
			double latitud, double longitud) {
		
	//Parametrizado
		super();
		this.tipoVia = tipoVia;
		this.nombreVia=nombreVia;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.pais = pais;
		this.numero = numero;
		this.cp = cp;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	//Copia
	public Direccion (Direccion otraDireccion) {
		this.tipoVia=otraDireccion.tipoVia;
		this.nombreVia=otraDireccion.nombreVia;
		this.poblacion = otraDireccion.poblacion;
		this.provincia = otraDireccion.provincia;
		this.pais = otraDireccion.pais;
		this.numero = otraDireccion.numero;
		this.cp = otraDireccion.cp;
		this.latitud = otraDireccion.latitud;
		this.longitud = otraDireccion.longitud;
	}
	
	//Por defecto	
public Direccion() {
	this("","","","","", 0,0,0,0);
	
	
	}

public String getTipoVia() {
	return tipoVia;
}

public String getNombreVia() {
	return nombreVia;
}

public String getPoblacion() {
	return poblacion;
}

public String getProvincia() {
	return provincia;
}

public String getPais() {
	return pais;
}

public int getNumero() {
	return numero;
}

public int getCp() {
	return cp;
}

public double getLatitud() {
	return latitud;
}

public double getLongitud() {
	return longitud;
}


public void setTipoVia(String tipoVia) throws IllegalArgumentException {
	if (tipoVia == null || tipoVia.trim().isEmpty()) {
        throw new IllegalArgumentException("El tipo de via no puede ser nulo ni estar vacío");
        }
	this.tipoVia = tipoVia;
}

public void setNombreVia(String nombreVia) throws IllegalArgumentException {
	if (nombreVia == null || nombreVia.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre de la via no puede ser nulo ni estar vacío");
        }
	this.nombreVia = nombreVia;
}

public void setPoblacion(String poblacion) throws IllegalArgumentException {
	if (poblacion == null || poblacion.trim().isEmpty()) {
        throw new IllegalArgumentException("La poblacion no puede ser nula ni estar vacío");
        }
	this.poblacion = poblacion;
}

public void setProvincia(String provincia) throws IllegalArgumentException {
	if (provincia == null || provincia.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede ser nulo ni estar vacío");
        }
	this.provincia = provincia;
}

@Override
public String toString() {
	
	StringBuilder builder = new StringBuilder();
	builder.append("Direccion [tipoVia=");
	builder.append(tipoVia);
	builder.append(", nombreVia=");
	builder.append(nombreVia);
	builder.append(", poblacion=");
	builder.append(poblacion);
	builder.append(", provincia=");
	builder.append(provincia);
	builder.append(", pais=");
	builder.append(pais);
	builder.append(", numero=");
	builder.append(numero);
	builder.append(", cp=");
	builder.append(cp);
	builder.append(", latitud=");
	builder.append(latitud);
	builder.append(", longitud=");
	builder.append(longitud);
	builder.append("]");
	return builder.toString();
}




public void setPais(String pais) throws IllegalArgumentException {
	if (pais == null || pais.trim().isEmpty()) {
        throw new IllegalArgumentException("El Pais no puede ser nulo ni estar vacío");
        }
	this.pais = pais;
}

public void setNumero(int numero) throws IllegalArgumentException {
	if (numero ==0) {
        throw new IllegalArgumentException("El Numero no puede ser 0");
        }
	this.numero = numero;
}

public void setCp(int cp) throws IllegalArgumentException {
	if (cp == 0 || cp>99999 ) {
        throw new IllegalArgumentException("El Codigo Postal debe de ser correcto");
        }
	this.cp = cp;
}

public void setLatitud(double latitud) throws IllegalArgumentException {
	if (latitud <-180 || latitud >180 ) {
        throw new IllegalArgumentException("La latitud debe de estar comprendida entre -180 y +180");
        }
	this.latitud = latitud;
}

public void setLongitud(double longitud) throws IllegalArgumentException {
	if (longitud <-90 || longitud> 90 ) {
        throw new IllegalArgumentException("La longitud debe de estar comprendida entre -90 y +90");
        }
	this.longitud = longitud;
	}

@Override
public int hashCode() {
	return Objects.hash(latitud, longitud);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Direccion other = (Direccion) obj;
	return Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
			&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
}

public double distanciaKM(Direccion otra) {
	
	double radio=6371;
	double lat1=Math.toRadians(this.latitud);
	double lat2=Math.toDegrees(otra.latitud);
	double long1=Math.toRadians(this.longitud);
	double long2=Math.toRadians(otra.longitud);
		double dlat=lat2-lat1;
		double dlong=long2-long1;
			double a = Math.sin(dlat/2)*Math.sin(dlat/2)+Math.cos(lat1)*Math.cos(lat2)*Math.sin(dlong/2)*Math.sin(dlong/2);
				double c=2*Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
				double distancia = radio*c;
	
			 return distancia;
	
}
}