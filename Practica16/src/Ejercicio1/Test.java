package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
    public static void main(String[] args) {
    	
        List<Proceso> procesos = new ArrayList<>();
        procesos.add(new Proceso(1, "Proceso1", 50, 100, 1));
        procesos.add(new Proceso(2, "Proceso2", 30, 200, 2));
        procesos.add(new Proceso(3, "Proceso3", 20, 150, 3));

        ColaList<Proceso> cola = new ColaList<>();
        for (Proceso proceso : procesos) {
            cola.meter(proceso);
        }

        Proceso proceso1 = cola.poll();
        System.out.println("Proceso eliminado de la cola: " + proceso1.getNombre());

        Proceso proceso2 = cola.peek();
        System.out.println("Primer proceso en la cola: " + proceso2.getNombre());
        
        Proceso proceso3 = cola.peek();
        System.out.println("Tercer proceso en la cola: " + proceso3.getNombre());
    }
}
