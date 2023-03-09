package ejemplos.arraylist;
import java.util.ArrayList;

public class TestReceta {
    public static void main(String[] args) {
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Leche");
        ingredientes.add("Huevos");
        ingredientes.add("Azucar");
        ingredientes.add("Vainilla");
        ArrayList<String> pasos = new ArrayList<String>();
        pasos.add("Batir los huevos con el azucar");
        pasos.add("Agregar la leche y la vainilla");
        pasos.add("Cocinar en sarten hasta que se dore");
        Receta receta = new Receta("Panqueques", ingredientes, pasos);
        receta.imprimirReceta();
    }
}