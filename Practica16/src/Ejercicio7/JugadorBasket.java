package Ejercicio7;

public class JugadorBasket {
	
    private String nombre;
    private String posicion;

    public JugadorBasket(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "JugadorBasket{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}