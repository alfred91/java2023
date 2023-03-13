package ejercicio5;

import java.util.ArrayList;

class Publicacion<Autor> {
    protected String isbn;
    protected String titulo;
    protected int anio;
    protected int paginas;
    protected ArrayList<Autor> autores;

    public Publicacion(String isbn, String titulo, int anio, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.paginas = paginas;
        this.autores = new ArrayList<Autor>();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void addAutor(String nombre, String apellidos) {
        Autor autor = new Autor(nombre, apellidos);
        autores.add(autor);
    }

    public void deleteAutor(String nombre, String apellidos) {
        Autor autor = new Autor(nombre, apellidos);
        autores.remove(autor);
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) o;
        return this.getTitulo().equals(other.getTitulo());
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]");
		return builder.toString();
	}
}

