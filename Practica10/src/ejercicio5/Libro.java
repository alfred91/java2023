package ejercicio5;

class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String isbn, String titulo, int anio, int paginas) {
        super(isbn, titulo, anio);
        this.prestado = false;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void presta() {
        if (estaPrestado()) {
            System.out.println("Lo siento, el libro ya está prestado.");
        } else {
            this.prestado = true;
            System.out.println("El libro ha sido prestado.");
        }
    }

    public void devuelve() {
        if (estaPrestado()) {
            this.prestado = false;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("Este libro no estaba prestado.");
        }
    }

        public String toString() {
            return "Libro{" +
                    "prestado=" + prestado +
                    ", isbn='" + isbn + '\'' +
                    ", titulo='" + titulo + '\'' +
                    ", anio=" + ano +
                    ", paginas=" + paginas +
                    '}';
        }}