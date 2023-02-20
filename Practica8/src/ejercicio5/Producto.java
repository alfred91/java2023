package ejercicio5;

public class Producto {
	
    private int id;
    private String descripcion;
    private double precioUnitario;
    private int unidadesDisponibles;
    private int stockMaximo;
    private double descuento;

    // Constructor por defecto
    public Producto() {
        this.id = 0;
        this.descripcion = "";
        this.precioUnitario = 0.0;
        this.unidadesDisponibles = 0;
        this.stockMaximo = 0;
        this.descuento = 0.0;
    }

    // Constructor con parámetros
    public Producto(int id, String descripcion, double precioUnitario, int unidadesDisponibles, int stockMaximo, double descuento) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidadesDisponibles = unidadesDisponibles;
        this.stockMaximo = stockMaximo;
        this.descuento = descuento;
    }

    // Métodos setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public double getDescuento() {
        return descuento;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Producto [id=" + id + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
                + ", unidadesDisponibles=" + unidadesDisponibles + ", stockMaximo=" + stockMaximo + ", descuento="
                + descuento + "]";
    }

    // Método equals()
    @Override
    public boolean equals(Object otro) {
        if (otro instanceof Producto) {
            Producto producto = (Producto) otro;
            return this.id == producto.id;
        }
        return false;
    }

    // Método vender
    public boolean vender(int cantidad) {
        if (cantidad < 0 || cantidad > unidadesDisponibles) {
            return false;
        }
        unidadesDisponibles -= cantidad;
        return true;
    }

    // Método reponer
    public int reponer() {
        int cantidadReposicion = stockMaximo - unidadesDisponibles;
        unidadesDisponibles = stockMaximo;
        return cantidadReposicion;
    }
}