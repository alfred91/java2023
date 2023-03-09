package ejemplos.arraylist;
import java.util.ArrayList;

public class Receta {
    private String nombre;
    private ArrayList<String> ingredientes;
    private ArrayList<String> pasos;

    public Receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasos) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public void addIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void addPaso(String paso) {
        pasos.add(paso);
    }

    public void imprimirReceta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ingredientes:");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
        System.out.println("Pasos:");
        for (int i = 0; i < pasos.size(); i++) {
            System.out.println((i+1) + ". " + pasos.get(i));
        }
    }
}