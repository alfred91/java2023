package Ejercicio8;

import java.util.*;

public class Estudiante {
    private String dni;
    private String nombre;
    private String apellidos;
    private String fnacimiento;
    private String direccion;
    private String localidad;
    private String email;
    private String telefono;
    
    public Estudiante(String dni, String nombre, String apellidos, String fnacimiento, String direccion,
                      String localidad, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fnacimiento = fnacimiento;
        this.direccion = direccion;
        this.localidad = localidad;
        this.email = email;
        this.telefono = telefono;
    }
    
    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getFnacimiento() {
        return fnacimiento;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public String getLocalidad() {
        return localidad;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString() {
        return "Estudiante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fnacimiento='" + fnacimiento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
    
    public boolean equals(String dni) {
        return this.dni.equals(dni);
    }
}
