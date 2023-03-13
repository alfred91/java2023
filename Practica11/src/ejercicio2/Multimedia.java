package ejercicio2;

public class Multimedia {
    private static long autoincremento = 1;
    private long codigo;
    private String titulo;
    private boolean plus;
    private double precio;
    private Genero genero;

    public Multimedia() {
        this.codigo = autoincremento++;
    }

    public Multimedia(String titulo, double precio, boolean plus) {
        this();
        this.titulo = titulo;
        this.precio = precio;
        this.plus = plus;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPlus() {
        return plus;
    }

    public void setPlus(boolean plus) {
        this.plus = plus;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Multimedia)) {
            return false;
        }
        Multimedia other = (Multimedia) obj;
        return codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", plus=" + plus +
                ", precio=" + precio +
                ", genero=" + genero +
                '}';
    }
}