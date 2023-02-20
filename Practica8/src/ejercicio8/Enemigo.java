package ejercicio8;

public class Enemigo {
    private String nombre;
    private String clase;
    private int salud;
    
    public Enemigo(String nombre, String clase, int salud) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = salud;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getClase() {
        return clase;
    }
    
    public int getSalud() {
        return salud;
    }
    
    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    public void quitarVida(int cantidad) {
        salud -= cantidad;
    }
    
    public void golpear(Jugador jugador) {
        jugador.setSalud(jugador.getSalud() - 30);
    }
    
    @Override
    public String toString() {
        return nombre + " (" + clase + ", salud: " + salud + ")";
    }
}