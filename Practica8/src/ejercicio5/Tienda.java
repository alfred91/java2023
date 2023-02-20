package ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {
    private ArrayList<Producto> productos;
    private double ventas;
    
    public Tienda() {
        this.productos = new ArrayList<>();
        this.ventas = 0;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public double getVentas() {
        return ventas;
    }
}