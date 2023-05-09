package Ejercicio2;

	import java.util.*;

	public class Biblioteca {

	    protected ArrayList<Publicacion> publicaciones;
	    protected ArrayList<Usuario> usuarios;

	    public Biblioteca() {
	        this.publicaciones = new ArrayList<Publicacion>();
	        this.usuarios = new ArrayList<Usuario>();
	    }

	    public void addPublicacion(Publicacion p) {
	        this.publicaciones.add(p);
	    }

	    public void removePublicacion(Publicacion p) {
	        this.publicaciones.remove(p);
	    }

	    public void addUsuario(Usuario u) {
	        this.usuarios.add(u);
	    }

	    public void removeUsuario(Usuario u) {
	        this.usuarios.remove(u);
	    }

	    public Publicacion buscar(String titulo) {
	        Collections.sort(this.publicaciones);
	        int low = 0, high = this.publicaciones.size() - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int cmp = this.publicaciones.get(mid).getTitulo().compareTo(titulo);

	            if (cmp == 0) {
	                return this.publicaciones.get(mid);
	            } else if (cmp < 0) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return null;
	    }

	    public ArrayList<Publicacion> buscar(Autor autor) {
	        TreeSet<Publicacion> publicacionesAutor = new TreeSet<Publicacion>();

	        for (Publicacion p : this.publicaciones) {
	            TreeSet<Autor> autores = p.getAutores();
	            if (autores.contains(autor)) {
	                publicacionesAutor.add(p);
	            }
	        }

	        return new ArrayList<Publicacion>(publicacionesAutor);
	    }

	    public ArrayList<Publicacion> buscar(int ano) {
	        ArrayList<Publicacion> publicacionesAno = new ArrayList<Publicacion>();

	        for (Publicacion p : this.publicaciones) {
	            if (p.getAno() == ano) {
	                publicacionesAno.add(p);
	            }
	        }

	        return publicacionesAno;
	    }

	    public ArrayList<Publicacion> ordenarPorTitulo() {
	        Collections.sort(this.publicaciones);

	        return this.publicaciones;
	    }

	    public ArrayList<Publicacion> ordenarPorAutor() {
	        Comparator<Publicacion> cmp = new Comparator<Publicacion>() {
	            @Override
	            public int compare(Publicacion p1, Publicacion p2) {
	                TreeSet<Autor> autores1 = p1.getAutores();
	                TreeSet<Autor> autores2 = p2.getAutores();
	                Autor autor1 = autores1.isEmpty() ? null : autores1.first();
	                Autor autor2 = autores2.isEmpty() ? null : autores2.first();
	                return autor1 == null ? -1 : autor1.compareTo(autor2);
	            }
	        };

	        Collections.sort(this.publicaciones, cmp);

	        return this.publicaciones;
	    }

	}