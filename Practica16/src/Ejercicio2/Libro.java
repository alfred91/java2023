package Ejercicio2;

class Libro extends Publicacion implements Prestable {
	
	protected boolean prestado;
    /**
	 * @param isbn
	 * @param ano
	 * @param paginas
	 * @param titulo
	 * @param prestado
	 */
	
	Libro(int isbn, int ano, int paginas, String titulo, boolean prestado) {
		super(isbn, ano, paginas, titulo);
		this.prestado = true;
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