package Ejercicio8;

import java.util.*;

public class CentroEducativo {
	
    private TreeSet<Expediente> expedientes;
    private String nombreCentro;
    private String direccion;
    private String localidad;
    private String telefono;
    private String email;

    public CentroEducativo(String nombreCentro, String direccion, String localidad, String telefono, String email) {
       
    	this.nombreCentro = nombreCentro;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
        expedientes = new TreeSet<>();
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addExpediente(Expediente expediente) {
        expedientes.add(expediente);
    }

    public Expediente buscarExpediente(String dni) {
        for (Expediente expediente : expedientes) {
            if (expediente.getEstudiante().getDni().equals(dni)) {
                return expediente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombreCentro='" + nombreCentro + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", expedientes=" + expedientes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
    	
        if (this == o) return true;
        if (!(o instanceof CentroEducativo)) return false;
        CentroEducativo that = (CentroEducativo) o;
        	      return Objects.equals(nombreCentro, that.nombreCentro);
        	    }
        	}
