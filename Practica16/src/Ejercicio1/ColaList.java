package Ejercicio1;

import java.util.ArrayList;

public class ColaList<E> {

    private ArrayList<E> elementos;

    public ColaList() {
        elementos = new ArrayList<E>();
    }

    public boolean meter(E e) {
        return elementos.add(e);
    }

    public E poll() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(0);
    }

    public E peek() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.get(0);
    }
}