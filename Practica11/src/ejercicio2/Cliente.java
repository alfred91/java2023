package ejercicio2;

import java.util.ArrayList;

enum Genero {
    Thriller, Accion, Aventuras, Romántica, Terror, Infantil, Scifi, Drama, Comedia, Oriental
}

abstract class Cliente {
    private String dni;
    private String nombre;
    private String email;
    private double precioMensual;

    public Cliente(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    public Cliente(String dni, String nombre, String email, double precioMensual) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.precioMensual = precioMensual;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public abstract boolean esPro();

    public abstract double getPrecioTotal();

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", precioMensual=" + precioMensual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return dni.equals(cliente.dni);
    }
}
