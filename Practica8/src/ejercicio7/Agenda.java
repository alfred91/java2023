package ejercicio7;
import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Contacto> contactos;
    private final int capacidad;
    
    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.contactos = new ArrayList<>();
    }
    
    public void añadirContacto(Contacto contacto) {
        if (this.contactos.size() < this.capacidad) {
            this.contactos.add(contacto);
            System.out.println("Contacto añadido correctamente.");
        } else {
            System.out.println("La agenda está llena, no se puede añadir más contactos.");
        }
    }
    
    public void listarContactos() {
        if (this.contactos.isEmpty()) {
            System.out.println("No hay contactos disponibles.");
        } else {
            for (Contacto contacto : this.contactos) {
                System.out.println(contacto);
            }
        }
    }
    
    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : this.contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(contacto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }
    
    public boolean existeContacto(String nombre) {
        for (Contacto contacto : this.contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public void eliminarContacto(String nombre) {
        for (Contacto contacto : this.contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                this.contactos.remove(contacto);
                System.out.println("Contacto eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún contacto con ese nombre.");
    }
    
    public int contactosDisponibles() {
        return this.capacidad - this.contactos.size();
    }
}