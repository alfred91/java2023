package ejercicio5;

import java.util.ArrayList;

public class Biblioteca {
    private Publicacion[] publicaciones;
    private String direccion;
    private int cantidadPublicaciones;
    
    public Biblioteca(int capacidad, String direccion) {
        this.publicaciones = new Publicacion[capacidad];
        this.direccion = direccion;
        this.cantidadPublicaciones = 0;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void adquirirMaterial(Publicacion unaPub) {
        if(cantidadPublicaciones == publicaciones.length) {
            System.out.println("La biblioteca está llena. No se pueden agregar más publicaciones.");
            return;
        }
        
        if(buscar(unaPub.getTitulo()) != null) {
            System.out.println("La publicación ya está en la biblioteca.");
            return;
        }
        
        publicaciones[cantidadPublicaciones] = unaPub;
        cantidadPublicaciones++;
        
        System.out.println("Se ha agregado la publicación a la biblioteca.");
    }
    
    public Publicacion buscar(String titulo) {
        for(int i = 0; i < cantidadPublicaciones; i++) {
            if(publicaciones[i].getTitulo().equals(titulo)) {
                return publicaciones[i];
            }
        }
        System.out.println("La publicación no se encuentra en la biblioteca.");
        return null;
    }
    
    public Publicacion[] buscarPorAutor(String nombre, String apellidos) {
        Publicacion[] publicacionesAutor = new Publicacion[cantidadPublicaciones];
        int cantidadPublicacionesAutor = 0;
                
                
        if(cantidadPublicacionesAutor == 0) {
            System.out.println("No hay publicaciones de este autor en la biblioteca.");
            return null;
        } else {
            Publicacion[] resultado = new Publicacion[cantidadPublicacionesAutor];
            for(int i = 0; i < cantidadPublicacionesAutor; i++) {
                resultado[i] = publicacionesAutor[i];
            }
            return resultado;
        }
    }

	public void prestar(String tituloPrestar) {
		// TODO Auto-generated method stub
		
	}

	public void devolver(String tituloDevolver) {
		// TODO Auto-generated method stub
		
	}
}
