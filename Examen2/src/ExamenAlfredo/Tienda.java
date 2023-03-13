package ExamenAlfredo;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> inventario;
    private ArrayList<Compra> compras;

    public Tienda() {
        this.inventario = new ArrayList<Producto>();
        this.compras = new ArrayList<Compra>();
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void mostrarInventario() {
        for (Producto p : inventario) {
            System.out.println(p.toString());
        }
    }

    public void mostrarCompras() {
        double total = 0;
        for (Compra c : compras) {
            System.out.println(c.toString());
            total += c.getPrecioTotal();
        }
        System.out.println("Total de todas las compras: " + total+" €");
    }

    public void addProducto(Producto nombre) {
        inventario.add(nombre);
    }

    public void delProducto(Producto p) {
        inventario.remove(p);
    }

    public void addCompra(Compra c) {
        boolean tieneStockSuficiente = true;
        for (Producto p : getUnidadesStock()) {
            Producto pInventario = null;
            for (Producto pInv : inventario) {
                if (pInv.getNombre().equals(p.getNombre())) {
                    pInventario = pInv;
                    break;
                }
            }
            if (pInventario == null || pInventario.getUnidadesStock() < p.getUnidadesStock()) {
                tieneStockSuficiente = false;
                break;
            }
        }
        if (tieneStockSuficiente) {
            compras.add(c);
            for (Producto p : getUnidadesStock()) {
                for (Producto pInv : inventario) {
                    if (pInv.getNombre().equals(p.getNombre())) {
                        pInv.setUnidadesStock(pInv.getUnidadesStock() - p.getUnidadesStock());
                        break;
                    }
                }
            }
        } else {
            throw new RuntimeException("No se puede realizar la compra. No hay stock suficiente.");
        }
    }

    private Producto[] getUnidadesStock() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Producto> buscarProducto(String nombre) {
        ArrayList<Producto> productosEncontrados = new ArrayList<Producto>();
        for (Producto p : inventario) {
            if (p.getNombre().equals(nombre)) {
                productosEncontrados.add(p);
            }
        }
        return productosEncontrados;
    }

	public void addProducto(Compra compra) {
		// TODO Auto-generated method stub
		
	}

	public void addProducto(String Producto) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Producto> buscarProducto(int idProducto) {
		// TODO Auto-generated method stub
		return null;
	}
}