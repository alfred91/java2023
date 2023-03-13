package ejercicio2;

import java.util.ArrayList;

public class PrimeVideo {
    protected ArrayList<Multimedia> catalogo;
    protected ArrayList<Cliente> suscriptores;
    protected double ganancias;

    public PrimeVideo() {
        this.catalogo = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancias = 0.0;
    }

    public void addSuscriptor(Cliente c) {
        if (!suscriptores.contains(c)) {
            suscriptores.add(c);
        }
    }

    public void addMultimedia(Multimedia m) {
        if (!catalogo.contains(m)) {
            catalogo.add(m);
        }
    }

    public void ver(Multimedia m, Cliente c) {
        if (c.esPro() || !m.isPlus()) {
            ganancias += m.getPrecio();
        }
    }

    public double getGanancias() {
        double suscriptoresGanancias = 0.0;
        for (Cliente c : suscriptores) {
            suscriptoresGanancias += c.getPrecioMensual() * 12;
        }
        return ganancias + suscriptoresGanancias;
    }
}
