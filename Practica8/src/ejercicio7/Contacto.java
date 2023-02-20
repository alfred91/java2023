package ejercicio7;

import java.util.Objects;

public class Contacto {
    
    private String nombre;
    private int telefono;
 
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
     
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public int getTelefono() {
        return telefono;
    }
 
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
 

    @Override
	public int hashCode() {
		return Objects.hash(nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
    }
     
     
}