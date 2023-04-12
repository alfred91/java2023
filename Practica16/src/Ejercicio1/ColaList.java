package Ejercicio1;
import java.util.ArrayList;

public class ColaList<E> {
    private ArrayList<E> lista;

    public ColaList() {
        lista = new ArrayList<E>();
    }

    public boolean meter(E e) {
        return lista.add(e);
    }

    public E poll() {
        if (lista.isEmpty()) {
            return null;
        } else {
            return lista.remove(0);
        }
    }

    public E peek() {
        if (lista.isEmpty()) {
            return null;
        } else {
            return lista.get(0);
        }
    }
}