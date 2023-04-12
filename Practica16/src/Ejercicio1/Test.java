package Ejercicio1;

public class Test {
	
    public static void main(String[] args) {
        ColaList<Proceso> cola = new ColaList<Proceso>();
        cola.meter(new Proceso(1, "Proceso 1", 10, 100, 1));
        cola.meter(new Proceso(2, "Proceso 2", 20, 200, 2));
        cola.meter(new Proceso(3, "Proceso 3", 30, 300, 3));
        System.out.println(cola.peek()); // Imprime: Proceso [pid=1, nombre=Proceso 1, cpu=10, ram=100, prioridad=1]
        System.out.println(cola.poll()); // Imprime: Proceso [pid=1, nombre=Proceso 1, cpu=10, ram=100, prioridad=1]
        System.out.println(cola.poll()); // Imprime: Proceso [pid=2, nombre=Proceso 2, cpu=20, ram=200, prioridad=2]
        System.out.println(cola.poll()); // Imprime: Proceso [pid=3, nombre=Proceso 3, cpu=30, ram=300, prioridad=3]
        System.out.println(cola.poll()); // Imprime: null
    }
}