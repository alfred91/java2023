package ExamenAlfredo;

import ExamenAlfredo.Ropa.Talla;

public class Ropa extends Producto {
    enum Talla {
        XS, S, M, L, XL, XXL
    }

    private Talla talla;
    private String color;

    public Ropa(String nombre, String descripcion, double precio, int unidadesStock, Talla talla, String color) {
        super(nombre, descripcion, precio, unidadesStock);
        this.talla = talla;
        this.color = color;
    }

    public Ropa(Ropa ropa) {
        super(ropa);
        this.talla = ropa.talla;
        this.color = ropa.color;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
	
    @Override
    public double descuento() {
        double descuento;
        if (talla == Talla.XS || talla == Talla.XXL) {
            descuento = precio*0.05;
        } else {
            descuento = precio*0.03;
        }
        return descuento;
    }
}