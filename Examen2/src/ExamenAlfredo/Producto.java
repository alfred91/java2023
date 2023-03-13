package ExamenAlfredo;

public class Producto implements Descontable {
		
	protected int codigo;
	protected static int codigoAutoincremento=1;
	protected String nombre,descripcion;
	public double precio;
	protected int unidadesStock;
	
	 public Producto(String nombre, String descripcion, double precio, int unidadesStock) {
		 
	        this.codigo = codigoAutoincremento++;
	        this.nombre = nombre;
	        this.descripcion = descripcion;
	        this.precio = precio;
	        this.unidadesStock = unidadesStock;
	    }

	    public Producto(Producto otro) {
	        this.codigo = otro.codigo;
	        this.nombre = otro.nombre;
	        this.descripcion = otro.descripcion;
	        this.precio = otro.precio;
	        this.unidadesStock = otro.unidadesStock;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public int getUnidadesStock() {
	        return unidadesStock;
	    }

	    public void setUnidadesStock(int unidadesStock) {
	        this.unidadesStock = unidadesStock;
	    }

	    @Override
	    public double descuento() {
	        return descuento() * precio;
	    }

	    @Override
	    public String toString() {
	        return "Producto{" +
	                "codigo=" + codigo +
	                ", nombre='" + nombre + '\'' +
	                ", descripcion='" + descripcion + '\'' +
	                ", precio=" + precio +
	                ", unidadesStock=" + unidadesStock +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Producto producto = (Producto) o;
	        return codigo == producto.codigo;
	    }
	}